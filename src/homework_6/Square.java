package homework_6;

public class Square extends Form {

    public Square(int side) {
        super(side, 0, 0 ,0);
    }

    @Override
    public void area() {
        System.out.println("Площадь квадрата равна " + (side * side) + " см");
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр квадрата равен " + (side * 4) + " см");
    }

    @Override
    public int perimetr1() {
        return side * 4;
    }
}
