//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
import java.util.Scanner;
import java.util.Stack;

public class task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackList = new Stack<>();
        while (true){
            System.out.printf("Введите строку или команду print / revert -> ");
            String word = sc.nextLine();
            switch (word){
                case "print":
                    while (!stackList.empty()){
                        System.out.println(stackList.pop());
                    }
                    break;
                case "revert":
                    if(!stackList.empty()){
                        stackList.pop();
                    }
                    break;
                default:
                    stackList.push(word);
                    break;
            }
        }
    }
}
