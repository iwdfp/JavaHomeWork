package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_SUPER {
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
        Имеется массив из неотрицательных чисел(любой). Представьте что массив
        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
        добавить единицу к этому “числу” и на выходе получить исправленный массив.
        Массив не содержит нуля в начале, кроме самого числа 0.
         */

        for (int i = massive.length - 1; i >= 0; i--) {
            if (massive[i] == 9) {
                massive[i] = 0;
            } else {
                massive[i]++;
                break;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
