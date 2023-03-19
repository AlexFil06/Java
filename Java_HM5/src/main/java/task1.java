//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности

import java.util.*;

public class task1 {
    public static void main(String[] args) {


        String[] names = {"Петр Петин", "Иван Иванов", "Иван Ежов", "Иван Иванов", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Мария Савина", "Иван Иванов", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<Integer, ArrayList<String>> countNames = new HashMap<>();

        for (int i = 0; i < names.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    count++;
                }

            }
            ArrayList<String> list = countNames.getOrDefault(count, new ArrayList<>());
            list.add(names[i]);
            countNames.put(count, list);
        }
        Map<Integer, ArrayList<String>> countNamesSort = new TreeMap<>(Comparator.reverseOrder());
        countNamesSort.putAll(countNames);
        for (Integer name : countNamesSort.keySet()) {
            System.out.println(name + ": " + countNamesSort.get(name));
            System.out.println();

        }
    }
}