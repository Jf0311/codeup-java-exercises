package Shapes;

public class Square extends Rectangle {

    @Override
    public int getArea() {
        return (int) Math.pow(length,2);
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }

    public Square(int side) {
        super(side,side);
    }

}
