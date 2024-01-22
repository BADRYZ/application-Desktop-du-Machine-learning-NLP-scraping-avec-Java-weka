import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class traitrekrute {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/apres_tR";
        String utilisateur = "root";
        String motDePasse = "";

        try {
            Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            // Titre
            String sql0 = "UPDATE java2 SET titre = LOWER(titre)";
            PreparedStatement preparedStatement0 = connexion.prepareStatement(sql0);
            int lignesModifiees0 = preparedStatement0.executeUpdate();
            //salaire 
            String sql00 = "UPDATE java2 SET salaire = LOWER(salaire)";
            PreparedStatement preparedStatement00 = connexion.prepareStatement(sql00);
            int lignesModifiees00 = preparedStatement00.executeUpdate();
            //siteweb
            String sql000 = "UPDATE java2 SET sitewebdentreprise = LOWER(sitewebdentreprise)";
            PreparedStatement preparedStatement100 = connexion.prepareStatement(sql000);
            int lignesModifiees100 = preparedStatement100.executeUpdate();
            // adresss entreprise
            String sql2 = "UPDATE java2 SET adressdelentreprise = LOWER(adressdelentreprise)";
            PreparedStatement preparedStatement2 = connexion.prepareStatement(sql2);
            int lignesModifiees2 = preparedStatement2.executeUpdate();

            // nom entreprise
            String sql3 = "UPDATE java2 SET nomdentreprise = LOWER(nomdentreprise)";
            PreparedStatement preparedStatement3 = connexion.prepareStatement(sql3);
            int lignesModifiees3 = preparedStatement3.executeUpdate();


            // descriptiondelentreprise
            String sql4 = "UPDATE java2 SET descriptiondelentreprise = LOWER(descriptiondelentreprise)";
            PreparedStatement preparedStatement4 = connexion.prepareStatement(sql4);
            int lignesModifiees4 = preparedStatement4.executeUpdate();

            // description du poste
            String sql5 = "UPDATE java2 SET descriptiondeposte = LOWER(descriptiondeposte)";
            PreparedStatement preparedStatement5 = connexion.prepareStatement(sql5);
            int lignesModifiees5 = preparedStatement5.executeUpdate();

            // region
            String sql6 = "UPDATE java2 SET region = LOWER(region)";
            PreparedStatement preparedStatement6 = connexion.prepareStatement(sql6);
            int lignesModifiees6 = preparedStatement6.executeUpdate();

            //tout le maroc-maroc 
            String rc = "UPDATE java2 SET region = '14' WHERE region = 'tout le maroc - maroc'";
            PreparedStatement p5 = connexion.prepareStatement(rc);
            int r5 = p5.executeUpdate();
            // casablanca et région-maroc
            String da = "UPDATE java2 SET region = '1' WHERE region = 'casablanca et région - maroc'";
            PreparedStatement p6 = connexion.prepareStatement(da);
            int r6 = p6.executeUpdate();

            //rabat et région - maroc
            String ag = "UPDATE java2 SET region = '2' WHERE region = 'rabat et région - maroc' OR region ='Kénitra et région - Maroc'";

            PreparedStatement p7 = connexion.prepareStatement(ag);
            int r7 = p7.executeUpdate();
            //autres régions - france 
            String inter = "UPDATE java2 SET region = '12' WHERE region = 'autres régions - france ' OR region = 'Autres régions - Émirats Arabes Unis'";

            PreparedStatement p8 = connexion.prepareStatement(inter);
            int r8 = p8.executeUpdate();
            //fès
            String fes = "UPDATE java2 SET region = '8' WHERE region = 'Fès et région - Maroc'";
            PreparedStatement p9 = connexion.prepareStatement(fes);
            int r9 = p9.executeUpdate();
            //marrakech-safi
            String mar = "UPDATE java2 SET region = '3' WHERE region = 'Marrakech et région - Maroc'";
            PreparedStatement p4 = connexion.prepareStatement(mar);
            int r4 = p4.executeUpdate();

            //tanger 
            String tanger = "UPDATE java2 SET region = '4' WHERE region = 'Tanger et région - Maroc'";
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

            // metier
            String sql9 = "UPDATE java2 SET metier = LOWER(metier)";
            PreparedStatement preparedStatement9 = connexion.prepareStatement(sql9);
            int lignesModifiees9 = preparedStatement9.executeUpdate();

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
            String bac11 = "UPDATE java2 SET diplome = '1' WHERE diplome = 'autodidacte'";
            PreparedStatement pbac1 = connexion.prepareStatement(bac11);
            int me1 = pbac1.executeUpdate();
            String bac2 = "UPDATE java2 SET niveaudetude = '2' WHERE niveaudetude = 'bac +2'";
            PreparedStatement pbac2 = connexion.prepareStatement(bac2);
            int me2 = pbac2.executeUpdate();
            String bac3 = "UPDATE java2 SET niveaudetude = '3' WHERE niveaudetude = 'bac +3'OR niveaudetude = 'bac +3 maximum' OR niveaudetude = 'bac +3 - formation spécialisée'";
            PreparedStatement pbac3 = connexion.prepareStatement(bac3);
            int me3 = pbac3.executeUpdate();
            String bac4 = "UPDATE java2 SET niveaudetude = '4' WHERE niveaudetude = 'bac +4'";
            PreparedStatement pbac4 = connexion.prepareStatement(bac4);
            int me4 = pbac4.executeUpdate();

            String bac5 = "UPDATE java2 SET niveaudetude = '5' WHERE niveaudetude = 'bac +5 et plus ' OR niveaudetude = 'bac +5 et plus - ecole d''ingénieur' OR  niveaudetude = 'bac +5 et plus maximum'";
            PreparedStatement pbac5 = connexion.prepareStatement(bac5);
            int me5 = pbac5.executeUpdate();






            //18.	Expérience :

            String sql13 = "UPDATE java2 SET experience = LOWER(experience)";
            PreparedStatement preparedStatement133 = connexion.prepareStatement(sql13);
            int lignesModifiees13 = preparedStatement133.executeUpdate();
            // 
            // Update for 'De 5 à 10 ans' and 'De 5 à 10 ans - De 10 à 20 ans'
            String sqlExperience1 = "UPDATE java2 SET experience = 3 WHERE experience IN ('De 5 à 10 ans', 'De 5 à 10 ans - De 10 à 20 ans')";
            PreparedStatement preparedStatement111 = connexion.prepareStatement(sqlExperience1);
            int rowsUpdated1 = preparedStatement111.executeUpdate();

            // Update for 'Débutant' and 'Moins de 1 an'
            String sqlExperience2 = "UPDATE java2 SET experience = 1 WHERE experience IN ('Débutant', 'Moins de 1 an')";
            PreparedStatement preparedStatement222 = connexion.prepareStatement(sqlExperience2);
            int rowsUpdated2 = preparedStatement222.executeUpdate();

            // Update for 'De 3 à 5 ans' and 'De 3 à 5 ans - De 5 à 10 ans'
            String sqlExperience3 = "UPDATE java2 SET experience = 2 WHERE experience IN ('De 3 à 5 ans', 'De 3 à 5 ans - De 5 à 10 ans')";
            PreparedStatement preparedStatement333 = connexion.prepareStatement(sqlExperience3);
            int rowsUpdated3 = preparedStatement333.executeUpdate();

            // Update for 'De 1 à 3 ans' and 'De 1 à 3 ans - De 3 à 5 ans'
            String sqlExperience4 = "UPDATE java2 SET experience = 2 WHERE experience IN ('De 1 à 3 ans', 'De 1 à 3 ans - De 3 à 5 ans')";
            PreparedStatement preparedStatement444 = connexion.prepareStatement(sqlExperience4);
            int rowsUpdated4 = preparedStatement444.executeUpdate();

            // Update for 'De 10 à 20 ans'
            String sqlExperience5 = "UPDATE java2 SET experience = 4 WHERE experience = 'De 10 à 20 ans'";
            PreparedStatement preparedStatement5Experience5 = connexion.prepareStatement(sqlExperience5);
            int rowsUpdated5 = preparedStatement5Experience5.executeUpdate();


//18.	//Profil recherché

            String sql14 = "UPDATE java2 SET profilerecherche = LOWER(profilerecherche)";
            PreparedStatement preparedStatement14 = connexion.prepareStatement(sql14);
            int lignesModifiees14 = preparedStatement14.executeUpdate();

//20.	Traits de personnalité

            String sql15 = "UPDATE java2 SET profilerecherche = LOWER(profilerecherche)";
            PreparedStatement preparedStatement15 = connexion.prepareStatement(sql15);
            int lignesModifiees15 = preparedStatement15.executeUpdate();

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


//23.	24.	Langue

            String sql19 = "UPDATE java2 SET langue = LOWER(langue)";
            PreparedStatement preparedStatement19 = connexion.prepareStatement(sql19);
            int lignesModifiees19 = preparedStatement19.executeUpdate();
            String lang5 = "UPDATE java2 SET langue = '5' WHERE langue = 'anglais›bon niveau français›courant'";
            PreparedStatement lange5 = connexion.prepareStatement(lang5);
            int lg5 = lange5.executeUpdate();




//26.		Avantages sociaux

            String sql21 = "UPDATE java2 SET avantagesociaux = LOWER(avantagesociaux)";
            PreparedStatement preparedStatement21 = connexion.prepareStatement(sql21);
            int lignesModifiees21 = preparedStatement21.executeUpdate();

//26.		28.	Télétravail


            String tel = "UPDATE java2 SET teletravail = '1' WHERE teletravail = 'Télétravail : oui 100%'";
            PreparedStatement tell = connexion.prepareStatement(tel);
            int t = tell.executeUpdate();

            String te = "UPDATE java2 SET teletravail = '0' WHERE teletravail = 'Télétravail : Non'";
            PreparedStatement tep = connexion.prepareStatement(te);
            int pt = tep.executeUpdate();
            String tee = "UPDATE java2 SET teletravail = '2' WHERE teletravail = 'Télétravail : Hybride'";
            PreparedStatement tepp = connexion.prepareStatement(tee);
            int ptt = tepp.executeUpdate();




            // Date de publication
            String selectSql = "SELECT datedepublication FROM java2";
            PreparedStatement selectStatement = connexion.prepareStatement(selectSql);
            ResultSet resultSet = selectStatement.executeQuery();
            SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd.MM.yyyy");

            String updateSql = "UPDATE java2 SET datedepublication = ? WHERE datedepublication = ?";
            PreparedStatement updateStatement = connexion.prepareStatement(updateSql);

            while (resultSet.next()) {
                String datePublicationStr = resultSet.getString("datedepublication");
                datePublicationStr = datePublicationStr.replace("Publiée le ", "");
                Date datePublication = inputDateFormat.parse(datePublicationStr);  // This line causes the exception
                String dateFormatted = outputDateFormat.format(datePublication);

                updateStatement.setString(1, dateFormatted);
                updateStatement.setString(2, resultSet.getString("datedepublication"));
                int rowsUpdated = updateStatement.executeUpdate();
            }


            // Secteur d'activité
            String sql1 = "UPDATE java2 SET secteurdactivite = LOWER(secteurdactivite)";
            PreparedStatement preparedStatement1 = connexion.prepareStatement(sql1);
            int lignesModifiees1 = preparedStatement1.executeUpdate();

















            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}