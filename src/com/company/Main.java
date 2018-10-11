package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println(randomWord());
    }
    public static String randomWord(){
        // Given the array list, print a random word
        // from the list: (module, class, implement).
        ArrayList<String> words = new ArrayList<>();
        words.add("module"); // 0
        words.add("class"); // 1
        words.add("implement"); // 2
        int wordIndex = rand.nextInt(words.size() - 1);
        String oneWord = words.get(wordIndex);
        return oneWord;
    }


}
