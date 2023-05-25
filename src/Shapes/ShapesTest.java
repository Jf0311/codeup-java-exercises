package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        int area1 = box1.getArea();
        int perimeter1 = box1.getPerimeter();

        System.out.printf("The perimeter is : %d%n ", area1);
        System.out.printf("The area is : %d%n ", perimeter1);


        Rectangle box2 = new Square(5);
        int area2 = box2.getArea();
        int perimeter2 = box2.getPerimeter();
        System.out.printf("The perimeter is : %d%n ", area2);
        System.out.printf("The area is : %d%n ", perimeter2);



    }
}
