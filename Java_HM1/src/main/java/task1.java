import java.util.Scanner;

public class task1 {
    //2. Написать метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void main(String[] args) {
        findingLeapYear();

    }

    private static void findingLeapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год для проверки -> ");
        int year = scan.nextInt();
        boolean res = (year % 4 == 0) & (year % 100 != 0) || (year % 400 == 0);
        System.out.println(res);
    }
}
