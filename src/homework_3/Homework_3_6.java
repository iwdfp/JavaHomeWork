package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] massive = new int[size];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(massive));

        /*
        Проверить, является ли массив возрастающей последовательностью (каждое
        следующее число больше предыдущего).
         */

        boolean up = true;
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] > massive[i + 1]) {
                System.out.println("Массив не является возрастающей последовательностью");
                up = false;
                break;
            }
        }
        if (up) {
            System.out.println("Массив является возрастающей последовательностью");
        }
    }
}
