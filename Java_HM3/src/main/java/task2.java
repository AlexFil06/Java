import java.util.ArrayList;
import java.util.Arrays;


//3. Создать список типа ArrayList<String>. Поместить в него как строки,
// так и целые числа. Пройти по списку, найти и удалить целые числа.
public class task2 {
    public static <ioException> void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("строка1", "6", "99", "9","11", "строка2", "12", "2", "строка3", "2", "строка4", "строка5", "строка6", "44"));
        System.out.println(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            try {
//                Integer.parseInt(arrayList.get(i));
//                arrayList.remove(i);
//            }catch (NumberFormatException e){
//            }
//        }
//        System.out.print(arrayList);

        arrayList.removeIf(str -> {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        });
        System.out.print(arrayList);
    }
}

