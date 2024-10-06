import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите количество чисел: ");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();

        }
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        System.out.println("Сумма всех элементов массива равна: " + sum);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        int max = array[array.length - 1];
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Наибльшее число в массиве равно: " + max );
    }
}