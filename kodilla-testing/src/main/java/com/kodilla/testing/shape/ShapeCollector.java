package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean revomeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures() {
        String result = "";
       /* for (Shape s : shapes) {
            result += s.getShapeName() + ", ";
        }*/
        for (int i = 0; i < shapes.size() - 1; i++) {
            result += shapes.get(i).getShapeName() + ", ";
        }
        result += shapes.get(shapes.size() - 1).getShapeName();
        return result;
    }

    public int shapesQuantity() {
        return shapes.size();
    }
}
