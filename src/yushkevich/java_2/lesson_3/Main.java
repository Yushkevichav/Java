package yushkevich.java_2.lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Клара", "У", "Карл", "Крала", "Кларнет", "Карл", "У", "Клара", "Свистнул", "Кораллы", "Кларнет"};

        Map<String, Integer> word = new HashMap<>();

        for (String some : name) {
            word.put(some, word.getOrDefault(some, 0) + 1);
        }
        System.out.println(word);

        Phonebook book = new Phonebook();
        book.addContact("Roma", "363487");
        book.addContact("Rita", "870977");
        book.addContact("Kola", "544456");
        book.addContact("Roma", "877765");
        book.addContact("Sena", "877737");
        book.addContact("Sena", "877733");

        book.findAndPrint("Roma");
        book.findAndPrint("Sena");
        book.findAndPrint("Kola");

    }
}