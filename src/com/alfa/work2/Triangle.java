package com.alfa.work2;

public class Triangle extends Shape{
    private final int a;
    private final int b;
    private final int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public double calcArea() {
        int p = a + b + c;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
