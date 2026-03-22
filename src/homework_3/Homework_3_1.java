package homework_3;

/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_1 {
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
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
         */

        for (int number : massive) {
            System.out.println(number);
        }
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.println(massive[i]);
        }
    }
}
