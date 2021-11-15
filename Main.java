

class Shape {
    protected String color;
    public double area() {
        double area = 0.0;
        //TODO: calculation of the area of any figure
        return area;
    }


}

//SubClass of Shape
class Circle extends Shape {

    private   double radius;
    //The constructor
    public Circle(double radius) {
        this.radius = radius;

    }
    //formula to calculate the area
    public double area() {
        return Math.PI * radius * radius;
    }
}

//Create a new subclass Rectangle of the superclass Shape
    //Implement a constructor based on the width and height of the rectangle
    //Override the area() method with the correct calculation

//Create a new subclass Square
    //Implement a meaningful constructor
    //Question: should Square extend Shape or Rectangle?

public class Main {

    public static void main(String[] args) {

//Test your code
        //Rectangle rectangle = new Rectangle(5, 7);
        //System.out.println("Rectangle area: " + rectangle.area());
        //Square square = new Square(5);
        //System.out.println("Square area: " + square.area());
        //Circle circle = new Circle(3);
        //System.out.println("Circle area: " + circle.area());

    }
}

