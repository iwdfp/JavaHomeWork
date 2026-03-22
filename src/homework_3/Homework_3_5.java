package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] massive = new int[size];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(massive));

        /*
        Пройти по массиву и поменять местами элементы первый и последний, второй
        и предпоследний и т.д.
         */

        int temp;
        for (int i = 0; i < massive.length / 2; i++) {
            temp = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(massive));
    }
}
