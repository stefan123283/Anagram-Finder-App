package com.example.managers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterManager {

    private static final String regex = "\\[|\\]|,";

    public static void writeFromListToFile(String filePath, ArrayList<ArrayList<String>> groupedAnagramsList) {
        BufferedWriter bufferedWriter = null;
        try {

            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (ArrayList<String> anagramGroups : groupedAnagramsList) {
                bufferedWriter.write(anagramGroups.toString().replaceAll(regex, "") + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {

                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Check the result file for grouped anagrams!");
    }

}

