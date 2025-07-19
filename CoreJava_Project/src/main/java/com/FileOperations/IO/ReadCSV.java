package com.FileOperations.IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "/home/chaitanyassm/Documents/TestData.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] cells = line.split(",");
                for (String cell : cells) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
