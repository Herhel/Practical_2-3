package com.alfa.work2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() +
                ", color=" + color;
    }

    public double calcArea () {
        return 0.0;
    }
}
