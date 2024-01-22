/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package machcinelearning;

import weka.core.Instances;
import weka.core.converters.ArffSaver;

import java.io.*;

/**
 *
 * @author pattern
 */

public class LoadData {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

        // get clean arff data
        Instances dataset = new Instances(new BufferedReader(new FileReader("/Embeded.arff")));

        ArffSaver saver = new ArffSaver();
        saver.setInstances(dataset);
        saver.setFile(new File("Embeded2.arff"));
        saver.writeBatch();

    }

}
