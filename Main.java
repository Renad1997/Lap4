//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Rectangle rectangle1 = new Rectangle(2,2);
      Circle circle1 = new Circle(3);
      Triangle triangle1 = new Triangle(3,3);


        System.out.println("The Area of Rectangle is: " + rectangle1.calculateArea());
        System.out.println("The Circumference of Rectangle is: " +rectangle1.calculateCircumference());


        System.out.println("The Area of Circle is: " + circle1.calculateArea());
        System.out.println("The Circumference of Circle is: " + circle1.calculateCircumference());

        System.out.println("The Area of Triangle is: " + triangle1.calculateArea());
        System.out.println("The Circumference of Triangle is: " + triangle1.calculateCircumference());

    }
}