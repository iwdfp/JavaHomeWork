package homework_8;

/*
2. Упорядочить и вывести строки в порядке возрастания значений их длины.
*/

import java.util.Arrays;
import java.util.Scanner;

public class homework_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String zero = scanner.next();
        System.out.println("Введите строку 2: ");
        String one = scanner.next();
        System.out.println("Введите строку 3: ");
        String two = scanner.next();

        String[] all = {zero, one, two};
        for (int i = 0; i < all.length - 1; i++) {
            for (int j = i + 1; j < all.length; j++) {
                if (all[i].length() > all[j].length()) {
                    String temp = all[i];
                    all[i] = all[j];
                    all[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(all));
    }
}
