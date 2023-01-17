import java.util.List;

/*// This violates the Open Closed Principle since it is not closed for modification (we need to modify the calculateArea method whenever we add a new type of share)
class Shape {
    double width;
    double height;

    public double calculateArea(List<Shape> shapes) {
        double area = 0;
        for (var shape : shapes) {
            // Here it violates the Closed for modification rule because whenever we need to add on more type like rectangle and circle, we will need to modify this code
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.width * rectangle.height;
            } else {
                Circle circle = (Circle) shape;
                area += circle.radius * circle.height * Math.PI;
            }
        }
        return area;
    }
}

class Rectangle extends Shape {

}


class Circle extends Shape {
    double radius;
}*/


//Avoiding the violation
abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}


class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }
}

class  ShapeManager {
    // Closed for modification (you can add any shape without modifying this closed section)
    public double calculateTotalArea(List<Shape> shapes) {
        double area = 0;
        for (var shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }
}
