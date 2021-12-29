package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Point[] pointOfTriangle = new Point[3];
        pointOfTriangle[0] = new Point(1, 1);
        pointOfTriangle[1] = new Point(5, 4);
        pointOfTriangle[2] = new Point(2, 6);
        Triangle triangle = new Triangle(pointOfTriangle);
        triangle.getPerimeter();
        triangle.getArea();

        Point[] pointOfRectangle = new Point[1];
        pointOfRectangle[0] = new Point(5, 5);
        Rectangle rectangle = new Rectangle(pointOfRectangle, 5.1, 3.2);
        rectangle.getPerimeter();
        rectangle.getArea();

        Point[] pointOfCircle = new Point[1];
        pointOfCircle[0] = new Point(3.2, 2.6);
        Circle circle = new Circle(pointOfCircle, 6.2);
        circle.getPerimeter();
        circle.getArea();

        Point[] pointOfSquarePiramid = new Point[1];
        pointOfSquarePiramid[0] = new Point(5.1, 2.3, 3.0);
        SquarePyramid squarePyramid = new SquarePyramid(pointOfSquarePiramid, 12.1, 15.3);
        squarePyramid.getArea();
        squarePyramid.getVolume();

        Point[] pointOfcuboid = new Point[1];
        pointOfcuboid[0] = new Point(2.2, 3.3, 2.8);
        Cuboid cuboid = new Cuboid(pointOfcuboid, 2.5, 2.5, 2.5);
        cuboid.getArea();
        cuboid.getVolume();

        Point[] pointOfSphere = new Point[1];
        pointOfSphere[0] = new Point(3.2, 2.3, 3.2);
        Sphere sphere = new Sphere(pointOfSphere, 3.6);
        sphere.getArea();
        sphere.getVolume();

        Shape[] shape = new Shape[6];
        shape[0] = triangle;
        shape[1] = rectangle;
        shape[2] = circle;
        shape[3] = squarePyramid;
        shape[4] = cuboid;
        shape[5] = sphere;
        System.out.println(Arrays.toString(shape));
    }
}
