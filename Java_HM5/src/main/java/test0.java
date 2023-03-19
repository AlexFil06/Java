//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности


import java.util.*;

public class test0 {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Петр Петин", "Иван Иванов", "Иван Ежов", "Иван Иванов", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Мария Савина", "Иван Иванов", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> countName = new HashMap<>();
        for (String name : names) {
            if (countName.containsKey(name)) {
                int count = countName.get(name);
                countName.put(name, count + 1);
            } else {
                countName.put(name, 1);
            }
        }
        System.out.println(countName);







    }

}

