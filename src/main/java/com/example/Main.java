package com.example;

import com.example.managers.AnagramGrouperManager;
import com.example.managers.FileReaderManager;
import com.example.managers.FileWriterManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final String sampleFilePath = "src/main/java/com/example/files/sample.txt";
        final String resultFilePath = "src/main/java/com/example/files/result.txt";

        ArrayList<String> wordsList = FileReaderManager.writeFromFileToList(sampleFilePath);
        ArrayList<ArrayList<String>> groupedAnagramsList = AnagramGrouperManager.groupAnagrams(wordsList);
        FileWriterManager.writeFromListToFile(resultFilePath, groupedAnagramsList);

    }
}