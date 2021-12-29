package com.company;

import java.util.Arrays;

public class Sphere extends SpaceShape {
    private double radius, area, volume;

    public Sphere(Point[] vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getVolume() {
        volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "\nSphere{" + Arrays.toString(getVertices()) + " radius=" + radius + ", area=" + area +
                ", volume=" + volume + '}';
    }
}
