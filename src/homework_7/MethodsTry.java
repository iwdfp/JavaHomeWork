package homework_7;

/*
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try - catch
2. try - catch, где catch будет несколько
3. try - catch, с использованием multi - catch
4. try - catch - finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

public class MethodsTry {
    public void method1(int a, int b) {
        try {
            a = 10;
            b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Метод 1: Нельзя делить на ноль");
        }
    }

    public void method2(int a, int b, String name) {
        try {
            a = 10;
            b = 0;
            name = null;
            System.out.println(name.length());
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Метод 2: Нельзя делить на ноль");
        } catch (NullPointerException e) {
            System.out.println("Метод 2: Нельзя обращаться к null");
        }
    }

    public void method3(int a, int b, String name) {
        try {
            a = 10;
            b = 0;
            name = null;
            System.out.println(name.length());
            System.out.println(a / b);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Метод 3: Косяк где-то");
        }
    }

    public void method4(int a, int b, String name) {
        try {
            a = 10;
            b = 0;
            name = null;
            System.out.println(name.length());
            System.out.println(a / b);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Метод 4: Косяк где-то");
        } finally {
            System.out.println("Метод 4: Код всегда выполняется");
        }
    }
}
