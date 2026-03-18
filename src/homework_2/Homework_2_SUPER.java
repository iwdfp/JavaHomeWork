package homework_2;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */
public class Homework_2_SUPER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 2147483647: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int num2 = 1;
            int num3 = 0;

            if (num < 1) System.out.println("Число не может быть меньше 1");
            else {
                while (num2 <= num) {
                    num3 += num2;
                    num2++;
                }
                System.out.println("Сумма всех чисел от 1 до " + num + " = " + num3);
            }
        } else {
            System.out.println("Некорректные данные. Нужно было ввести целое число от 1 до 2147483647");
        }
    }
}
