package com.amigoscode.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);

        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));
    }

}
