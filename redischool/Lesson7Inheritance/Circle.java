package redischool.Lesson7Inheritance;

public class Circle implements Shapes {
    int radius;

    Circle(int r){
        this.radius = r;
    }
    @Override
    public double area() {
        return radius* Math.PI *2;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
