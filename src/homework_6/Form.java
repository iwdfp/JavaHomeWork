package homework_6;

public abstract class Form {

    public int side;
    public int side2;
    public int side3;
    public int height;

    public Form(int side, int side2, int side3, int height) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public abstract void perimetr();
    public abstract void area();

    public abstract int perimetr1(); //для возврата значений, чтоб вычислить сумму всех периметров в массиве
}
