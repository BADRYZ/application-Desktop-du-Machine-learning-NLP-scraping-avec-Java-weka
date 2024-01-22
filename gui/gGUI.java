package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import traitEmploi.*;
import traitMjob.*;
import traitRekrute.*;
public class GUI extends JFrame {

    public GUI() {
        setTitle("Beautiful Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create a panel for the content with GridLayout
        JPanel contentPanel = new JPanel(new GridLayout(3, 1));

        // Load and resize the image
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\UR\\Desktop\\cours\\JAVA\\Projet\\mjob\\BANA\\background.jpg");
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Add resized image to the center
        JLabel imageLabel = new JLabel(resizedIcon);
        contentPanel.add(new JPanel()); // Empty panel to fill space
        contentPanel.add(imageLabel);

        // Add button at the center
        JButton beautifulButton = new JButton("TO THE REAL WORLD!!");
        beautifulButton.setBackground(new Color(0xFFDD95));
        beautifulButton.setForeground(new Color(0xFF9843));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(beautifulButton);
        contentPanel.add(buttonPanel);

        // Set content panel to the frame
        setContentPane(contentPanel);

        // Add ActionListener to the "TO THE REAL WORLD!!" button
        beautifulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openPage2();
            }
        });
    }

    private void openPage2() {
        // Create a new frame for page 2
        JFrame page2Frame = new JFrame("Page 2");

        // Set up the frame for page 2
        page2Frame.setSize(400, 200);
        page2Frame.setLocationRelativeTo(null);

        // Create a panel for page 2
        JPanel page2Panel = new JPanel();
        page2Panel.setLayout(new FlowLayout());

        // Create buttons for "Avant Traitement"
        JButton avantEmploiButton = new JButton("Emploi1");
        JButton avantRekruteButton = new JButton("Rekrute1");
        JButton avantMJobButton = new JButton("M-Job1");

        // Add ActionListener to the "Emploi1" button
        avantEmploiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ziko1 Ziko1 = new ziko1();
                Ziko1.main(null);  // You may want to pass appropriate arguments
            }
        });

        // Add ActionListener to the "Rekrute1" button
        avantRekruteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch1 Ch1 = new ch1();
                Ch1.main(null);  // You may want to pass appropriate arguments
            }
        });

        // Add ActionListener to the "M-Job1" button
        avantMJobButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visual visual1 = new visual();
                visual1.main(null);  // You may want to pass appropriate arguments
            }
        });

        // Add buttons to the panel for "Avant Traitement"
        page2Panel.add(avantEmploiButton);
        page2Panel.add(avantRekruteButton);
        page2Panel.add(avantMJobButton);

        // Create buttons for "Après Traitement"
        JButton apresEmploiButton = new JButton("Emploi2");
        JButton apresRekruteButton = new JButton("Rekrute2");
        JButton apresMJobButton = new JButton("M-Job2");

        // Add ActionListener to the "Emploi2" button
        apresEmploiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ziko2 Ziko2 = new ziko2();
                Ziko2.main(null);  // You may want to pass appropriate arguments
            }
        });

        // Add ActionListener to the "Rekrute2" button
        apresRekruteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch2 Ch2 = new ch2();
                Ch2.main(null);  // You may want to pass appropriate arguments
            }
        });

        // Add ActionListener to the "M-Job2" button
        apresMJobButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vis Vis1 = new vis();
                Vis1.main(null);  // You may want to pass appropriate arguments
            }
        });

        // Add buttons to the panel for "Après Traitement"
        page2Panel.add(apresEmploiButton);
        page2Panel.add(apresRekruteButton);
        page2Panel.add(apresMJobButton);

        // Add the panel to the frame for page 2
        page2Frame.add(page2Panel);

        // Set the layout manager for the frame for page 2
        page2Frame.setLayout(new FlowLayout());

        // Display the frame for page 2
        page2Frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI beautifulHomePage = new GUI();
            beautifulHomePage.setVisible(true);
        });
    }
}
