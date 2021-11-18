package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private float field;

    Circle (float field) {
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public float getField() {
        return field;
    }
}
