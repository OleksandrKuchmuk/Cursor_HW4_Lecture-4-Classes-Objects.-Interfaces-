package com.company;

import java.util.Arrays;

public class Triangle extends PlaneShape {
    private double sideA = distance(getVertices()[0], getVertices()[1]);
    private double sideB = distance(getVertices()[1], getVertices()[2]);
    private double sideC = distance(getVertices()[2], getVertices()[0]);
    private double perimeter;
    private double area;
    private double halfPerimeter;


    public Triangle(Point[] vertices) {
        super(vertices);

    }

    @Override
    public double getPerimeter() {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public double getArea() {
        halfPerimeter = perimeter / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        return area;
    }

    @Override
    public String toString() {
        return "\nTriangle{" + Arrays.toString(getVertices()) + " sideA=" + sideA + ", sideB=" + sideB
                + ", sideC=" + sideC + ", perimeter=" + perimeter + ", area=" + area + '}';
    }
}

