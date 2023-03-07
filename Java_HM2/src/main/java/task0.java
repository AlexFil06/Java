public class task0 {
//    1. Напишите метод, который принимает на вход строку (String)
//    и определяет является ли строка палиндромом (возвращает boolean значение).
    public static void main(String[] args) {
        boolean resalt =  palindrom("мадам");
        System.out.print(resalt);
    }

    private static boolean palindrom(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
