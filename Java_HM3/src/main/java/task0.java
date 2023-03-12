import java.util.ArrayList;
import java.util.Random;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class task0 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        for (int i = 0; i < 15; i++) {
            arrayList.add(rnd.nextInt(100));
        }
        System.out.println(arrayList);
        arrayList.removeIf(i -> (i % 2 == 0)); //надеюсь это и имелось ввиду как готовый способ в языке =)
        System.out.println(arrayList);
    }
}
