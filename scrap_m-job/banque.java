import java.io.IOException;
import java.sql.Connection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class banque {
    public static void main(String[] args) throws SQLException {
        String baseUrl = "https://www.m-job.ma/recherche/banque-assurance";
        String jdbcUrl = "jdbc:mysql://localhost:3306/avant_tr";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);


        String jdbcUrl2 = "jdbc:mysql://localhost:3306/apres_tr";
        String user2 = "root";
        String password2 = "";
        Connection connection2 = DriverManager.getConnection(jdbcUrl2, user2, password2);
        int totalOffersCount = 0;

        try {
            for (int page = 1; page <= 5; page++) {
                String pageUrl = baseUrl + "?p=" + page;
                Document listPage = Jsoup.connect(pageUrl).get();
                Elements jobLinks = listPage.select("h3.offer-title a");

                for (Element link : jobLinks) {
                    totalOffersCount++;
                    String urloffre = link.absUrl("href");
                    Document jobPage = Jsoup.connect(urloffre).get();

                    // Extract job details
                    String titreemploi = jobPage.select("h1.offer-title").text();
                    String Nomentreprise = jobPage.select("h3").first().text();
                    String typedecontrat = jobPage.select("ul.list-details li:contains(Type de contrat) h3").text();
                    //String salaire = jobPage.select("ul.list-details li:contains(Salaire) h3").text();
                    String Descriptionentreprise = jobPage.select("div.the-content div p").text();
                    String ville = jobPage.select("div.location span").text();

                    // Using alternative methods to select elements
                    Elements headings = jobPage.select("h3.heading");
                    String secteuractivite = "";
                    String metie = "";
                    String  Exeprience = "";
                    String nivetude = "";
                    String lange = "";

                    for (Element heading : headings) {
                        String headingText = heading.text();
                        Element sibling = heading.nextElementSibling();

                        if (headingText.contains("Secteur")) {
                            secteuractivite = sibling.text();
                        } else if (headingText.contains("Métier")) {
                            metie = sibling.text();
                        } else if (headingText.contains("Niveau d'expériences requis")) {
                            Exeprience = sibling.text();
                        } else if (headingText.contains("Niveau d'études exigé")) {
                            nivetude = sibling.text();
                        } else if (headingText.contains("Langue")) {
                            lange = sibling.text();
                        }
                    }

                    //Hard skill
                    List<String> hardSkillsList = Arrays.asList( "Classroom Management", "Curriculum Design", "Lesson Planning",
                            "Student Assessment", "Educational Technology", "E-Learning Platforms",
                            "Pedagogical Techniques", "Subject Matter Expertise", "Student Engagement",
                            "Differentiated Instruction","Customer Service", "Call Handling", "Telephony Systems",
                            "CRM Software", "Ticketing Systems", "Complaint Resolution",
                            "Multilingual Support", "Communication Skills", "Call Quality Monitoring",
                            "Time Management","Risk Management", "Financial Analysis", "Credit Scoring",
                            "Fraud Detection", "Regulatory Compliance", "Banking Software",
                            "Insurance Underwriting", "Investment Banking", "Anti-Money Laundering",
                            "Basel III Compliance","Java", "Python", "C++", "JavaScript", "C#", "Ruby", "Swift", "PHP","HTML/CSS", "React", "Angular", "Vue.js", "Node.js", "Express.js", "RESTful API","SQL" ,"MySQL", "PostgreSQL", "Oracle", "NoSQL" ,"MongoDB", "Cassandra", "Conception de bases de données","Linux","Unix", "Windows Server","TCP/IP", "Routage et commutation", "Configuration de routeurs et de commutateurs","Pare-feu" ,"firewalls", "Cryptographie", "Tests d'intrusion","VMware", "Docker", "Amazon Web Services" ,"AWS", "Microsoft Azure", "Google Cloud Platform" ,"GCP","Configuration et maintenance de serveurs", "Gestion des utilisateurs et des permissions","Jenkins", "GitLab CI", "Travis CI","Android", "Java","Kotlin", "iOS" ,"Swift","Data mining", "Machine learning", "TensorFlow, PyTorch","Scripting" ,"Shell", "PowerShell", "Ansible", "Chef, Puppet","XML, JSON", "GraphQL", "YAML","Agile", "Scrum", "Kanban","UML", "Unified Modeling Language", "Architecture logicielle","Profilage de code", "Optimisation de la performance");
                    List<String> foundHardSkills = new ArrayList<>();

                    for (String hardSkill : hardSkillsList) {
                        if (Descriptionentreprise.contains(hardSkill)) {
                            foundHardSkills.add(hardSkill);
                        }
                    }

                    // Soft skills
                    List<String> softSkillsList = Arrays.asList(
                            "Communication efficace", "Travail d'équipe", "Résolution de problèmes", "Pensée critique", "Adaptabilité",
                            "Gestion du temps", "Organisation", "Créativité", "Leadership", "Capacité à prendre des initiatives",
                            "Résilience", "Empathie", "Collaboration", "Esprit d'analyse", "Gestion du stress", "Prise de décision",
                            "Orientation client", "Capacité à apprendre rapidement", "Flexibilité", "Esprit d'équipe", "Persévérance",
                            "Autonomie", "Sens de l'humour", "Compétences interpersonnelles", "Maîtrise de soi", "Écoute active",
                            "Diplomatie", "Sens de l'éthique", "Positivité", "Conviction", "Gestion des conflits", "Orientation résultats",
                            "Jugement professionnel", "Patience", "Créativité", "Pensée stratégique", "Capacité à inspirer les autres",
                            "Développement personnel", "Esprit critique", "Souci du détail", "Capacité à motiver", "Curiosité intellectuelle",
                            "Sens de l'initiative", "Capacité d'adaptation au changement", "Gestion de projet", "Sens de l'esthétique",
                            "Développement de relations", "Pensée holistique", "Gestion de la diversité", "Présentation orale",
                            "Esprit entrepreneurial", "Sensibilité culturelle", "Intégrité", "Gestion du temps", "Sens de la responsabilité",
                            "Sens de l'urgence", "Créativité artistique", "Collaboration interdisciplinaire", "Communication multiculturelle",
                            "Gestion de crise", "Esprit critique", "Appréciation de la diversité", "Capacité à résoudre des problèmes complexes",
                            "Flexibilité cognitive", "Leadership situationnel", "Gestion du changement", "Vision stratégique", "Tact",
                            "Capacité à influencer", "Appréciation des nuances", "Esprit de négociation", "Gestion du feedback",
                            "Pensée systémique", "Responsabilité sociale", "Capacité à travailler sous pression", "Gestion du conflit d'intérêts",
                            "Prise de perspective", "Pensée analytique", "Gestion du succès", "Résolution créative de problèmes",
                            "Savoir-faire relationnel", "Aptitude à déléguer", "Gestion de l'ambiguïté", "Rédaction", "Capacité à prioriser",
                            "Appréciation de la diversité des talents", "Maîtrise de la technologie", "Esprit de synthèse", "Analyse des données",
                            "Maîtrise de soi émotionnelle", "Sens de l'organisation", "Respect des délais", "Sens de la justice", "Gestion des attentes",
                            "Savoir-faire en résolution de conflits", "Esprit d'entreprise", "Sens de l'observation", "Engagement envers l'apprentissage continu",
                            "Culture de l'amélioration continue", "Capacité à enseigner et à mentorat"
                    );

                    List<String> foundSoftSkills = new ArrayList<>();

                    for (String softSkill : softSkillsList) {
                        if (Descriptionentreprise.contains(softSkill)) {
                            foundSoftSkills.add(softSkill);
                        }
                    }

                    // Print extracted details
                    System.out.println("1. Titre: " + titreemploi);
                    System.out.println("2. URL: " + urloffre);

                    String sitename = "www.m-job.ma";

                    System.out.println("3. Site Name: "+sitename );

                    String datedepublcation = "Null";
                    System.out.println("4. Date de publication: " +datedepublcation);

                    String datedepostule = "Null";
                    System.out.println("5. Date pour postuler: " +datedepostule);

                    String adressebtreprise = "Null";
                    System.out.println("6. Adresse d'entreprise: "+adressebtreprise );

                    String siteentreprise = "Null";
                    System.out.println("7. Site web d'entreprise: "+siteentreprise );




                    String description = "Null";
                    System.out.println("8. Description d'entreprise: "+description );


                    System.out.println("9. Description du poste: " + Descriptionentreprise);

                    String region = "Null";
                    System.out.println("10. Région: "+region );

                    System.out.println("11. Ville: " + ville);

                    System.out.println("12. Secteur d'activité: " + secteuractivite);

                    System.out.println("13. Métier: " + metie);

                    System.out.println("14. Type du contrat: " + typedecontrat);

                    if (!nivetude.isEmpty()) {
                        System.out.println("15. Niveau d'études: " + nivetude);
                    } else {
                        System.out.println("15. Niveau d'études: Null");
                        nivetude = "Null"; // Set nivetude to "Null"
                    }

                    String diplomeAsString = "Null";
                    System.out.println("16. Spécialité/ Diplôme: " + diplomeAsString);

                    System.out.println("17. Expérience: " +  Exeprience);

                    String Profilrecherche = "Null";
                    System.out.println("18. Profil recherché: " +Profilrecherche );

                    String PERSONSKILLSAsString = "Null";
                    System.out.println("19. Traits de personnalité: "+PERSONSKILLSAsString );

                    if (!foundHardSkills.isEmpty()) {
                        System.out.println("20. Compétences requises (hard skills): " + String.join(", ", foundHardSkills));
                    } else {
                        System.out.println("20. Compétences requises (hard skills): Null");
                        foundHardSkills.add("Null"); // Add "Null" to the list
                    }

                    // Print soft skills or "Null" if not found
                    if (!foundSoftSkills.isEmpty()) {
                        System.out.println("21. Soft Skills: " + String.join(", ", foundSoftSkills));
                    } else {
                        System.out.println("21. Soft Skills: Null");
                        foundSoftSkills.add("Null"); // Add "Null" to the list
                    }

                    String competence = "Null";
                    System.out.println("22. Compétences recommandées: " +competence);


                    System.out.println("23. Langue: " + lange);

                    String niveau = "Null";
                    System.out.println("24. Niveau de la langue: " +niveau);
                    String salaire = "Null";
                    System.out.println("25. Salaire: " + salaire);

                    String foundAvantagesString = "Null";
                    System.out.println("26. Avantages sociaux: "+foundAvantagesString );

                    String teletravail="Null";
                    System.out.println("27. Télétravail: "+teletravail );

                    System.out.println("28. Nom d'entreprise: " + Nomentreprise);


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


                        preparedStatement.setString(16, diplomeAsString);

                        preparedStatement.setString(17, Exeprience);
                        preparedStatement.setString(18, Profilrecherche);

                        preparedStatement.setString(19, PERSONSKILLSAsString);

                        String foundHardSkillsString = String.join(",", foundHardSkills);
                        preparedStatement.setString(20, foundHardSkillsString);

                        String foundSoftSkillsString = String.join(",", foundSoftSkills);
                        preparedStatement.setString(21, foundSoftSkillsString);

                        preparedStatement.setString(22, competence);
                        preparedStatement.setString(23, lange);
                        preparedStatement.setString(24, niveau);
                        preparedStatement.setString(25, salaire);


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


                        preparedStatement.setString(16, diplomeAsString);

                        preparedStatement.setString(17, Exeprience);
                        preparedStatement.setString(18, Profilrecherche);


                        preparedStatement.setString(19, PERSONSKILLSAsString);

                        String foundHardSkillsString = String.join(",", foundHardSkills);
                        preparedStatement.setString(20, foundHardSkillsString);

                        String foundSoftSkillsString = String.join(",", foundSoftSkills);
                        preparedStatement.setString(21, foundSoftSkillsString);

                        preparedStatement.setString(22, competence);
                        preparedStatement.setString(23, lange);
                        preparedStatement.setString(24, niveau);
                        preparedStatement.setString(25, salaire);


                        preparedStatement.setString(26, foundAvantagesString);


                        preparedStatement.setString(27, teletravail);

                        preparedStatement.setString(28, Nomentreprise);




                        // Exécuter la requête d'insertion
                        preparedStatement.executeUpdate();
                    }













                    System.out.println("**************************");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close your database connections...
        }
    }
}
