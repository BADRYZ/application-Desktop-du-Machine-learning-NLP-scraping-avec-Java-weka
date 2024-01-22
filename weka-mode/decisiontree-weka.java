package decisiontree;

import weka.classifiers.trees.REPTree;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class weka extends JFrame {

    public static void main(String[] args) {
        try {

            // Chargement des données ARFF
            DataSource source = new DataSource("C:\\Users\\UR\\Desktop\\bana\\bana\\src\\data.arff");
            Instances data = source.getDataSet();

            // Spécifiez l'indice de la colonne "typedecontrat"
            int targetColumnIndex = data.attribute("ville").index();

            // Définir la colonne cible comme classe
            data.setClassIndex(targetColumnIndex);

            // Création du modèle REPTree
            REPTree tree = new REPTree();
            tree.buildClassifier(data);

            // Affichage de l'arbre de décision
            showTree(tree, data);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Afficher l'arbre de décision dans une fenêtre
    private static void showTree(REPTree tree, Instances data) throws Exception {
        final TreeVisualizer treeVisualizer = new TreeVisualizer(null, tree.graph(), new PlaceNode2());
        JFrame jf = new JFrame("REPTree Visualizer");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
        jf.getContentPane().setLayout(new BorderLayout());
        jf.getContentPane().add(treeVisualizer, BorderLayout.CENTER);
        jf.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                jf.dispose();
            }
        });

        jf.setVisible(true);
        treeVisualizer.fitToScreen();

        // Attendre jusqu'à ce que la fenêtre soit fermée
        jf.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                jf.dispose();
            }
        });
    }
    public TreeVisualizer getTreeVisualizer() {
        try {
            // Chargement des données ARFF
            DataSource source = new DataSource("C:\\Users\\UR\\Desktop\\bana\\bana\\src\\data.arff");
            Instances data = source.getDataSet();

            // Spécifiez l'indice de la colonne "typedecontrat"
            int targetColumnIndex = data.attribute("ville").index();

            // Définir la colonne cible comme classe
            data.setClassIndex(targetColumnIndex);

            // Création du modèle REPTree
            REPTree tree = new REPTree();
            tree.buildClassifier(data);

            // Retourner l'instance de TreeVisualizer
            return new TreeVisualizer(null, tree.graph(), new PlaceNode2());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}