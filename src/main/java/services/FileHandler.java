package services;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import models.Exam;

public class FileHandler {

    private static final String STORAGE_PATH = "..\\storage";

    public static void saveToCSV(String[] data, String filename) throws IOException {
        String filePath = STORAGE_PATH + filename + ".csv";
        FileWriter outputfile = new FileWriter(filePath, true);
        CSVWriter writer = new CSVWriter(outputfile);

        writer.writeNext(data);
        writer.close();
    }

    public static File[] getFiles() {
        File folder = new File(STORAGE_PATH);
        File[] files = folder.listFiles();

        return files;
    }
    public static ArrayList<Exam> getDataFromFile(File file) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(file));
        ArrayList<Exam> data = new ArrayList<Exam>();

        String[] nextLine;
        try {
            while ((nextLine = reader.readNext()) != null) {
                Exam exam = new Exam(nextLine[0], nextLine[1], nextLine[2], nextLine[3], Integer.parseInt(nextLine[4]));
                data.add(exam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    public static List<String> getFileNames(File[] files) {
        List<String> fileNames = new ArrayList<String>();
        for (File file : files) {
            fileNames.add(file.getName());
        }
        return fileNames;
    }
    public static File findFile(File[] files, String filename) {
        for (File file: files) {
            if (file.getName().equals(filename)) {
                return file;
            }
        }
        return null;
    }
}

