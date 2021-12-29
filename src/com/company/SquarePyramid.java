package com.company;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double pyramidHeight;
    private double apopheme;
    private double basePerimeter;
    private double sideSurfaceArea;
    private double area;
    private double volume;


    public SquarePyramid(Point[] vertices, double baseWidth, double pyramidHeight) {
        super(vertices);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        apopheme = Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(pyramidHeight, 2));
        basePerimeter = baseWidth * 4;
        sideSurfaceArea = (basePerimeter * apopheme) / 2;
        area = sideSurfaceArea * 4 + Math.pow(baseWidth, 2);
        return area;
    }

    @Override
    public double getVolume() {
        volume = Math.pow(baseWidth, 2) * pyramidHeight / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "\nSquarePyramid{" + Arrays.toString(getVertices()) + " baseWidth=" + baseWidth + ", pyramidHeight=" + pyramidHeight +
                ", area=" + area + ", volume=" + volume + '}';
    }
}
