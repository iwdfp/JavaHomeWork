package homework_8;

/*
Ввести 3 строки с консоли.
1. Найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */

import java.util.Scanner;

public class homework_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String zero = scanner.next();
        System.out.println("Введите строку 2: ");
        String one = scanner.next();
        System.out.println("Введите строку 3: ");
        String two = scanner.next();

        String max;
        String min;
        if (zero.length() > one.length()) {
            max = zero;
            min = one;
        } else {
            max = one;
            min = zero;
        }

        if (two.length() > max.length()) {
            max = two;
        } else if (two.length() < min.length()) {
            min = two;
        }
        System.out.println("Самая короткая строка: ".concat(min).concat(" с кол-вом символов: ").concat(String.valueOf(min.length())
                .concat(", самая длинная строка: ").concat(max).concat(" с кол-вом символов: ").concat(String.valueOf(max.length()))));
    }
}
