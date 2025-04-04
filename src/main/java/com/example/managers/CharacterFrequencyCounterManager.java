package com.example.managers;

public class CharacterFrequencyCounterManager {

    public static String getCharacterFrequency(String word) {

        int[] characterFrequencies = new int[26];

        for (char character : word.toCharArray()) {
            characterFrequencies[character - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder();
        char character = 'a';
        for (int characterFrequency : characterFrequencies) {
            frequencyString.append(character);
            frequencyString.append(characterFrequency);
            character++;
        }

        return frequencyString.toString();
    }
}
