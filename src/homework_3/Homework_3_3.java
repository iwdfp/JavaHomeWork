package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] massive = new int[size];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(51);
        }
        System.out.println(Arrays.toString(massive));

        /*
        Найти индексы минимального и максимального элементов и вывести в консоль.
         */

        int max = 0;
        int min = 100;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
                indexMax = i;
            } else if (massive[i] < min) {
                min = massive[i];
                indexMin = i;
            }
        }
        System.out.println("Индекс максимального значения: " + indexMax + ". Индекс минимального значения: " + indexMin + ".");

    }
}
