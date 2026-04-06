package homework_8;

/*
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */

public class homework_8_5 {
    public static void main(String[] args) {
        String other = "balalaika";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < other.length(); i++) {
            char c = other.charAt(i);
            result.append(c).append(c);
        }
        System.out.println(result.toString());
    }
}
