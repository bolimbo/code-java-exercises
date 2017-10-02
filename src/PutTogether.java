import shapes.Circle;
import util.Input;

import java.util.Scanner;

public class PutTogether {
//    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Person person = new Person("carlo");
        System.out.println(person.getName());
        person.setName("Antonio");
        System.out.println(person.getName());

        person.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        Input input = new Input();
        Double userInput = input.getDouble(1, 100);


        Circle circle = new Circle(userInput);
        System.out.println("The area of your circle is " + circle.getArea());
        System.out.println("The circumference of your circle is " + circle.getCircumference());

    }
}

