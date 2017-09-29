package shapes;

import java.util.Scanner;

public class ShapesTest {
    public static void main(String[] args) {
        double n;
        Scanner scan = new Scanner(System.in);

//        Rectangle box1 =  new Rectangle(4,5);
//        Rectangle box2 = new Square(5);

//        System.out.println(box1.getPerimeter() +" "+ box1.getArea());
//        System.out.println(box2.getPerimeter() +" "+ box2.getArea());;

        Measurable myShape = new Square(5);
//        System.out.println("enter a number");
//        n = scan.nextDouble();
        System.out.println("area is " + myShape.getArea() + " - " + "perimeter " + myShape.getPerimeter());
        System.out.println(myShape.getArea() + myShape.getPerimeter());

    }
}
