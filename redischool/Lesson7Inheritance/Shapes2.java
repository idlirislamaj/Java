package redischool.Lesson7Inheritance;

import java.util.List;

public class Shapes2 {

    interface Shape {
        double area();
        double circumference();
    }

    static class Rectangle implements Shape {
        private double width;
        private double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }

        @Override
        public double circumference() {
            return 2 * (width + height);
        }

        public String toString(){
            return "Rectangle";
        }
    }

    static class Circle implements Shape {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return radius * radius * Math.PI;
        }

        @Override
        public double circumference() {
            return 2 * radius * Math.PI;
        }

        public String toString(){
            return "Circle";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to create some shapes!");

        List<Shape> shapes = List.of(new Rectangle(10, 4), new Circle(5));

        for (Shape shape : shapes) {
            double area = shape.area();
            double circumference = shape.circumference();
            System.out.println(shape);
            System.out.println("Area is: " + area);
            System.out.println("Circumference is: " + circumference);
        }
    }
}