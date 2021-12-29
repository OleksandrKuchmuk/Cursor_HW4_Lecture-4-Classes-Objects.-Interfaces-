package com.company;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    private double width, height, depth;
    private double area, volume;

    public Cuboid(Point[] vertices, double width, double height, double depth) {
        super(vertices);
        this.width = width;
        this.height = height;
        this.depth = depth;
        if (this.width != this.height && this.width != this.depth) {
            throw new ArithmeticException("\nERROR!!! This is a cube, all sides must be equal");
        }
    }

    @Override
    public double getArea() {
        area = 6 * Math.pow(width, 2);
        return area;
    }

    @Override
    public double getVolume() {
        volume = width * height * depth;
        return volume;
    }

    @Override
    public String toString() {
        return "\nCuboid{" + Arrays.toString(getVertices()) + " width=" + width + ", height=" + height +
                ", depth=" + depth + ", area=" + area + ", volume=" + volume + '}';
    }
}
