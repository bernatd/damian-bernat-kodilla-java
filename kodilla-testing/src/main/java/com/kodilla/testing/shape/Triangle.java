package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private float field;

    Triangle (float field) {
        this.field = field;
    }
    public String getShapeName() {
        return shapeName;
    }

    public float getField() {
        return field;
    }
}
