package projetmoumen;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ca {
    public static void main(String[] args) throws IOException, SQLException {
        String url = "https://www.emploi.ma/recherche-jobs-maroc/centre%2520d%2527appel";
      //  sql connect
        String jdbcUrl = "jdbc:mysql://localhost:3306/avant_tr";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        
        
        String jdbcUrl2 = "jdbc:mysql://localhost:3306/apres_tr";
        String user2 = "root";
        String password2 = "";
        Connection connection2 = DriverManager.getConnection(jdbcUrl2, user2, password2);

        try {
           //Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            Document document = Jsoup.connect(url).get();
            Elements h5Elements = document.select(".row h5");

            for (Element h5Element : h5Elements) {
                Element annonceLink = h5Element.select("a").first();
                String annonceUrl = annonceLink.attr("abs:href");
                //System.out.println(annonceUrl);
                
                Document urlpage = Jsoup.connect(annonceUrl).get();
                // System.out.println("Connected to: " + annonceUrl);
                
                //extraire titre
                Elements Titre = urlpage.select("h1.title");
                //System.out.println("Titre: " + Titre);
                String titreemploi = Titre.text();
                if(titreemploi.isEmpty()) {titreemploi="Null";}
                System.out.println("Titre: " + titreemploi);
                
                //extraire URL
                String urloffre = annonceUrl;
                System.out.println("url: " + urloffre);
                
                //Site Name
                String sitename = "www.emploi.ma";
                System.out.println("Site Name: " + sitename);
                
                //Date de publication
                Elements dp = urlpage.select("div.job-ad-publication-date");
               // System.out.println("Titre: " + dp);
                String datedepublcation = dp.text();
                if(datedepublcation.isEmpty()){datedepublcation="Null";}
                System.out.println("Titre: " + datedepublcation);
                
                //Date pour postuler
                String datedepostule = "Null";
                if(datedepostule.isEmpty()) {datedepostule="Null";}
                System.out.println("date de postule: " + datedepostule );
                
                
              //ville
                Elements nnb = urlpage.select("td:contains(Ville) + td");
                //System.out.println("ville: " + nn);
                String ville = nnb.text();
                if(ville.isEmpty()) {ville="Null";}
                System.out.println("ville :"+ ville);
                
                //Adresse entreprise
                String adressebtreprise = ville;
                if(adressebtreprise.isEmpty()) {adressebtreprise="Null";}
                System.out.println("Adresse entreprise: " + adressebtreprise );
                
                //Site web entreprise
                Elements st = urlpage.select("td.website-url a");
                //System.out.println("site web entreprise: " + st);
                String siteentreprise = st.attr("href").trim();
                if(siteentreprise.isEmpty()) {siteentreprise="Null";}
                System.out.println("site de l'entreprise: " + siteentreprise);
                
                //Nom entreprise
                Elements et = urlpage.select("div.company-title");
                //System.out.println("Nom entreprise: " + et);
                String Nomentreprise = et.text();
                if(Nomentreprise.isEmpty()) {Nomentreprise="Null";}
                System.out.println("Nom entreprise: " + Nomentreprise);
                
                //Description entreprise
                Elements ut = urlpage.select("div.job-ad-company-description");
               // System.out.println("Description entreprise: " + ut);
                String Descriptionentreprise = ut.text().trim();
                if(Descriptionentreprise.isEmpty()) {Descriptionentreprise="Null";}
                System.out.println("Description entreprise: " + Descriptionentreprise);
                
                //descripion du poste 
                Elements dpp = urlpage.select(".ad-ss-title + p");
                // System.out.println("descripion du poste: " + dpp);
                String description = dpp.text().trim();
                if (description.isEmpty()) {description="Null";}
                System.out.println("Description entreprise: " + description);
                 
                
                
                //Région
                Elements nn = urlpage.select("td:containsOwn(Région) + td div.field-item");
                //System.out.println("Regon: " + nn);
                String region = nn.text().trim();
                if(region.isEmpty()) {region="Null";}
                System.out.println("region: " + region);
                
                
                
                //Secteur activité
                Elements sc = urlpage.select("td.sector-label:containsOwn(Secteur d´activité) + td div.field-item");
                //System.out.println("Regon: " + nn);
                String secteuractivite = sc.text().trim();
                if(secteuractivite.isEmpty()) {secteuractivite="Null";}
                System.out.println("secteur activite: " + secteuractivite);
                
                //Métier
                Elements p = urlpage.select("td.first-cell:contains(Métier) + td div.field-item");
                //System.out.println("Regon: " + nn);
                String metie = p.text().trim();
                if(metie.isEmpty()) {metie="Null";}
                System.out.println("Metie :"+metie);
                
                //Type du contrat
                Elements tpc = urlpage.select("td:contains(Type de contrat) + td div.field-item");
                //System.out.println("Regon: " + nn);
                String typedecontrat = tpc.text().trim();
                if(typedecontrat.isEmpty()) {typedecontrat="Null";}
                System.out.println("type de contrat :"+typedecontrat);
                
                
                //Niveau d'études
                Elements nic = urlpage.select("td:contains(Niveau d\\'études) + td div.field-item");
               // System.out.println("Niveau d'études: " + nic);
                String nivetude = nic.text().trim();
                if(nivetude.isEmpty()) {nivetude="Null";}
                System.out.println("Niveau d'études: " + nivetude);
                
                //Spécialité/ Diplôme???
                
                String diplome =nivetude ;
                if(diplome.isEmpty()) {diplome="Null";}
                /*List<String> diplome = Arrays.asList("Bac+2","bac+3","bac+4","bac+5","master","licence","doctorat");
                String pagediplom = urlpage.text();
                Set<String> foundDiplome = new HashSet<>();

                for (String word : pagediplom.split("\\s+")) {
                    // You can adjust this based on case sensitivity and special characters
                    String cleanedWord = word.replaceAll("[^a-zA-Z]", "");

                    if (diplome.contains(cleanedWord)) {
                        foundDiplome.add(cleanedWord);
                    }
                }

                if (foundDiplome.isEmpty()) {
                    System.out.println("diplome: -");
                    foundDiplome.add("Null");
                } else {
                    System.out.println("Found diploma levels: " + foundDiplome);
                }*/
                /*boolean founddiplome = false;
                for (String word : pagediplom.split("\\s+")) {
                    String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
                    
                    if (diplome.contains(cleanedWord)) {
                        System.out.print("diplome :"+cleanedWord + " ");
                        founddiplome = true;
                    }
                                      
                }
                if (!founddiplome) {
                    System.out.println("diplome :"+"-");
                }
                
                
                
                */
                //Expérience
                Elements exp = urlpage.select("td:contains(Niveau d\\'expérience ) + td div.field-item");
                // System.out.println("Niveau d'études: " + nic);
                 String Exeprience = exp.text().trim();
                 if(Exeprience.isEmpty()) {Exeprience="Null";}
                 System.out.println("Expérience : " + Exeprience);
                
                             
                //Profil recherché
                Elements uv = urlpage.select(".ad-ss-title +  ul");
                String Profilrecherche= uv.text();
                if(Profilrecherche.isEmpty()) {Profilrecherche="Null";}
                System.out.println("Profil recherché: " + Profilrecherche);
                
                //Traits de personnalité
                List<String> persona = Arrays.asList(
                		"Autonomie",
                		" capacité à être force de proposition",
                		" humilité ",
                	    "Communication efficace",
                        "Travail d'équipe",
                        "Résolution de problèmes",
                        "Adaptabilité",
                        "Gestion du temps",
                        "Esprit critique",
                        "Leadership",
                        "Gestion du stress",
                        "Prise de décision",
                        "Créativité",
                        "Empathie",
                        "Collaboration",
                        "Pensée analytique",
                        "Gestion des conflits",
                        "Orientation client",
                        "Autorégulation",
                        "Initiative",
                        "Persévérance",
                        "Positivité",
                        "Capacité à apprendre rapidement",
                        "Confiance en soi"
                );
                
                String pageperso = urlpage.text();
                Set<String> foundPersonaSkills = new HashSet<>();

                for (String word : pageperso.split("\\s+")) {
                    // You can adjust this based on case sensitivity and special characters
                    String cleanedWords = word.replaceAll("[^a-zA-Z]", "");

                    if (persona.contains(cleanedWords)) {
                        foundPersonaSkills.add(cleanedWords);
                    }
                }

                if (foundPersonaSkills.isEmpty()) {
                    System.out.println("soft skills: -");
                    foundPersonaSkills.add("Null");
                } else {
                    System.out.println("Found persona skills: " + foundPersonaSkills);
                }
                /*boolean foundperso = false;
                for (String word : pageperso.split("\\s+")) {
                    // Vous pouvez ajuster cela en fonction de la casse et des caractères spéciaux
                    String cleanedWords = word.replaceAll("[^a-zA-Z]", "");
                    
                    if (persona.contains(cleanedWords)) {
                        System.out.print("soft skills :"+cleanedWords + " ");
                        foundperso = true;
                    }
                                      
                }
                if (!foundperso) {
                    System.out.println("soft skills :"+"-");
                }
                */
                
                //hard skills
                List<String> hardSkillsList = Arrays.asList(
                		"téléphoniques ","efficace des systèmes téléphoniques ","systèmes téléphoniques"," système de gestion des relations clients"," gestion des relations clients","CRM","les logiciels de ticketing"
                		," Microsoft Office","Word","Excel","Rapidité ","précision ","Rapidité et précision dans la saisie","saisie de données"
                		,"Techniques de vente","cross-selling","up-selling"," bases de données clients"
                		," appels téléphoniques"," plusieurs langues ","langues","résoudre des problèmes techniques"

                		,"des problèmes techniques","marketing","maîtrise des appels","systèmes d'exploitation","service client","analyser des données");
                String pageText = urlpage.text();
                Set<String> foundHardSkills = new HashSet<>();

                
                for (String word : pageText.split("\\s+")) {
                    // You can adjust this based on case sensitivity and special characters
                    String cleanedWord = word.replaceAll("[^a-zA-Z]", "");

                    if (hardSkillsList.contains(cleanedWord)) {
                        foundHardSkills.add(cleanedWord);
                    }
                }

                if (foundHardSkills.isEmpty()) {
                    System.out.println("hard skills: -");
                    foundHardSkills.add("Null");
                } else {
                    System.out.println("Found hard skills: " + foundHardSkills);
                }

                /*
                boolean foundHardSkills = false;
                for (String word : pageText.split("\\s+")) {
                    // Vous pouvez ajuster cela en fonction de la casse et des caractères spéciaux
                    String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
                    
                    if (hardSkillsList.contains(cleanedWord)) {
                        System.out.print("hard skills :"+cleanedWord + " ");
                        foundHardSkills = true;
                    }
                                      
                }
                if (!foundHardSkills) {
                    System.out.println("hard skills :"+"-");
                }*/
                //soft skills
                List<String> softSkillsList = Arrays.asList(
                		"Autonomie",
                		" capacité à être force de proposition",
                		" humilité ",
                	    "Communication efficace",
                        "Travail d'équipe",
                        "Résolution de problèmes",
                        "Adaptabilité",
                        "Gestion du temps",
                        "Esprit critique",
                        "Leadership",
                        "Gestion du stress",
                        "Prise de décision",
                        "Créativité",
                        "Empathie",
                        "Collaboration",
                        "Pensée analytique",
                        "Gestion des conflits",
                        "Orientation client",
                        "Autorégulation",
                        "Initiative",
                        "Persévérance",
                        "Positivité",
                        "Capacité à apprendre rapidement",
                        "Confiance en soi"
                );
                String pagesText = urlpage.text();
                Set<String> foundSoftSkills = new HashSet<>();

               
                for (String word : pagesText.split("\\s+")) {
                    // You can adjust this based on case sensitivity and special characters
                    String cleanedWords = word.replaceAll("[^a-zA-Z]", "");

                    if (softSkillsList.contains(cleanedWords)) {
                        foundSoftSkills.add(cleanedWords);
                    }
                }

                if (foundSoftSkills.isEmpty()) {
                    System.out.println("soft skills : -");
                    foundSoftSkills.add("Null");
                } else {
                    System.out.println("Found soft skills: " + foundSoftSkills);
                }

                /*
                String pagesText = urlpage.text();
                boolean foundsoftSkills = false;
                for (String word : pagesText.split("\\s+")) {
                    // Vous pouvez ajuster cela en fonction de la casse et des caractères spéciaux
                    String cleanedWords = word.replaceAll("[^a-zA-Z]", "");
                    
                    if (softSkillsList.contains(cleanedWords)) {
                        System.out.print("soft skills :"+cleanedWords + " ");
                        foundsoftSkills = true;
                    }
                                      
                }
                if (!foundsoftSkills) {
                    System.out.println("soft skills :"+"-");
                }*/
                
                //23.	Compétences recommandées
                Elements cmr = urlpage.select("td:contains(Compétences clés) + td div.field-item");
                // System.out.println("Niveau d'études: " + nic);
                String competence = cmr.text().trim();
                if(competence.isEmpty()) {competence="Null";}
                System.out.println("Compétences recommandées : " + competence);
                 
                 //24.	Langue
                  Elements langee = urlpage.select("span.lineage-item-level-0");
                  //System.out.println(" langue: " + niveaulange);
                  String lange = langee.text().trim();
                  if(lange.isEmpty()) {lange="Null";}
                  System.out.println("Langue: " + lange);
                  
                  //25.	Niveau de la langue
                  Elements niveauu = urlpage.select("span.lineage-item-level-1");
                  //System.out.println(" langue: " + niveaulange);
                  String niveau = niveauu.text().trim();
                  if(niveau.isEmpty()) {niveau="Null";}
                  System.out.println("niveau Langue: " + niveau);
                  
                  
                  
                  //sailre
                  String salaire = "Null";
                  System.out.println("salaire: " + salaire);
                  
                  /*List<String> salaire = Arrays.asList(
                  		"salaire ","dhs"
                  );
                  String pagesalaire = urlpage.text();
                  boolean foundsalaire = false;
                  for (String word : pagesalaire.split("\\s+")) {
                      String cleanedWords = word.replaceAll("[^a-zA-Z]", "");
                      
                      if (salaire.contains(cleanedWords)) {
                         System.out.print("salaire :"+cleanedWords + " ");
                          foundsalaire = true;
                      }
                                        
                  }
                  if (!foundsalaire) {
                      System.out.println("salaire :"+"-");
                  }*/
                  
                  //Avantages sociaux
                  List<String> avantages = Arrays.asList(
                    		"Assurance santé ","Congés payés","Retraite d'entreprise","Programmes de bien-être",
                    		"Assurance dentaire et visuelle","Assurance vie et assurance décès",
                    		"Congés de maternité et de paternité","Congés familiaux",
                    		"Formation et développement professionnel","Remboursement des frais de scolarité",
                    		"Prime de performance","Horaires de travail flexibles",
                    		"Assurance invalidité","Assurance voyage","Rabais et avantages supplémentaires"
                    		
                    );
                  Set<String> foundAvantages = new HashSet<>();

                  
                  String pageavantage = urlpage.text();
                  for (String word : pageavantage.split("\\s+")) {
                      String cleanedWords = word.replaceAll("[^a-zA-Z]", "");

                      if (avantages.contains(cleanedWords)) {
                          foundAvantages.add(cleanedWords);
                      }
                  }
                  if (foundAvantages.isEmpty()) {
                      System.out.println("avantages : -");
                      foundAvantages.add("Null");
                  } else {
                      System.out.println("Found avantages: " + foundAvantages);
                  }

                   /* String pageavantage = urlpage.text();
                    boolean foundavanatage = false;
                    for (String word : pageavantage.split("\\s+")) {
                        String cleanedWords = word.replaceAll("[^a-zA-Z]", "");
                        
                        if (avantages.contains(cleanedWords)) {
                           System.out.print("salaire :"+cleanedWords + " ");
                           foundavanatage = true;
                        }
                                          
                    }
                    if (!foundavanatage) {
                        System.out.println("avantages :"+"-");
                    }*/
                    //teletravail
                  List<String> telet = Arrays.asList("Télétravail","Travail En Remote","travail à distance");
                  String pageatele = urlpage.text();
                  boolean foundtele = false;

                  for (String word : pageatele.split("\\s+")) {
                      String cleanedWords = word.replaceAll("[^a-zA-Z]", "");

                      if (telet.contains(cleanedWords)) {
                          foundtele = true;
                          break;  // No need to continue checking once found
                      }
                  }

                  // Store the result as a String
                  String teletravail = foundtele ? "oui" : "non";
                  System.out.println("teletravail : " + teletravail);
                    
                    ///insert
                   String insertQuery = "INSERT INTO java (titre,url,sitename,datedepublication,datedepostule,adressdelentreprise,sitewebdentreprise,descriptiondelentreprise,descriptiondeposte,region,ville,secteurdactivite,metier,typedecontrat,niveaudetude,diplome,experience,profilerecherche,traitsdepersonnalite,hardskills,softskills,competencerecommandees,langue,niveaudelalangue,salaire,avantagesociaux,teletravail,nomdentreprise) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                   try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                        
                	   preparedStatement.setString(1, titreemploi);
                       preparedStatement.setString(2, urloffre);
                       preparedStatement.setString(3, sitename);
                       preparedStatement.setString(4, datedepublcation);
                       preparedStatement.setString(5, datedepostule);
                       preparedStatement.setString(6, adressebtreprise);
                       preparedStatement.setString(7, siteentreprise);
                       preparedStatement.setString(8, Descriptionentreprise);
                       preparedStatement.setString(9, description);
                       preparedStatement.setString(10, region);
                       preparedStatement.setString(11, ville);
                       preparedStatement.setString(12, secteuractivite);
                       preparedStatement.setString(13, metie);
                       preparedStatement.setString(14, typedecontrat);
                       preparedStatement.setString(15, nivetude);
                       
                      // String diplomeAsString = String.join(",", foundDiplome);
                       preparedStatement.setString(16, diplome);
                       
                       preparedStatement.setString(17, Exeprience);
                       preparedStatement.setString(18, Profilrecherche);
                       
                       String PERSONSKILLSAsString = String.join(",", foundPersonaSkills);
                       preparedStatement.setString(19, PERSONSKILLSAsString);
                       
                       String foundHardSkillsString = String.join(",", foundHardSkills);
                       preparedStatement.setString(20, foundHardSkillsString);
                       
                       String foundSoftSkillsString = String.join(",", foundSoftSkills);
                       preparedStatement.setString(21, foundSoftSkillsString);
                       
                       preparedStatement.setString(22, competence);
                       preparedStatement.setString(23, lange);
                       preparedStatement.setString(24, niveau);
                       preparedStatement.setString(25, salaire);
                       
                       String foundAvantagesString = String.join(",", foundAvantages);
                       preparedStatement.setString(26, foundAvantagesString);
                       
                       String teletravailString = String.join(",", teletravail);
                       preparedStatement.setString(27, teletravail);
                       preparedStatement.setString(28, Nomentreprise);
                       
                       
                            

                            // Exécuter la requête d'insertion
                            preparedStatement.executeUpdate();
                        }
                   String insertQuery2 = "INSERT INTO java2 (titre,url,sitename,datedepublication,datedepostule,adressdelentreprise,sitewebdentreprise,descriptiondelentreprise,descriptiondeposte,region,ville,secteurdactivite,metier,typedecontrat,niveaudetude,diplome,experience,profilerecherche,traitsdepersonnalite,hardskills,softskills,competencerecommandees,langue,niveaudelalangue,salaire,avantagesociaux,teletravail,nomdentreprise) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                   try (PreparedStatement preparedStatement = connection2.prepareStatement(insertQuery2)) {
                        
                	   preparedStatement.setString(1, titreemploi);
                       preparedStatement.setString(2, urloffre);
                       preparedStatement.setString(3, sitename);
                       preparedStatement.setString(4, datedepublcation);
                       preparedStatement.setString(5, datedepostule);
                       preparedStatement.setString(6, adressebtreprise);
                       preparedStatement.setString(7, siteentreprise);
                       preparedStatement.setString(8, Descriptionentreprise);
                       preparedStatement.setString(9, description);
                       preparedStatement.setString(10, region);
                       preparedStatement.setString(11, ville);
                       preparedStatement.setString(12, secteuractivite);
                       preparedStatement.setString(13, metie);
                       preparedStatement.setString(14, typedecontrat);
                       preparedStatement.setString(15, nivetude);
                       
                       //String diplomeAsString = String.join(",", foundDiplome);
                       preparedStatement.setString(16, diplome);
                       
                       preparedStatement.setString(17, Exeprience);
                       preparedStatement.setString(18, Profilrecherche);
                       
                       String PERSONSKILLSAsString = String.join(",", foundPersonaSkills);
                       preparedStatement.setString(19, PERSONSKILLSAsString);
                       
                       String foundHardSkillsString = String.join(",", foundHardSkills);
                       preparedStatement.setString(20, foundHardSkillsString);
                       
                       String foundSoftSkillsString = String.join(",", foundSoftSkills);
                       preparedStatement.setString(21, foundSoftSkillsString);
                       
                       preparedStatement.setString(22, competence);
                       preparedStatement.setString(23, lange);
                       preparedStatement.setString(24, niveau);
                       preparedStatement.setString(25, salaire);
                       
                       String foundAvantagesString = String.join(",", foundAvantages);
                       preparedStatement.setString(26, foundAvantagesString);
                       
                       String teletravailString = String.join(",", teletravail);
                       preparedStatement.setString(27, teletravail);
                       preparedStatement.setString(28, Nomentreprise);
                       
                       
                            

                            // Exécuter la requête d'insertion
                            preparedStatement.executeUpdate();
                        }
                  
                  
                  

                
                
                
                System.out.println("*******************************************************\n");
                
                
                
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    }