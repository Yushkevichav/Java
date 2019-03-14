/**
 * Java 2. Lesson 3
 *
 * @author Andrey Yushkevich
 * version dated March 06, 2019
 */

package yushkevich.java_2.lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> pb;

    public Phonebook() {
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("Contact " + name + " / Phone number " + pb.getOrDefault(name, new HashSet<>()));
    }
}
