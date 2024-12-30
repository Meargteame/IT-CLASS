// GeometricObject and its Subclasses
import java.util.Date;

class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(String c, boolean f) {
        this.color = c;
        this.filled = f;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
        System.out.println("Date Created: " + dateCreated);
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(String c, boolean f, double rad) {
        super(c, f);
        this.radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Diameter: " + getDiameter());
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(String c, boolean f, double w, double h) {
        super(c, f);
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printRectangle() {
        displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

// Animal and its Subclasses
class Animal {
    private String name;
    private String color;

    public Animal(String n, String c) {
        this.name = n;
        this.color = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    private int hairBall;

    public Cat(String n, String c, int h) {
        super(n, c);
        this.hairBall = h;
    }

    public int getHairBall() {
        return hairBall;
    }

    public void setHairBall(int h) {
        this.hairBall = h;
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

class Dog extends Animal {
    private int fleas;

    public Dog(String n, String c, int f) {
        super(n, c);
        this.fleas = f;
    }

    public int getFleas() {
        return fleas;
    }

    public void setFleas(int f) {
        this.fleas = f;
    }

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Test Program
import java.util.Scanner;

public class TestInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Test GeometricObject and Subclasses
        System.out.println("Enter Circle details:");
        System.out.print("Color: ");
        String circleColor = scanner.nextLine();
        System.out.print("Filled (true/false): ");
        boolean circleFilled = scanner.nextBoolean();
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(circleColor, circleFilled, radius);
        circle.printCircle();

        System.out.println("\nEnter Rectangle details:");
        System.out.print("Color: ");
        scanner.nextLine(); // Consume leftover newline
        String rectColor = scanner.nextLine();
        System.out.print("Filled (true/false): ");
        boolean rectFilled = scanner.nextBoolean();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectColor, rectFilled, width, height);
        rectangle.printRectangle();

        // Test Animal and Subclasses
        System.out.println("\nEnter Cat details:");
        System.out.print("Name: ");
        scanner.nextLine(); // Consume leftover newline
        String catName = scanner.nextLine();
        System.out.print("Color: ");
        String catColor = scanner.nextLine();
        System.out.print("Hairball count: ");
        int hairBall = scanner.nextInt();
        Cat cat = new Cat(catName, catColor, hairBall);
        System.out.println("Cat Info:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Color: " + cat.getColor());
        System.out.println("Hairballs: " + cat.getHairBall());
        cat.sound();

        System.out.println("\nEnter Dog details:");
        System.out.print("Name: ");
        scanner.nextLine(); // Consume leftover newline
        String dogName = scanner.nextLine();
        System.out.print("Color: ");
        String dogColor = scanner.nextLine();
        System.out.print("Flea count: ");
        int fleas = scanner.nextInt();
        Dog dog = new Dog(dogName, dogColor, fleas);
        System.out.println("Dog Info:");
        System.out.println("Name: " + dog.getName());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Fleas: " + dog.getFleas());
        dog.sound();

        scanner.close();
    }
}
