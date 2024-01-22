package projetmoumen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pretr {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/apres_tr";
        String utilisateur = "root";
        String motDePasse = "";

        try {
            Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            //site name
            String nullsitename = "UPDATE java2 SET sitename = 0";
            PreparedStatement nullsitenam = connexion.prepareStatement(nullsitename);
            int l12 = nullsitenam.executeUpdate();
            
            
            // Titre
            String sql0 = "UPDATE java2 SET titre = LOWER(titre)";
            PreparedStatement preparedStatement0 = connexion.prepareStatement(sql0);
            int lignesModifiees0 = preparedStatement0.executeUpdate();
            
            String nulltitre = "UPDATE java2 SET titre = 0";
            PreparedStatement titree = connexion.prepareStatement(nulltitre);
            int l = titree.executeUpdate();
            
            //url
            String nullurl = "UPDATE java2 SET url = 0";
            PreparedStatement urlll = connexion.prepareStatement(nullurl);
            int uuuurll = urlll.executeUpdate();
            
         // adresss entreprise
            String sql2 = "UPDATE java2 SET adressdelentreprise = LOWER(adressdelentreprise)";
            PreparedStatement preparedStatement2 = connexion.prepareStatement(sql2);
            int lignesModifiees2 = preparedStatement2.executeUpdate();
            
           
            
            // nom entreprise
            String sql3 = "UPDATE java2 SET nomdentreprise = LOWER(nomdentreprise)";
            PreparedStatement preparedStatement3 = connexion.prepareStatement(sql3);
            int lignesModifiees3 = preparedStatement3.executeUpdate();
            
            String nomdentreprise = "UPDATE java2 SET nomdentreprise = 0";
            PreparedStatement nomdentrepris = connexion.prepareStatement(nomdentreprise);
            int sal96 = nomdentrepris.executeUpdate();
            
            
         // descriptiondelentreprise
            String sql4 = "UPDATE java2 SET descriptiondelentreprise = LOWER(descriptiondelentreprise)";
            PreparedStatement preparedStatement4 = connexion.prepareStatement(sql4);
            int lignesModifiees4 = preparedStatement4.executeUpdate();
            
            String descriptiondelentreprise = "UPDATE java2 SET descriptiondelentreprise = 0";
            PreparedStatement descriptiondelentrepri = connexion.prepareStatement(descriptiondelentreprise);
            int l00 = descriptiondelentrepri.executeUpdate();

            // description du poste
            String sql5 = "UPDATE java2 SET descriptiondeposte = LOWER(descriptiondeposte)";
            PreparedStatement preparedStatement5 = connexion.prepareStatement(sql5);
            int lignesModifiees5 = preparedStatement5.executeUpdate();
            
            String nulldp = "UPDATE java2 SET descriptiondeposte = 0";
            PreparedStatement nulldpp = connexion.prepareStatement(nulldp);
            int l89 = nulldpp.executeUpdate();
            
            

         // region
            String sql6 = "UPDATE java2 SET region = LOWER(region)";
            PreparedStatement preparedStatement6 = connexion.prepareStatement(sql6);
            int lignesModifiees6 = preparedStatement6.executeUpdate();
            
            //casablanca-mohammedia - rabat-salé-kénitra
            String rc = "UPDATE java2 SET region = '5' WHERE region = 'casablanca-mohammedia - rabat-salé-kénitra'";
            PreparedStatement p5 = connexion.prepareStatement(rc);
            int r5 = p5.executeUpdate();
            
            //dakhla
            String da = "UPDATE java2 SET region = '6' WHERE region = 'dakhla'";
            PreparedStatement p6 = connexion.prepareStatement(da);
            int r6 = p6.executeUpdate();
            
            //agadir
            String ag = "UPDATE java2 SET region = '7' WHERE region = 'agadir'";
            PreparedStatement p7 = connexion.prepareStatement(ag);
            int r7 = p7.executeUpdate();
            
            //fès
            String fes = "UPDATE java2 SET region = '8' WHERE region = 'fès'";
            PreparedStatement p8 = connexion.prepareStatement(fes);
            int r8 = p8.executeUpdate();
            
            //béni mellal-khénifra
            String bm = "UPDATE java2 SET region = '9' WHERE region = 'béni mellal-khénifra'";
            PreparedStatement p9 = connexion.prepareStatement(bm);
            int r9 = p9.executeUpdate();
            
            //settat
           String se = "UPDATE java2 SET region = '10' WHERE region = 'settat'";
            PreparedStatement p10 = connexion.prepareStatement(se);
            int r10 = p10.executeUpdate();
            
            //laâyoune
            String laa = "UPDATE java2 SET region = '11' WHERE region = 'laâyoune'";
            PreparedStatement p11 = connexion.prepareStatement(laa);
            int r11 = p11.executeUpdate();
            
//            /international
            String international = "UPDATE java2 SET region = '12' WHERE region = 'international'";
            PreparedStatement p12 = connexion.prepareStatement(international);
            int r12 = p12.executeUpdate();
            
            String abkc = "UPDATE java2 SET region = '13' WHERE region = 'agadir - béni mellal-khénifra - casablanca-mohammedia - dakhla - errachidia - fès - guelmim - laâyoune - marrakech-safi - meknès - oujda - rabat-salé-kénitra - settat - tanger-tétouan-al hoceïma'";
            PreparedStatement p13 = connexion.prepareStatement(abkc);
            int r13 = p13.executeUpdate();
            
            String abkggc = "UPDATE java2 SET region = '14' WHERE region = 'agadir - béni mellal-khénifra - casablanca-mohammedia - dakhla - errachidia - fès - guelmim - laâyoune - marrakech-safi - meknès - oujda - rabat-salé-kénitra - settat - tanger-tétouan-al hoceïma - international' ";
            PreparedStatement p14 = connexion.prepareStatement(abkggc);
            int r14 = p14.executeUpdate();
            
            String abkgc = "UPDATE java2 SET region = '14' WHERE region = 'casablanca-mohammedia - marrakech-safi - rabat-salé-kénitra' ";
            PreparedStatement p15 = connexion.prepareStatement(abkgc);
            int r15 = p15.executeUpdate();

            

            


            
            //casablanca-mohammedia
            String casa = "UPDATE java2 SET region = '1' WHERE region = 'casablanca-mohammedia'";
            PreparedStatement p2 = connexion.prepareStatement(casa);
            int r2 = p2.executeUpdate();
          //rabat-salé-kénitra
            String rabat = "UPDATE java2 SET region = '2' WHERE region = 'rabat-salé-kénitra'";
            PreparedStatement p3 = connexion.prepareStatement(rabat);
            int r3 = p3.executeUpdate();
            //marrakech-safi
            String mar = "UPDATE java2 SET region = '3' WHERE region = 'marrakech-safi'";
            PreparedStatement p4 = connexion.prepareStatement(mar);
            int r4 = p4.executeUpdate();
            
            //tanger 
            String tanger = "UPDATE java2 SET region = '4' WHERE region = 'tanger-tétouan-al hoceïma'";
            PreparedStatement p1 = connexion.prepareStatement(tanger);
            int r1 = p1.executeUpdate();
            
            // ville
            String sql7 = "UPDATE java2 SET ville = LOWER(ville)";
            PreparedStatement preparedStatement7 = connexion.prepareStatement(sql7);
            int lignesModifiees7 = preparedStatement7.executeUpdate();
            
         // secteurdactivite
            String sql8 = "UPDATE java2 SET secteurdactivite = LOWER(secteurdactivite)";
            PreparedStatement preparedStatement8 = connexion.prepareStatement(sql8);
            int lignesModifiees8 = preparedStatement8.executeUpdate();
            
            String secac = "UPDATE java2 SET secteurdactivite = '1' WHERE secteurdactivite = 'informatique, ssii, internet intérim, recrutement banque, assurance, finances conseil, audit, comptabilité télécom' or secteurdactivite='informatique, ssii, internet intérim, recrutement banque, assurance, finances marketing, communication, médias recherche et développement' or secteurdactivite='informatique, ssii, internet'or secteurdactivite='informatique, ssii, internet ingénierie, études développement intérim, recrutement conseil, audit, comptabilité' or secteurdactivite='informatique, ssii, internet services autres' or secteurdactivite='informatique, ssii, internet intérim, recrutement'";
            PreparedStatement s1 = connexion.prepareStatement(secac);
            int S1 = s1.executeUpdate();
            
            String secac2 = "UPDATE java2 SET secteurdactivite = '2' WHERE secteurdactivite = 'éducation, formation'";
            PreparedStatement s2 = connexion.prepareStatement(secac2);
            int S2 = s2.executeUpdate();
            
            String secac3 = "UPDATE java2 SET secteurdactivite = '3' WHERE secteurdactivite = 'ingénierie, études développement services autres'";
            PreparedStatement s3 = connexion.prepareStatement(secac3);
            int S3 = s3.executeUpdate();
            

            String secac4 = "UPDATE java2 SET secteurdactivite = '4' WHERE secteurdactivite = 'services autres'";
            PreparedStatement s4 = connexion.prepareStatement(secac4);
            int S4 = s4.executeUpdate();
            
            String secac5 = "UPDATE java2 SET secteurdactivite = '5' WHERE secteurdactivite = 'intérim, recrutement'";
            PreparedStatement s5 = connexion.prepareStatement(secac5);
            int S5 = s5.executeUpdate();
            
            String secac0 = "UPDATE java2 SET secteurdactivite = '0' WHERE secteurdactivite = 'null'";
            PreparedStatement s0 = connexion.prepareStatement(secac0);
            int S0 = s0.executeUpdate();
            
            String secac6 = "UPDATE java2 SET secteurdactivite = '6' WHERE secteurdactivite = 'conseil, audit, comptabilité' or secteurdactivite='banque, assurance, finances conseil, audit, comptabilité' or secteurdactivite='banque, assurance, finances'";
            PreparedStatement s6 = connexion.prepareStatement(secac6);
            int S6 = s6.executeUpdate();
            
            String secac7 = "UPDATE java2 SET secteurdactivite = '7' WHERE secteurdactivite = 'chimie, pétrochimie, matières premières, mines qualité, méthodes services aéroportuaires et maritimes services autres'";
            PreparedStatement s7 = connexion.prepareStatement(secac7);
            int S7 = s7.executeUpdate();
            
            
            String secac8 = "UPDATE java2 SET secteurdactivite = '8' WHERE secteurdactivite = 'industrie, production, fabrication, autres agriculture, pêche, aquaculture agroalimentaire produits de grande consommation import, export' or secteurdactivite='industrie, production, fabrication, autres'or secteurdactivite='industrie pharmaceutique' or secteurdactivite='industrie, production, fabrication, autres hôtellerie, restauration industrie pharmaceutique'";
            PreparedStatement s8 = connexion.prepareStatement(secac8);
            int S8 = s8.executeUpdate();
            
            String secac9 = "UPDATE java2 SET secteurdactivite = '9' WHERE secteurdactivite = 'santé, pharmacie, hôpitaux, équipements médicaux'";
            PreparedStatement s9 = connexion.prepareStatement(secac9);
            int S9 = s9.executeUpdate();
            
            String secac10 = "UPDATE java2 SET secteurdactivite = '10' WHERE secteurdactivite = 'distribution, vente, commerce de gros' or secteurdactivite='distribution, vente, commerce de gros édition, imprimerie éducation, formation'";
            PreparedStatement s10 = connexion.prepareStatement(secac10);
            int S10 = s10.executeUpdate();
            
            String secac11 = "UPDATE java2 SET secteurdactivite = '11' WHERE secteurdactivite = 'ameublement, décoration btp, construction immobilier, architecture, urbanisme'";
            PreparedStatement s11 = connexion.prepareStatement(secac11);
            int S11 = s11.executeUpdate();
            
            String secac12 = "UPDATE java2 SET secteurdactivite = '12' WHERE secteurdactivite = 'agriculture, pêche, aquaculture agroalimentaire'";
            PreparedStatement s12 = connexion.prepareStatement(secac12);
            int S12 = s12.executeUpdate();
            
            String secac13 = "UPDATE java2 SET secteurdactivite = '13' WHERE secteurdactivite = 'marketing, communication, médias centres d´appel, hotline, call center conseil, audit, comptabilité'";
            PreparedStatement s13 = connexion.prepareStatement(secac13);
            int S13 = s13.executeUpdate();
            /*String secteurdactivitenull = "UPDATE java2 SET secteurdactivite = 0";
            PreparedStatement secteur = connexion.prepareStatement(secteurdactivitenull);
            int l19 = secteur.executeUpdate();*/
            

         // metier
            String sql9 = "UPDATE java2 SET metier = LOWER(metier)";
            PreparedStatement preparedStatement9 = connexion.prepareStatement(sql9);
            int lignesModifiees9 = preparedStatement9.executeUpdate();
            
            String met1 = "UPDATE java2 SET metier = '1' WHERE metier = 'informatique, nouvelles technologies' or metier='informatique, nouvelles technologies métiers des services' or metier='informatique, nouvelles technologies r&d, gestion de projets' or metier='informatique, nouvelles technologies marketing, communication' or metier='informatique, nouvelles technologies management, direction générale' or metier='informatique, nouvelles technologies métiers du btp r&d, gestion de projets' or metier='informatique, nouvelles technologies production, maintenance, qualité'";
            PreparedStatement m1 = connexion.prepareStatement(met1);
            int M1 = m1.executeUpdate();
            
            String met2 = "UPDATE java2 SET metier = '2' WHERE metier = 'commercial, vente informatique, nouvelles technologies'";
            PreparedStatement m2 = connexion.prepareStatement(met2);
            int M2 = m2.executeUpdate();
            
            String met3 = "UPDATE java2 SET metier = '3' WHERE metier = 'gestion, comptabilité, finance informatique, nouvelles technologies' or metier='gestion, comptabilité, finance' or metier='gestion, comptabilité, finance juridique' or metier='gestion, comptabilité, finance management, direction générale métiers des services' or metier='gestion, comptabilité, finance rh, formation' or metier='gestion, comptabilité, finance secrétariat, assistanat' or metier='gestion, comptabilité, finance rh, formation secrétariat, assistanat'"
            		+ "or metier='gestion, comptabilité, finance r&d, gestion de projets' or metier='gestion, comptabilité, finance management, direction générale r&d, gestion de projets'";
            PreparedStatement m3 = connexion.prepareStatement(met3);
            int M3 = m3.executeUpdate();
            
            String met4 = "UPDATE java2 SET metier = '4' WHERE metier = 'commercial, vente gestion, comptabilité, finance' or metier='commercial, vente gestion, comptabilité, finance métiers des services'"
            		+ "or metier='commercial, vente gestion, comptabilité, finance secrétariat, assistanat' or metier='commercial, vente gestion, comptabilité, finance télémarketing, téléassistance'";
            PreparedStatement m4 = connexion.prepareStatement(met4);
            int M4 = m4.executeUpdate();
            
            String met5 = "UPDATE java2 SET metier = '5' WHERE metier = 'télémarketing, téléassistance'";
            PreparedStatement m5 = connexion.prepareStatement(met5);
            int M5 = m5.executeUpdate();
            
            String met6 = "UPDATE java2 SET metier = '6' WHERE metier = 'management, direction générale rh, formation'or metier='management, direction générale production, maintenance, qualité' or metier='production, maintenance, qualité rh, formation'";
            PreparedStatement m6 = connexion.prepareStatement(met6);
            int M6 = m6.executeUpdate();
            
            String met7 = "UPDATE java2 SET metier = '7' WHERE metier = 'rh, formation'";
            PreparedStatement m7 = connexion.prepareStatement(met7);
            int M7 = m7.executeUpdate();
            
          /*  String metiernull = "UPDATE java2 SET metier = 0";
            PreparedStatement metier = connexion.prepareStatement(metiernull);
            int l9 = metier.executeUpdate();*/

         // Type du contrat
            String sql10 = "UPDATE java2 SET typedecontrat = LOWER(typedecontrat)";
            PreparedStatement preparedStatement10 = connexion.prepareStatement(sql10);
            int lignesModifiees10 = preparedStatement10.executeUpdate();
            
         // CDI = 1
            String sqlCDI = "UPDATE java2 SET typedecontrat = '1' WHERE typedecontrat = 'cdi'";
            PreparedStatement psCDI = connexion.prepareStatement(sqlCDI);
            int lignesModifieesCDI = psCDI.executeUpdate();

            // CDD = 2
            String sqlCDD = "UPDATE java2 SET typedecontrat = '2' WHERE typedecontrat = 'cdd'";
            PreparedStatement psCDD = connexion.prepareStatement(sqlCDD);
            int lignesModifieesCDD = psCDD.executeUpdate();

            // Freelance = 3
            String sqlFreelance = "UPDATE java2 SET typedecontrat = '3' WHERE typedecontrat = 'freelance'";
            PreparedStatement psFreelance = connexion.prepareStatement(sqlFreelance);
            int lignesModifieesFreelance = psFreelance.executeUpdate();

            // Stage = 4
            String sqlStage = "UPDATE java2 SET typedecontrat = '4' WHERE typedecontrat = 'stage'";
            PreparedStatement psStage = connexion.prepareStatement(sqlStage);
            int lignesModifieesStage = psStage.executeUpdate();
            
            // intérim =5 
            String sqlintérim = "UPDATE java2 SET typedecontrat = '5' WHERE typedecontrat = 'intérim'";
            PreparedStatement psinterem = connexion.prepareStatement(sqlintérim);
            int lignesModifieesintrem = psinterem.executeUpdate();

            // cdi/freelance =6 
            String sqlif = "UPDATE java2 SET typedecontrat = '6' WHERE typedecontrat = 'cdi - freelance'";
            PreparedStatement psif = connexion.prepareStatement(sqlif);
            int lignesModifieesif = psif.executeUpdate();
            
            // cdi/cdd =7
            String sqlid = "UPDATE java2 SET typedecontrat = '7' WHERE typedecontrat = 'cdi - cdd'";
            PreparedStatement psid = connexion.prepareStatement(sqlid);
            int lignesModifieesid = psid.executeUpdate();
            
         // cdd/freelance =8
            String sqldf = "UPDATE java2 SET typedecontrat = '8' WHERE typedecontrat = 'cdd - freelance'";
            PreparedStatement psdf = connexion.prepareStatement(sqldf);
            int lignesModifieesdf = psdf.executeUpdate();
            
         // cdd-intérim =9 
            String sqlintérdin = "UPDATE java2 SET typedecontrat = '9' WHERE typedecontrat = 'cdd - intérim'";
            PreparedStatement psdin = connexion.prepareStatement(sqlintérdin);
            int lignesModifie = psdin.executeUpdate();
            
            
         // cdd-cdi-intérim =10
            String sqlidi = "UPDATE java2 SET typedecontrat = '10' WHERE typedecontrat = 'cdi - cdd - intérim'";
            PreparedStatement psddin = connexion.prepareStatement(sqlidi);
            int lignee = psddin.executeUpdate();
            
            
            //cdi-intérim =11
            String sqliin = "UPDATE java2 SET typedecontrat = '11' WHERE typedecontrat = 'cdi - temps partiel'";
            PreparedStatement psdiin = connexion.prepareStatement(sqliin);
            int lignere = psdiin.executeUpdate();
            
            
         // cdd-cdi-intérim =12
            String sqlidio = "UPDATE java2 SET typedecontrat = '12' WHERE typedecontrat = 'cdi - cdd - freelance'";
            PreparedStatement psddino = connexion.prepareStatement(sqlidio);
            int ligneeoo = psddino.executeUpdate();
            



            // Niveau d'études
            String sql11 = "UPDATE java2 SET niveaudetude = LOWER(niveaudetude)";
            PreparedStatement preparedStatement11 = connexion.prepareStatement(sql11);
            int lignesModifiees11 = preparedStatement11.executeUpdate();
            
            //Spécialité/ Diplôme
        
            String sql12 = "UPDATE java2 SET diplome = LOWER(diplome)";
            PreparedStatement preparedStatement12 = connexion.prepareStatement(sql12);
            int lignesModifiees12 = preparedStatement12.executeUpdate();
            
            
          //18.	Expérience
            
            String sql13 = "UPDATE java2 SET experience = LOWER(experience)";
            PreparedStatement preparedStatement13 = connexion.prepareStatement(sql13);
            int lignesModifiees13 = preparedStatement13.executeUpdate();
            
            
            String debut1 = "UPDATE java2 SET experience = '1' WHERE experience = 'débutant < 2 ans'";
            PreparedStatement d = connexion.prepareStatement(debut1);
            int q88 = d.executeUpdate();
            
            String debut2 = "UPDATE java2 SET experience = '2' WHERE experience = 'expérience entre 2 ans et 5 ans'";
            PreparedStatement d2 = connexion.prepareStatement(debut2);
            int q80 = d2.executeUpdate();
            
            
            String debut3 = "UPDATE java2 SET experience = '3' WHERE experience = 'expérience entre 5 ans et 10 ans'";
            PreparedStatement d3 = connexion.prepareStatement(debut3);
            int q81 = d3.executeUpdate();
            
            
            String debut4 = "UPDATE java2 SET experience = '4' WHERE experience = 'expérience > 10 ans'";
            PreparedStatement d4 = connexion.prepareStatement(debut4);
            int q82 = d4.executeUpdate();
            
            
            String debut5 = "UPDATE java2 SET experience = '5' WHERE experience = 'etudiant, jeune diplômé'";
            PreparedStatement d5 = connexion.prepareStatement(debut5);
            int q2 = d5.executeUpdate();
            
            
            
//18.	//Profil recherché
            
            String sql14 = "UPDATE java2 SET profilerecherche = LOWER(profilerecherche)";
            PreparedStatement preparedStatement14 = connexion.prepareStatement(sql14);
            int lignesModifiees14 = preparedStatement14.executeUpdate();
            
            String profilerecherche = "UPDATE java2 SET profilerecherche = 0";
            PreparedStatement profilerechercheoo = connexion.prepareStatement(profilerecherche);
            int profi = profilerechercheoo.executeUpdate();
            
//20.	Traits de personnalité
            
            String sql15 = "UPDATE java2 SET traitsdepersonnalite = LOWER(profilerecherche)";
            PreparedStatement preparedStatement15 = connexion.prepareStatement(sql15);
            int lignesModifiees15 = preparedStatement15.executeUpdate();
            
            String traitsdepersonnalite = "UPDATE java2 SET traitsdepersonnalite = 0";
            PreparedStatement traitsdepersonna = connexion.prepareStatement(traitsdepersonnalite);
            int proftraii = traitsdepersonna.executeUpdate();
            
            //hard skills
            
            String sql16 = "UPDATE java2 SET hardskills = LOWER(hardskills)";
            PreparedStatement preparedStatement16 = connexion.prepareStatement(sql16);
            int lignesModifiees16 = preparedStatement16.executeUpdate();
            
            
 //soft skills
            
            String sql17 = "UPDATE java2 SET softskills = LOWER(softskills)";
            PreparedStatement preparedStatement17 = connexion.prepareStatement(sql17);
            int lignesModifiees17 = preparedStatement17.executeUpdate();
            
            
//23.	Compétences recommandées
            
            String sql18 = "UPDATE java2 SET competencerecommandees = LOWER(competencerecommandees)";
            PreparedStatement preparedStatement18 = connexion.prepareStatement(sql18);
            int lignesModifiees18 = preparedStatement18.executeUpdate();
            
            String competencerecommandees = "UPDATE java2 SET competencerecommandees = 0";
            PreparedStatement comp = connexion.prepareStatement(competencerecommandees);
            int n56 = comp.executeUpdate();
            
            
            
//23.	24.	Langue
            
            String sql19 = "UPDATE java2 SET langue = LOWER(langue)";
            PreparedStatement preparedStatement19 = connexion.prepareStatement(sql19);
            int lignesModifiees19 = preparedStatement19.executeUpdate();
            
            
//Niveau de la langue
            
            String sql20 = "UPDATE java2 SET niveaudelalangue = LOWER(niveaudelalangue)";
            PreparedStatement preparedStatement20 = connexion.prepareStatement(sql20);
            int lignesModifiees20 = preparedStatement20.executeUpdate();
            
            
//26.		Avantages sociaux
            
            String sql21 = "UPDATE java2 SET avantagesociaux = LOWER(avantagesociaux)";
            PreparedStatement preparedStatement21 = connexion.prepareStatement(sql21);
            int lignesModifiees21 = preparedStatement21.executeUpdate();
           
//26.		28.	Télétravail
            
            String sql22 = "UPDATE java2 SET teletravail = LOWER(teletravail)";
            PreparedStatement preparedStatement22 = connexion.prepareStatement(sql22);
            int lignesModifiees22 = preparedStatement22.executeUpdate();
            
            
            // Date de publication
            String selectSql = "SELECT datedepublication FROM java2";
            PreparedStatement selectStatement = connexion.prepareStatement(selectSql);
            ResultSet resultSet = selectStatement.executeQuery();
            SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            PreparedStatement updateStatement = connexion.prepareStatement("UPDATE java2 SET datedepublication = ? WHERE datedepublication = ?");

            while (resultSet.next()) {
                String datePublicationStr = resultSet.getString("datedepublication");
                datePublicationStr = datePublicationStr.replace("Publiée le ", "");
                Date datePublication = inputDateFormat.parse(datePublicationStr);
                String dateFormatted = outputDateFormat.format(datePublication);

                updateStatement.setString(1, dateFormatted);
                updateStatement.setString(2, resultSet.getString("datedepublication"));
                int rowsUpdated = updateStatement.executeUpdate();
            }
            String nulldate = "UPDATE java2 SET datedepublication = 0";
            PreparedStatement date = connexion.prepareStatement(nulldate);
            int date99 = date.executeUpdate();
/////
            
            /// date de postule
            String nulldatep = "UPDATE java2 SET datedepostule = 0";
            PreparedStatement datep = connexion.prepareStatement(nulldatep);
            int datepp = datep.executeUpdate();
            
            //
            
         
            


            // Secteur d'activité
            String sql1 = "UPDATE java2 SET secteurdactivite = LOWER(secteurdactivite)";
            PreparedStatement preparedStatement1 = connexion.prepareStatement(sql1);
            int lignesModifiees1 = preparedStatement1.executeUpdate();
            
            
            //niveau d'etude 
            String bac = "UPDATE java2 SET niveaudetude = '1' WHERE niveaudetude = 'bac'";
            PreparedStatement pbac = connexion.prepareStatement(bac);
            int me = pbac.executeUpdate();
            String bac2 = "UPDATE java2 SET niveaudetude = '2' WHERE niveaudetude = 'bac+2'";
            PreparedStatement pbac2 = connexion.prepareStatement(bac2);
            int me2 = pbac2.executeUpdate();
            String bac3 = "UPDATE java2 SET niveaudetude = '3' WHERE niveaudetude = 'bac+3'";
            PreparedStatement pbac3 = connexion.prepareStatement(bac3);
            int me3 = pbac3.executeUpdate();
            String bac4 = "UPDATE java2 SET niveaudetude = '4' WHERE niveaudetude = 'bac+4'";
            PreparedStatement pbac4 = connexion.prepareStatement(bac4);
            int me4 = pbac4.executeUpdate();
            
            String bac5 = "UPDATE java2 SET niveaudetude = '5' WHERE niveaudetude = 'bac+5 et plus'";
            PreparedStatement pbac5 = connexion.prepareStatement(bac5);
            int me5 = pbac5.executeUpdate();
            
          //diplome
            String bac11 = "UPDATE java2 SET diplome = '1' WHERE diplome = 'bac'";
            PreparedStatement pbac1 = connexion.prepareStatement(bac11);
            int me1 = pbac1.executeUpdate();
            String bac21 = "UPDATE java2 SET diplome = '2' WHERE diplome = 'bac+2'";
            PreparedStatement pbac21 = connexion.prepareStatement(bac21);
            int me21 = pbac21.executeUpdate();
            String bac31 = "UPDATE java2 SET diplome = '3' WHERE diplome = 'bac+3'";
            PreparedStatement pbac31 = connexion.prepareStatement(bac31);
            int me31 = pbac31.executeUpdate();
            String bac41 = "UPDATE java2 SET diplome = '4' WHERE diplome = 'bac+4'";
            PreparedStatement pbac41 = connexion.prepareStatement(bac41);
            int me41 = pbac41.executeUpdate();
            
            String bac51 = "UPDATE java2 SET diplome = '5' WHERE diplome = 'bac+5 et plus'";
            PreparedStatement pbac51 = connexion.prepareStatement(bac51);
            int me51 = pbac51.executeUpdate();
            
            
            //teletravail
            
            String tel = "UPDATE java2 SET teletravail = '1' WHERE teletravail = 'oui'";
            PreparedStatement tell = connexion.prepareStatement(tel);
            int t = tell.executeUpdate();
            
            String te = "UPDATE java2 SET teletravail = '0' WHERE teletravail = 'non'";
            PreparedStatement tep = connexion.prepareStatement(te);
            int pt = tep.executeUpdate();
            
            //lang
            String lang = "UPDATE java2 SET langue = '1' WHERE langue = 'français'";
            PreparedStatement lange = connexion.prepareStatement(lang);
            int lg = lange.executeUpdate();
            
            String lang2 = "UPDATE java2 SET langue = '2' WHERE langue = 'anglais'";
            PreparedStatement lange2 = connexion.prepareStatement(lang2);
            int lg2 = lange2.executeUpdate();
            
            String lang3 = "UPDATE java2 SET langue = '3' WHERE langue = 'anglais français'";
            PreparedStatement lange3 = connexion.prepareStatement(lang3);
            int lg3 = lange3.executeUpdate();
            
            String lang4 = "UPDATE java2 SET langue = '4' WHERE langue = 'arabe français'";
            PreparedStatement lange4 = connexion.prepareStatement(lang4);
            int lg4 = lange4.executeUpdate();
            
            String lang5 = "UPDATE java2 SET langue = '5' WHERE langue = 'anglais arabe français'";
            PreparedStatement lange5 = connexion.prepareStatement(lang5);
            int lg5 = lange5.executeUpdate();
            
            String lang6 = "UPDATE java2 SET langue = '6' WHERE langue = 'arabe français'";
            PreparedStatement lange6 = connexion.prepareStatement(lang6);
            int lg6 = lange6.executeUpdate();
            
            String lang7 = "UPDATE java2 SET langue = '7' WHERE langue = 'espagnol'";
            	            PreparedStatement lange7 = connexion.prepareStatement(lang7);
            int lg7 = lange7.executeUpdate();
            
            String lang8 = "UPDATE java2 SET langue = '8' WHERE langue = 'anglais portugais'";
            PreparedStatement lange8 = connexion.prepareStatement(lang8);
            int lg8 = lange8.executeUpdate();
            
            
            String lang9 = "UPDATE java2 SET langue = '9' WHERE langue = 'italien'";
            PreparedStatement lange9 = connexion.prepareStatement(lang9);
            int lg9 = lange9.executeUpdate();
            
            String lang10 = "UPDATE java2 SET langue = '10' WHERE langue = 'portugais'";
            PreparedStatement lange10 = connexion.prepareStatement(lang10);
            int lg10 = lange10.executeUpdate();
            
            String lang11 = "UPDATE java2 SET langue = '11' WHERE langue = 'allemand'";
            PreparedStatement lange11 = connexion.prepareStatement(lang11);
            int lg11 = lange11.executeUpdate();
            
            String lang112 = "UPDATE java2 SET langue = '11' WHERE langue = 'néerlandais'";
            PreparedStatement lange112 = connexion.prepareStatement(lang112);
            int lg112 = lange112.executeUpdate();
            
            String lang1122 = "UPDATE java2 SET langue = '0' WHERE langue = 'null'";
            PreparedStatement lange1122 = connexion.prepareStatement(lang1122);
            int lg1122 = lange1122.executeUpdate();
            
            String lag1122 = "UPDATE java2 SET langue = '11' WHERE langue = 'luganda swahili'";
            PreparedStatement lang22 = connexion.prepareStatement(lag1122);
            int l22 = lang22.executeUpdate();
            
            
            //niv
            
            String niv = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'bon niveau'";
            PreparedStatement ii = connexion.prepareStatement(niv);
            int i1 = ii.executeUpdate();
            
            String niv1 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'bon niveau bon niveau'";
            PreparedStatement ii1 = connexion.prepareStatement(niv1);
            int i11 = ii1.executeUpdate();
            
            String niv2 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'bon niveau courant'";
            PreparedStatement ii2 = connexion.prepareStatement(niv2);
            int i12 = ii2.executeUpdate();
            
            String niv3 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'bon niveau courant courant'";
            PreparedStatement ii3 = connexion.prepareStatement(niv3);
            int i13 = ii3.executeUpdate();
            
            String niv4 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'bon niveau maternelle bon niveau'";
            PreparedStatement ii4 = connexion.prepareStatement(niv4);
            int i14 = ii4.executeUpdate();
            
            String niv5 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'bon niveau maternelle courant'";
            PreparedStatement ii5 = connexion.prepareStatement(niv5);
            int i15 = ii5.executeUpdate();
            
            String niv6 = "UPDATE java2 SET niveaudelalangue = 'intermédiaire' WHERE niveaudelalangue = 'intermédiaire bon niveau'";
            PreparedStatement ii6 = connexion.prepareStatement(niv6);
            int i16 = ii6.executeUpdate();
            
            String niv7 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'intermédiaire courant'";
            PreparedStatement ii7 = connexion.prepareStatement(niv7);
            int i17 = ii7.executeUpdate();
            
            
            String niv8 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'maternelle bon niveau'";
            PreparedStatement ii8 = connexion.prepareStatement(niv8);
            int i18 = ii8.executeUpdate();
            
            String niv9 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'maternelle courant'";
            PreparedStatement ii9 = connexion.prepareStatement(niv9);
            int i19 = ii9.executeUpdate();
            

            String niv10 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'courant courant'";
            PreparedStatement ii10 = connexion.prepareStatement(niv10);
            int i110 = ii10.executeUpdate();
            

            String niv11 = "UPDATE java2 SET niveaudelalangue = 'courant' WHERE niveaudelalangue = 'courant bon niveau'";
            PreparedStatement ii11 = connexion.prepareStatement(niv11);
            int i111 = ii11.executeUpdate();
            
            
            String niv13 = "UPDATE java2 SET niveaudelalangue = '1' WHERE niveaudelalangue = 'courant'";
            PreparedStatement ii110 = connexion.prepareStatement(niv13);
            int iz1 = ii110.executeUpdate();
            
            
            String nivz3 = "UPDATE java2 SET niveaudelalangue = '2' WHERE niveaudelalangue = 'intermédiaire'";
            PreparedStatement ii11s0 = connexion.prepareStatement(nivz3);
            int izz1 = ii11s0.executeUpdate();
            
            
            String nivrz3 = "UPDATE java2 SET niveaudelalangue = '3' WHERE niveaudelalangue = 'débutant'";
            PreparedStatement i1s0 = connexion.prepareStatement(nivrz3);
            int irz1 = i1s0.executeUpdate();
            
            String nz3 = "UPDATE java2 SET niveaudelalangue = '4' WHERE niveaudelalangue = 'maternelle'";
            PreparedStatement i0 = connexion.prepareStatement(nz3);
            int rz1 = i0.executeUpdate();
            
            
            String n3 = "UPDATE java2 SET niveaudelalangue = '5' WHERE niveaudelalangue = 'null'";
            PreparedStatement p0 = connexion.prepareStatement(n3);
            int r91 = p0.executeUpdate();
            
            
            
           //site entreprise
            String sitedentreprise = "UPDATE java2 SET sitewebdentreprise = 0";
            PreparedStatement sitedentrepris = connexion.prepareStatement(sitedentreprise);
            int site = sitedentrepris.executeUpdate();
            
            
            ///////
            String hardskills = "UPDATE java2 SET hardskills = 0";
            PreparedStatement hardskillsnull = connexion.prepareStatement(hardskills);
            int n78 = hardskillsnull.executeUpdate();
            
            
            String softskills = "UPDATE java2 SET softskills = 0";
            PreparedStatement softskill = connexion.prepareStatement(softskills);
            int n58 = softskill.executeUpdate();
            
            String salire = "UPDATE java2 SET salaire = 0";
            PreparedStatement sal = connexion.prepareStatement(salire);
            int sal9 = sal.executeUpdate();
            
            String avantagesociaux = "UPDATE java2 SET avantagesociaux = 0";
            PreparedStatement avantagesociau = connexion.prepareStatement(avantagesociaux);
            int avantagesociauP = avantagesociau.executeUpdate();
            
            //////ville
            String v1 = "UPDATE java2 SET ville = '1' WHERE ville = 'casablanca' or ville='nouaceur, casablanca'";
            PreparedStatement b1 = connexion.prepareStatement(v1);
            int x1 = b1.executeUpdate();
            
            String v2 = "UPDATE java2 SET ville = '2' WHERE ville = 'marrakech' or ville='marrakech - gueliz'";
            PreparedStatement b2 = connexion.prepareStatement(v2);
            int x2 = b2.executeUpdate();
            
            String v3 = "UPDATE java2 SET ville = '3' WHERE ville = 'québec' OR ville='québec - canada' or ville='province de québec' or ville='saguenay lac saint jean' or ville='france' or ville='sénégal, dakar'";
            PreparedStatement b3 = connexion.prepareStatement(v3);
            int x3 = b3.executeUpdate();
            
            String v4 = "UPDATE java2 SET ville = '4' WHERE ville = 'rabat, takkadoum' OR ville='rabat'";
            PreparedStatement b4 = connexion.prepareStatement(v4);
            int x4 = b4.executeUpdate();
            
            String v5 = "UPDATE java2 SET ville = '5' WHERE ville = 'mohammedia'";
            PreparedStatement b5 = connexion.prepareStatement(v5);
            int x5 = b5.executeUpdate();
            
            String v6 = "UPDATE java2 SET ville = '6' WHERE ville = 'tanger'";
            PreparedStatement b6 = connexion.prepareStatement(v6);
            int x6 = b6.executeUpdate();
            
            String v7 = "UPDATE java2 SET ville = '7' WHERE ville = 'el jadida'";
            PreparedStatement b7 = connexion.prepareStatement(v7);
            int x7 = b7.executeUpdate();
            
            String v8 = "UPDATE java2 SET ville = '8' WHERE ville = 'lissasfa'";
            PreparedStatement b8 = connexion.prepareStatement(v8);
            int x8 = b8.executeUpdate();
            
            String v9 = "UPDATE java2 SET ville = '9' WHERE ville = 'laayoune'";
            PreparedStatement b9 = connexion.prepareStatement(v9);
            int x9 = b9.executeUpdate();
            
            String v10 = "UPDATE java2 SET ville = '10' WHERE ville = 'trois-rivières - mauricie' or ville='laurentides'";
            PreparedStatement b10 = connexion.prepareStatement(v10);
            int x10 = b10.executeUpdate();
            
            String v11 = "UPDATE java2 SET ville = '11' WHERE ville = 'travail en remote/sur site' or ville ='/ travail à distance' or ville='/ travail en remote' or ville='télétravail' ";
            PreparedStatement b11 = connexion.prepareStatement(v11);
            int x11 = b11.executeUpdate();
            
            String v12 = "UPDATE java2 SET ville = '12' WHERE ville = 'temara'";
            PreparedStatement b12 = connexion.prepareStatement(v12);
            int x12 = b12.executeUpdate();
            
            String v13 = "UPDATE java2 SET ville = '13' WHERE ville = 'khenifra'";
            PreparedStatement b13 = connexion.prepareStatement(v13);
            int x13 = b13.executeUpdate();
            
            String v14 = "UPDATE java2 SET ville = '14' WHERE ville = 'agadir'";
            PreparedStatement b14 = connexion.prepareStatement(v14);
            int x14 = b14.executeUpdate();
            
            String v15 = "UPDATE java2 SET ville = '15' WHERE ville = 'skhirate'";
            PreparedStatement b15 = connexion.prepareStatement(v15);
            int x15 = b15.executeUpdate();
            
            String v16 = "UPDATE java2 SET ville = '16' WHERE ville = 'berrchid'";
            PreparedStatement b16 = connexion.prepareStatement(v16);
            int x16 = b16.executeUpdate();
            
            String v17 = "UPDATE java2 SET ville = '0' WHERE ville = 'null'";
            PreparedStatement b17 = connexion.prepareStatement(v17);
            int x17 = b17.executeUpdate();
            
            String v18 = "UPDATE java2 SET ville = '17' WHERE ville = 'dakhla'";
            PreparedStatement b18 = connexion.prepareStatement(v18);
            int x18 = b18.executeUpdate();
            
            String v19 = "UPDATE java2 SET ville = '19' WHERE ville = 'casablanca, rabat'";
            PreparedStatement b19 = connexion.prepareStatement(v19);
            int x19 = b19.executeUpdate();
            
            String v20 = "UPDATE java2 SET ville = '20' WHERE ville = 'rabat-salé-kénitra'";
            PreparedStatement b20 = connexion.prepareStatement(v20);
            int x20 = b20.executeUpdate();
            
            String v21 = "UPDATE java2 SET ville = '21' WHERE ville = 'dakar'";
            PreparedStatement b21 = connexion.prepareStatement(v21);
            int x21 = b21.executeUpdate();
            
            String v22 = "UPDATE java2 SET ville = '22' WHERE ville = 'fès'";
            PreparedStatement b22 = connexion.prepareStatement(v22);
            int x22 = b22.executeUpdate();
            
            String v23 = "UPDATE java2 SET ville = '23' WHERE ville = 'kenitra'";
            PreparedStatement b23 = connexion.prepareStatement(v23);
            int x23 = b23.executeUpdate();
            
            
            String v24 = "UPDATE java2 SET ville = '24' WHERE ville = 'casablanca et rabat'";
            PreparedStatement b24 = connexion.prepareStatement(v24);
            int x24 = b24.executeUpdate();
            
            
            //adressdelentreprise
            String tt1 = "UPDATE java2 SET adressdelentreprise = '1' WHERE adressdelentreprise = 'casablanca' or adressdelentreprise='nouaceur, casablanca'";
            PreparedStatement bb1 = connexion.prepareStatement(tt1);
            int xx1 = bb1.executeUpdate();
            
            String vv2 = "UPDATE java2 SET adressdelentreprise = '2' WHERE adressdelentreprise = 'marrakech' or adressdelentreprise='marrakech - gueliz'";
            PreparedStatement bb2 = connexion.prepareStatement(vv2);
            int xx2 = bb2.executeUpdate();
            
            String vv3 = "UPDATE java2 SET adressdelentreprise = '3' WHERE adressdelentreprise = 'québec' OR adressdelentreprise ='québec - canada' or adressdelentreprise='province de québec' or adressdelentreprise='saguenay lac saint jean' or adressdelentreprise='france' or adressdelentreprise='sénégal, dakar'";
            PreparedStatement bb3 = connexion.prepareStatement(vv3);
            int xx3 = bb3.executeUpdate();
            
            String vv4 = "UPDATE java2 SET adressdelentreprise = '4' WHERE adressdelentreprise = 'rabat, takkadoum' OR adressdelentreprise='rabat'";
            PreparedStatement bb4 = connexion.prepareStatement(vv4);
            int xx4 = bb4.executeUpdate();
            
            String vv5 = "UPDATE java2 SET adressdelentreprise = '5' WHERE adressdelentreprise = 'mohammedia'";
            PreparedStatement bb5 = connexion.prepareStatement(vv5);
            int xx5 = bb5.executeUpdate();
            
            String vv6 = "UPDATE java2 SET adressdelentreprise = '6' WHERE adressdelentreprise = 'tanger'";
            PreparedStatement bb6 = connexion.prepareStatement(vv6);
            int xx6 = bb6.executeUpdate();
            
            String vv7 = "UPDATE java2 SET adressdelentreprise = '7' WHERE adressdelentreprise = 'el jadida'";
            PreparedStatement bb7 = connexion.prepareStatement(vv7);
            int xx7 = bb7.executeUpdate();
            
            String vv8 = "UPDATE java2 SET adressdelentreprise = '8' WHERE adressdelentreprise = 'lissasfa'";
            PreparedStatement bb8 = connexion.prepareStatement(vv8);
            int xx8 = bb8.executeUpdate();
            
            String vv9 = "UPDATE java2 SET adressdelentreprise = '9' WHERE adressdelentreprise = 'laayoune'";
            PreparedStatement bb9 = connexion.prepareStatement(vv9);
            int xx9 = bb9.executeUpdate();
            
            String vv10 = "UPDATE java2 SET adressdelentreprise = '10' WHERE adressdelentreprise = 'trois-rivières - mauricie' or adressdelentreprise='laurentides'";
            PreparedStatement bb10 = connexion.prepareStatement(vv10);
            int xx10 = bb10.executeUpdate();
            
            String vv11 = "UPDATE java2 SET adressdelentreprise = '11' WHERE adressdelentreprise = 'travail en remote/sur site' or adressdelentreprise ='/ travail à distance' or adressdelentreprise='/ travail en remote' or adressdelentreprise='télétravail' ";
            PreparedStatement bb11 = connexion.prepareStatement(vv11);
            int xx11 = bb11.executeUpdate();
            
            String vv12 = "UPDATE java2 SET adressdelentreprise = '12' WHERE adressdelentreprise = 'temara'";
            PreparedStatement bb12 = connexion.prepareStatement(vv12);
            int xx12 = bb12.executeUpdate();
            
            String vv13 = "UPDATE java2 SET adressdelentreprise = '13' WHERE adressdelentreprise = 'khenifra'";
            PreparedStatement bb13 = connexion.prepareStatement(vv13);
            int xx13 = bb13.executeUpdate();
            
            String vv14 = "UPDATE java2 SET adressdelentreprise = '14' WHERE adressdelentreprise = 'agadir'";
            PreparedStatement bb14 = connexion.prepareStatement(vv14);
            int xx14 = bb14.executeUpdate();
            
            String vv15 = "UPDATE java2 SET adressdelentreprise = '15' WHERE adressdelentreprise = 'skhirate'";
            PreparedStatement bb15 = connexion.prepareStatement(vv15);
            int xx15 = bb15.executeUpdate();
            
            String vv16 = "UPDATE java2 SET adressdelentreprise = '16' WHERE adressdelentreprise = 'berrchid'";
            PreparedStatement bb16 = connexion.prepareStatement(vv16);
            int xx16 = bb16.executeUpdate();
            
            String vv17 = "UPDATE java2 SET adressdelentreprise = '0' WHERE adressdelentreprise = 'null'";
            PreparedStatement bb17 = connexion.prepareStatement(vv17);
            int xx17 = bb17.executeUpdate();
            
            String vv18 = "UPDATE java2 SET adressdelentreprise = '17' WHERE adressdelentreprise = 'dakhla'";
            PreparedStatement bb18 = connexion.prepareStatement(vv18);
            int xx18 = bb18.executeUpdate();
            
            String vv19 = "UPDATE java2 SET adressdelentreprise = '19' WHERE adressdelentreprise = 'casablanca, rabat'";
            PreparedStatement bb19 = connexion.prepareStatement(vv19);
            int xx19 = bb19.executeUpdate();
            
            String vv20 = "UPDATE java2 SET adressdelentreprise = '20' WHERE adressdelentreprise = 'rabat-salé-kénitra'";
            PreparedStatement bb20 = connexion.prepareStatement(vv20);
            int xx20 = bb20.executeUpdate();
            
            String vv21 = "UPDATE java2 SET adressdelentreprise = '21' WHERE adressdelentreprise = 'dakar'";
            PreparedStatement bb21 = connexion.prepareStatement(vv21);
            int xx21 = bb21.executeUpdate();
            
            String vv22 = "UPDATE java2 SET adressdelentreprise = '22' WHERE adressdelentreprise = 'fès'";
            PreparedStatement bb22 = connexion.prepareStatement(vv22);
            int xx22 = bb22.executeUpdate();
            
            String vv23 = "UPDATE java2 SET adressdelentreprise = '23' WHERE adressdelentreprise = 'kenitra'";
            PreparedStatement bb23 = connexion.prepareStatement(vv23);
            int xx23 = bb23.executeUpdate();
            
            
            String vv24 = "UPDATE java2 SET adressdelentreprise = '24' WHERE adressdelentreprise = 'casablanca et rabat'";
            PreparedStatement bb24 = connexion.prepareStatement(vv24);
            int xx24 = bb24.executeUpdate();
            
            
            
          
            
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
