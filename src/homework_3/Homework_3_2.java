package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_2 {
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
        Найти минимальный - максимальный элементы и вывести в консоль.
         */

        int max = 0;
        int min = 100;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
            } else if (massive[i] < min) {
                min = massive[i];
            }
        }
        System.out.println("Максимальное значение: " + max + ". Минимальное значение: " + min + ".");
    }
}
