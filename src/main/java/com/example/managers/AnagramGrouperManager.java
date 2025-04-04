package com.example.managers;

import java.util.ArrayList;
import java.util.HashMap;

public class AnagramGrouperManager {

    public static ArrayList<ArrayList<String>> groupAnagrams(ArrayList<String> wordsList) {

        if (wordsList.isEmpty())
            return new ArrayList<>();

        HashMap<String, ArrayList<String>> frequencyWordsMap = new HashMap<>();
        for (String word : wordsList) {

            String characterFrequency = CharacterFrequencyCounterManager.getCharacterFrequency(word);

            if (frequencyWordsMap.containsKey(characterFrequency)) {
                frequencyWordsMap.get(characterFrequency).add(word);
            } else {
                ArrayList<String> anagramGroups = new ArrayList<>();
                anagramGroups.add(word);
                frequencyWordsMap.put(characterFrequency, anagramGroups);
            }
        }

        return new ArrayList<>(frequencyWordsMap.values());
    }
}
