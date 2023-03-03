public class task2 {
//3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    public static void main(String[] args) {
        offsetInArray();

    }

    private static void offsetInArray() {
        int[] arr = new int[] {3, 2, 2, 3, 1, 3, 1, 2, 3};
        int val = 3;
        int t = 0;
        int last = arr.length-1;
        for (int i = 0; i < last; i++) {
            if (arr[i] == val) {
                while (arr[last] == val && last > i) {
                    last--;
                }
                t = arr[i];
                arr[i] = arr[last];
                arr[last] = t;
                last--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

