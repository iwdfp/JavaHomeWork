package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_4 {
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
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        вывести сообщение, что их нет.
         */

        int zero = 0;
        for (int number : massive) {
            if (number == 0) {
                zero++;
            }
        }
        if (zero == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Кол-во нулевых элементов: " + zero);
        }
    }
}
