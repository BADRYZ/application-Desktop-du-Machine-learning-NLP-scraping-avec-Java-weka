package dataCSV;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class csv {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ziko1";
        String utilisateur = "root";
        String motDePasse = "";

        String fichierCSV = "donnees2.csv";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, utilisateur, motDePasse);
             Statement statement = connection.createStatement();
             FileWriter writer = new FileWriter(fichierCSV)) {

            // Remplacez 'votre_table' par le nom de votre table dans la base de données
            String requeteSQL = "SELECT * FROM java";
            ResultSet resultSet = statement.executeQuery(requeteSQL);

            // Récupérer les noms de colonnes
            int nombreColonnes = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= nombreColonnes; i++) {
                writer.append(resultSet.getMetaData().getColumnName(i));
                if (i < nombreColonnes) {
                    writer.append(',');
                }
            }
            writer.append('\n');

            // Écrire les données dans le fichier CSV
            while (resultSet.next()) {
                for (int i = 1; i <= nombreColonnes; i++) {
                    writer.append(resultSet.getString(i));
                    if (i < nombreColonnes) {
                        writer.append(',');
                    }
                }
                writer.append('\n');
            }

            System.out.println("Les données ont été exportées avec succès vers " + fichierCSV);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}