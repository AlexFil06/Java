public class task0 {
// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void main(String[] args) {
        minAndMaxInArr();
    }

    private static void minAndMaxInArr() {
        int[] arr = new int[] {12, 2, 4, 5, 11, 6, 21, 17};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.printf("Максимальное значение -> " + max + " Минимальное значение -> " + min );

    }
}
