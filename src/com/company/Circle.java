package com.company;

import java.util.Arrays;

public class Circle extends PlaneShape {
    private double radius;
    private double perimeter;
    private double area;
    private double vertices;

    public Circle(Point[] vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public Point[] getVertices() {
        return super.getVertices();
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "\nCircle{" + Arrays.toString(getVertices()) + " radius=" + radius + ", perimeter=" + perimeter +
                ", area=" + area + '}';
    }
}
