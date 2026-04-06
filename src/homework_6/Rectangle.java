package homework_6;

public class Rectangle extends Form {

    public Rectangle(int side, int side2) {
        super(side, side2, 0, 0);
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр прямоугольника равен " + (side * 2 + side2 * 2) + " см");
    }

    @Override
    public void area() {
        System.out.println("Площадь прямоугольника равна " + (side * side2) + " см");
    }

    @Override
    public int perimetr1() {
        return side * 2 + side2 * 2;
    }
}
