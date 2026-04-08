package homework_9;

/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework_9_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] symbols = new String[3];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = scanner.nextLine();
        }

        Map<String, Integer> count = new HashMap<>();
        for (String repeat : symbols) {
            if (count.containsKey(repeat)) {
                count.put(repeat, count.get(repeat) + 1);
            } else {
                count.put(repeat, 1);
            }
        }

        Map<String, Boolean> res = new HashMap<>();
        for (String result : count.keySet()) {
            if (count.get(result) >= 2) {
                res.put(result, true);
            } else {
                res.put(result, false);
            }
        }
        System.out.println(res);
    }
}
