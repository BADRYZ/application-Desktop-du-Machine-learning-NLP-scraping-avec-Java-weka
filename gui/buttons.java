package view;
import org.jfree.chart.ChartPanel;
import decisiontree.weka;
import regression.weka2;
import view.gui;
import weka.gui.treevisualizer.TreeVisualizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class buttons extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;

    public buttons() {
        initComponents();
        addActionListeners();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(252, 122, 30));

        jButton1.setBackground(new java.awt.Color(252, 122, 30));
        jButton1.setText("TABLES");

        jButton2.setBackground(new java.awt.Color(252, 122, 30));
        jButton2.setText("DECISION TREE");

        jButton3.setBackground(new java.awt.Color(252, 122, 30));
        jButton3.setText("REGRESSION LINEAIRE");

        jButton4.setBackground(new java.awt.Color(252, 122, 30));
        jButton4.setText("HARDSKILLS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(129, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void addActionListeners() {
        jButton1.addActionListener(e -> openGUI());
        jButton2.addActionListener(e -> openDecisionTree());
        jButton3.addActionListener(e -> openRegressionLineaire());
        jButton4.addActionListener(e -> openPreTraining());
    }

    private void openGUI() {
        gui gui1 = new gui();
        gui1.setVisible(true);
    }

    private void openDecisionTree() {
        weka decisionTree = new weka();
        TreeVisualizer treeVisualizer = decisionTree.getTreeVisualizer();

        if (treeVisualizer != null) {
            JFrame treeFrame = new JFrame("REPTree Visualizer");
            treeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            treeFrame.setSize(800, 600);
            treeFrame.getContentPane().setLayout(new BorderLayout());
            treeFrame.getContentPane().add(treeVisualizer, BorderLayout.CENTER);

            treeFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    treeFrame.dispose();
                }
            });

            treeFrame.setVisible(true);
            treeVisualizer.fitToScreen();
        } else {
            // Handle error or display a message if the TreeVisualizer is null
            JOptionPane.showMessageDialog(this, "Error displaying decision tree.");
        }
    }

    private void openRegressionLineaire() {
        weka2 regression = new weka2();
        ChartPanel regressionChartPanel = regression.getLinearRegressionChart();

        if (regressionChartPanel != null) {
            JFrame regressionFrame = new JFrame("Régression Linéaire");
            regressionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            regressionFrame.setSize(800, 600);
            regressionFrame.getContentPane().setLayout(new BorderLayout());
            regressionFrame.getContentPane().add(regressionChartPanel, BorderLayout.CENTER);

            regressionFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    regressionFrame.dispose();
                }
            });

            regressionFrame.setVisible(true);
        } else {
            // Handle error or display a message if the regressionChartPanel is null
            JOptionPane.showMessageDialog(this, "Error displaying linear regression chart.");
        }
    }


    private void openPreTraining() {
        PreTraining preTraining = new PreTraining();
        preTraining.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buttons().setVisible(true);
            }
        });
    }
}
