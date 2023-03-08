import java.io.*;

public class task1 {
//    2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту
//    строку в простой текстовый файл, обработайте исключения.
    public static void main(String[] args)  {
        stringInFile("TEST");
    }

    private static void stringInFile(String word)  {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(word);

        }
        File test = new File("C:\\Users\\1\\Desktop\\Java_HM\\Java_HM2\\src\\main\\resources1\\test.txt");
        if(!test.isFile()){
            throw new RuntimeException("Неверная директория");
        }

        PrintWriter dir = null;
        try {
            dir = new PrintWriter(test);
            dir.print(sb);
            System.out.print("Файл записан");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            dir.close();
        }




    }
}
