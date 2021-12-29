package com.company;

import java.util.Arrays;

public class Rectangle extends PlaneShape {
    private double height;
    private double width;
    private double perimeter;
    private double area;


    public Rectangle(Point[] vertices, double height, double width) {
        super(vertices);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (height + width);
        return perimeter;
    }

    @Override
    public double getArea() {
        area = height * width;
        return area;
    }

    @Override
    public String toString() {
        return "\nRectangle{" + Arrays.toString(getVertices()) + " height=" + height + ", width=" + width +
                ", perimeter=" + perimeter + ", area=" + area + '}';
    }
}
