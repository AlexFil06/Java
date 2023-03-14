import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        LinkedList<Integer> res =  reverseList(list);
        System.out.print(res);

    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.addFirst(list.get(i));
        }return newList;
    }
}


