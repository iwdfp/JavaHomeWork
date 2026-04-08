package homework_9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */

public class Homework_9_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> nums = new HashSet<>();
        String line = scanner.nextLine();
        String[] num = line.split(", ");
        Collections.addAll(nums, num);
        System.out.println(nums);
    }
}
