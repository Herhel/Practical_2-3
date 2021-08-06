package com.alfa.work2;

import java.util.Arrays;
import java.util.Objects;

public class Runner {
    private Shape[] base;

    public void run() {
        base = createBase();
        printShapes(base);
        System.out.printf("Сумма площадей всех фигур = %.2f\n", sumAreas(base));
        outSumAreaByType(base);
    }

    private Shape[] createBase() {
        return new Shape[]{
                new Rectangle("red", 4, 5),
                new Circle("green", 9),
                new Rectangle("black", 7, 12),
                new Circle("red", 24),
                new Triangle("white", 4, 6, 2),
                new Rectangle("yellow", 11, 13),
                new Circle("pink", 16),
                new Triangle("pink", 9, 12, 7)
        };
    }

    public void printShapes(Shape[] shapes) {
        if (shapes != null && shapes.length > 0) {
            for (Shape shape : shapes) {
                System.out.printf(shape + ", area=%.2f \n", shape.calcArea());
            }
        } else {
            System.out.println("Нет элементов для вывода");
        }
    }

    public double sumAreas(Shape[] shapes) {
        if (shapes != null && shapes.length > 0) {
            double sum = 0.0;
            for (Shape shape : shapes) {
                sum = sum + shape.calcArea();
            }
            return sum;
        } else {
            System.out.println("Нет элементов для расчета");
            return 0.0;
        }
    }

    public Shape[] findShapesByName(Shape[] shapes, String type) {
        Shape[] result = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getClass().getSimpleName().equals(type)) {
                result[i] = shapes[i];
            }
        }
        return Arrays.stream(result).filter(Objects::nonNull).toArray(Shape[]::new);
    }

    public String[] findNames(Shape[] shapes) {
        String[] result = new String[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            result[i] = shapes[i].getClass().getSimpleName();
        }
        return Arrays.stream(result).distinct().toArray(String[]::new);
    }

    public void outSumAreaByType(Shape[] shapes) {
        String[] names = findNames(shapes);
        for (String name : names) {
            System.out.printf("Суммарная площадь " + name + " = %.2f\n", sumAreas(findShapesByName(base, name)));
        }
    }
}
