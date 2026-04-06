package homework_6;

/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */

public class Main {
    public static void main(String[] args) {
        Square square = new Square(23);
        Triangle triangle = new Triangle(12, 8, 6, 5);
        Rectangle rectangle = new Rectangle(32, 47);

        square.perimetr();
        square.area();

        triangle.perimetr();
        triangle.area();

        rectangle.perimetr();
        rectangle.area();

        Form[] shapes = new Form[5];
        shapes[0] = new Square(87);
        shapes[1] = new Triangle(46, 44, 38,  26);
        shapes[2] = new Rectangle(65, 40);
        shapes[3] = new Rectangle(30, 98);
        shapes[4] = new Square(55);

        int totalPerimetr = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalPerimetr += shapes[i].perimetr1();
        }
        System.out.println("Сумма периметров всех фигур равна " + totalPerimetr + " см");
    }
}
