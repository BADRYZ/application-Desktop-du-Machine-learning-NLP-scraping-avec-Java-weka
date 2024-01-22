package regression;

import weka.classifiers.functions.SimpleLinearRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class weka2 extends JFrame {

    public ChartPanel getLinearRegressionChart() {
        try {
            // Chargement des données ARFF
            DataSource source = new DataSource("C:\\Users\\UR\\Desktop\\bana\\bana\\src\\data.arff");
            Instances data = source.getDataSet();

            // Spécifiez l'indice de la colonne "typedecontrat"
            int targetColumnIndex = data.attribute("typedecontrat").index();

            // Définir la colonne cible comme attribut de classe
            data.setClassIndex(targetColumnIndex);

            // Création du modèle SimpleLinearRegression
            SimpleLinearRegression regressionModel = new SimpleLinearRegression();
            regressionModel.buildClassifier(data);

            // Création d'une série de données pour la courbe de régression
            XYSeries series = new XYSeries("Régression linéaire");
            for (int i = 0; i < data.numInstances(); i++) {
                double x = data.instance(i).value(0); // Assurez-vous que l'index correspond à la colonne "typedecontrat"
                double y = regressionModel.classifyInstance(data.instance(i));
                series.add(x, y);
            }

            // Création de la collection de séries de données
            XYSeriesCollection dataset = new XYSeriesCollection(series);

            // Création du graphique
            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Régression linéaire",
                    "Typedecontrat",
                    "Prédiction",
                    dataset
            );

            // Création du ChartPanel et le retourner
            return new ChartPanel(chart);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // The main method for standalone execution
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Régression Linéaire");
            weka2 regressionChart = new weka2();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(regressionChart.getLinearRegressionChart(), BorderLayout.CENTER);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
