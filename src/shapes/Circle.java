package shapes;


import java.util.Scanner;

public class Circle {

//    private static Scanner scan = new Scanner(System.in);
//    double area;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double a = Math.PI * radius * radius;
        return a;

    }

    public double getCircumference() {
//        System.out.println("circumference?");
        double circum = Math.PI * 2 * radius;
//        scan.nextDouble();
//        System.out.println(circum * radius);
        return circum;
    }
}
