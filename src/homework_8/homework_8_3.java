package homework_8;

/*
3. Вывести на консоль те строки, длина которых меньше средней, а также их длину
*/

import java.util.Scanner;

public class homework_8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String zero = scanner.next();
        System.out.println("Введите строку 2: ");
        String one = scanner.next();
        System.out.println("Введите строку 3: ");
        String two = scanner.next();

        int avgLength = (zero.length() + one.length() + two.length()) / 3;
        String[] all = {zero, one, two};

        for (int i = 0; i < all.length; i++) {
            if (all[i].length() < avgLength) {
                System.out.println("Строка: " + all[i].concat(", длина строки ") + (all[i].length()));
            }
        }
    }
}
