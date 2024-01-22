package traitRekrute;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ch2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel dashboardPanel = new JPanel(new BorderLayout());

        // Table
        JPanel tablePanel = createTablePanel();
        dashboardPanel.add(tablePanel, BorderLayout.NORTH);

        // Other Charts
        JPanel chartsPanel = new JPanel(new GridLayout(2, 2));

        // Teletravail Pie Chart
        JPanel teletravailPanel = createTeletravailChartPanel();
        chartsPanel.add(teletravailPanel);

        // Niveau d'études Chart
        JPanel niveauEtudesPanel = createChartPanel("Niveau d'études Distribution", "Niveau d'études", "Count", "niveaudetude", "java2");
        chartsPanel.add(niveauEtudesPanel);

        // Type de contrat Chart
        JPanel typeContratPanel = createChartPanel("Type de contrat Distribution", "Type de contrat", "Count", "typedecontrat", "java2");
        chartsPanel.add(typeContratPanel);

        // Experience Bar Chart
        JPanel experiencePanel = createExperienceChartPanel();
        chartsPanel.add(experiencePanel);

        dashboardPanel.add(chartsPanel, BorderLayout.CENTER);

        frame.getContentPane().add(dashboardPanel, BorderLayout.CENTER);

        frame.setSize(1200, 800);
        frame.setVisible(true);
    }

    private static JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ch2?useSSL=false", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT titre, datedepostule, region, secteurdactivite, typedecontrat, niveaudetude, experience, teletravail FROM java2")) {

            java.util.List<Object[]> dataList = new java.util.ArrayList<>();

            // Populate the data list
            int rowCount = 0;
            while (resultSet.next() && rowCount < 500) {
                Object[] row = new Object[8];
                row[0] = resultSet.getObject("titre");
                row[1] = resultSet.getObject("datedepostule");
                row[2] = resultSet.getObject("region");
                row[3] = resultSet.getObject("secteurdactivite");
                row[4] = resultSet.getObject("typedecontrat");
                row[5] = resultSet.getObject("niveaudetude");
                row[6] = resultSet.getObject("experience");
                row[7] = resultSet.getObject("teletravail");
                dataList.add(row);
                rowCount++;
            }

            // Convert the list to a 2D array
            Object[][] data = new Object[dataList.size()][8];
            dataList.toArray(data);

            // Create a JTable with the data
            String[] columnNames = {"titre", "datedepostule", "region", "secteurdactivite", "typedecontrat", "niveaudetude", "experience", "teletravail"};
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);

            panel.add(scrollPane, BorderLayout.CENTER);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database or retrieving data.");
        }

        return panel;
    }

    private static JPanel createTeletravailChartPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultPieDataset dataset = createTeletravailDataset();

        JFreeChart chart = ChartFactory.createPieChart(
                "Teletravail Distribution",
                dataset
        );

        // Customize the chart appearance
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setExplodePercent("Oui", 0.20);

        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel, BorderLayout.CENTER);

        return panel;
    }

    private static DefaultPieDataset createTeletravailDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ch2", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT teletravail, COUNT(*) FROM java2 GROUP BY teletravail")) {

            while (resultSet.next()) {
                String teletravail = resultSet.getString("teletravail");
                int count = resultSet.getInt(2);
                dataset.setValue(teletravail, count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database or retrieving data.");
        }

        return dataset;
    }

    private static JPanel createChartPanel(String chartTitle, String categoryAxisLabel, String valueAxisLabel, String columnName, String tableName) {
        JPanel panel = new JPanel(new BorderLayout());

        CategoryDataset dataset = createDataset(columnName, tableName);

        JFreeChart chart = ChartFactory.createBarChart(
                chartTitle,
                categoryAxisLabel,
                valueAxisLabel,
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel, BorderLayout.CENTER);

        return panel;
    }

    private static CategoryDataset createDataset(String columnName, String tableName) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ch2", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT " + columnName + ", COUNT(*) FROM " + tableName + " GROUP BY " + columnName)) {

            while (resultSet.next()) {
                String category = resultSet.getString(columnName);
                int count = resultSet.getInt(2);
                dataset.addValue(count, "Count", category);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database or retrieving data.");
        }

        return dataset;
    }

    private static JPanel createExperienceChartPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        CategoryDataset dataset = createDataset("experience", "java2");

        JFreeChart chart = ChartFactory.createBarChart(
                "Experience Distribution",
                "Experience",
                "Count",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel, BorderLayout.CENTER);

        return panel;
    }
}