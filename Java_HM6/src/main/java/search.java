import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        List<Laptops> laptops = new ArrayList<>();
        laptops.add(new Laptops("ASUS", "black", 8, 4, 29990));
        laptops.add(new Laptops("ASUS", "red", 16, 6, 39990));
        laptops.add(new Laptops("Acer", "black", 8, 4, 29990));
        laptops.add(new Laptops("Acer", "blue", 16, 6, 39990));
        laptops.add(new Laptops("Dell", "silver", 8, 4, 29990));
        laptops.add(new Laptops("Dell", "black", 16, 6, 39990));

        Scanner sr = new Scanner(System.in);
        System.out.print("Введите минимальное количество RAM -> ");
        int minRam = sr.nextInt();

        for (Laptops laptop : laptops) {
            if (laptop.getRam() >= minRam){
                laptop.preview();
            }

        }

    }
}
