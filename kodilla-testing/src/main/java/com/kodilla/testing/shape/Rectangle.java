package com.kodilla.testing.shape;

public class Rectangle implements Shape {
    private String shapeName = "Rectangle";
    private float field;

    Rectangle (float field) {
        this.field = field;
    }
    public String getShapeName() {
        return shapeName;
    }

    public float getField() {
        return field;
    }
}
