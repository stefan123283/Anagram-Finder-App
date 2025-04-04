package com.example.managers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileReaderManager {

    public static ArrayList<String> writeFromFileToList(String filePath) {
        BufferedReader bufferedReader = null;
        ArrayList<String> wordsList = new ArrayList<String>();

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String word;
            while ((word = bufferedReader.readLine()) != null) {
                wordsList.add(word.toLowerCase());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return wordsList;
    }

}
