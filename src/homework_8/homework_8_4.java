package homework_8;

/*
4. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
 */

import java.util.Scanner;

public class homework_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String zero = scanner.next();
        System.out.println("Введите строку 2: ");
        String one = scanner.next();
        System.out.println("Введите строку 3: ");
        String two = scanner.next();

        String[] all = {zero, one, two};
        for (String word : all) {
            boolean unique = true;
            for (int i = 0; i < word.length(); i++) {
                if (word.indexOf(word.charAt(i)) != word.lastIndexOf(word.charAt(i))) { //если символ встречается один раз, то значения будут одинаковые и наоборот
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(word);
                break;
            }
        }
    }
}
