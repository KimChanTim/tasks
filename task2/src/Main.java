import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 3, 1, 5, 6, 0, 7, 8, 9};
        System.out.println(Arrays.toString(arr));

        // сортировка по возрастанию
        Arrays.sort(arr, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr));
        
        // сортировка по убыванию
        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr));
    }
}