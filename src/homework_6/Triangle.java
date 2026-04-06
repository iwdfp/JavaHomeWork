package homework_6;

public class Triangle extends Form {

    public Triangle(int side, int side2, int side3, int height) {
        super(side, side2, side3, height);
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр треугольника равен " + (side + side2 + side3) + " см");
    }

    @Override
    public void area() {
        System.out.println("Площадь треугольника равна " + (side * height / 2) + " см");
    }

    @Override
    public int perimetr1() {
        return side + side2 + side3;
    }
}
