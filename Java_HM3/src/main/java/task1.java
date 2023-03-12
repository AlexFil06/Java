import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rnd.nextInt(100));
        }
        System.out.println(arrayList);
        int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
        double average = (double) sum / arrayList.size();
        int min = Collections.min(arrayList);
        int max = Collections.max(arrayList);
        System.out.printf("Среднее арифметическое -> %.2f%n Минимальное значение -> %d%n" +
                "Максимальное значение -> %d",average, min, max);


    }


}
