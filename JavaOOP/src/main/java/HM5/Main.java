package HM5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NextPhone> phones = new ArrayList<>();
        phones.add(new NextPhone("Nokia", 1538945, 3.0, 4,2500));
        phones.add(new NextPhone("Samsung", "DA1534325", 4.5, 6,3500));
        phones.add(new NextPhone("Lenovo", "00124588", 3.2, 4,3000));
        phones.add(new NextPhone("Xiaomi", 9951477, 5.2, 6,4000));
        phones.add(new NextPhone("IPhone", 7777777, 2.4, 4,1500));

        for (int i = 0; i < phones.size(); i++) {
            System.out.println(phones.get(i).toString());
        }

        Scanner sr = new Scanner((System.in));
        System.out.print("Ввевдите занчение RAM -> ");
        int minRam = sr.nextInt();

        for (NextPhone phone : phones) {
            if ((Double) phone.getRAM() >= minRam){
                System.out.println(phone.toString());
            }

        }
    }
}
