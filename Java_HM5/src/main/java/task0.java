
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;

public class task0 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> contacts = new HashMap<>();
        contacts.put("иванов", new ArrayList<>(Arrays.asList("891512548","8955125489")));
        contacts.put("петров", new ArrayList<>(Arrays.asList("891484544","8951254825")));
        contacts.put("сидоров", new ArrayList<>(Arrays.asList("895121445","8920145221","8951452547")));

        for (String name : contacts.keySet()) {
            System.out.println(name + ": " + contacts.get(name));
            System.out.println();
        }

    }

}