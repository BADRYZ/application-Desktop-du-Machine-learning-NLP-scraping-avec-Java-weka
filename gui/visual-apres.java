package traitMjob;

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

public class vis {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel dashboardPanel = new JPanel(new BorderLayout());

        // Table
        JPanel tablePanel = createTablePanel();
        dashboardPanel.add(tablePanel, BorderLayout.NORTH);

        // Other Charts
        JPanel chartsPanel = new JPanel(new GridLayout(3, 1));

        // Type de contrat Chart
        JPanel typeContratPanel = createChartPanel("Type de contrat Distribution", "Type de contrat", "Count", "typedecontrat", "java2");
        chartsPanel.add(typeContratPanel);

        // Niveau d'études Chart
        JPanel niveauEtudesPanel = createChartPanel("Niveau d'études Distribution", "Niveau d'études", "Count", "niveaudetude", "java2");
        chartsPanel.add(niveauEtudesPanel);

        // Langue Chart
        JPanel languePanel = createChartPanel("Langue Distribution", "Langue", "Count", "langue", "java2");
        chartsPanel.add(languePanel);

        dashboardPanel.add(chartsPanel, BorderLayout.CENTER);

        frame.getContentPane().add(dashboardPanel, BorderLayout.CENTER);

        frame.setSize(1200, 800);
        frame.setVisible(true);
    }

    private static JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apres_tr?useSSL=false", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT typedecontrat, niveaudetude, langue FROM java2")) {

            java.util.List<Object[]> dataList = new java.util.ArrayList<>();

            // Populate the data list
            int rowCount = 0;
            while (resultSet.next() && rowCount < 500) {
                Object[] row = new Object[3];
                row[0] = resultSet.getObject("typedecontrat");
                row[1] = resultSet.getObject("niveaudetude");
                row[2] = resultSet.getObject("langue");
                dataList.add(row);
                rowCount++;
            }

            // Convert the list to a 2D array
            Object[][] data = new Object[dataList.size()][3];
            dataList.toArray(data);

            // Create a JTable with the data
            String[] columnNames = {"Type de contrat", "Niveau d'étude", "Langue"};
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);

            panel.add(scrollPane, BorderLayout.CENTER);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database or retrieving data.");
        }

        return panel;
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

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apres_tr", "root", "");
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
}