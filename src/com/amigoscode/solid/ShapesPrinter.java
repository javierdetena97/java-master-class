package com.amigoscode.solid;

import java.util.List;

public class ShapesPrinter {

    private final AreaCalculatorI areaCalculatorI;

    public ShapesPrinter(AreaCalculatorI areaCalculatorI) {
        this.areaCalculatorI = areaCalculatorI;
    }

    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(areaCalculatorI.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum,%s".formatted(areaCalculatorI.sum(shapes));
    }

}
