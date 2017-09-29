package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("enter a radius");

        Circle mycircle = new Circle(input.getDouble());

        System.out.println("area ia " + mycircle.getArea());
        System.out.println("the circumference is " + mycircle.getCircumference());

    }
}
