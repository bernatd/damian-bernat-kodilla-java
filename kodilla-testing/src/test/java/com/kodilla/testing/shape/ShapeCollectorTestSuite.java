package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Circle")
    class TestsCircle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();

            //When
            shapes.addFigure(new Circle(234));

            //Then
            Assertions.assertEquals(1, shapes.shapesQuantity());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Circle circle = new Circle(987);
            shapes.addFigure(circle);

            //When
            Shape retrievedShape;
            retrievedShape = shapes.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrievedShape);
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Circle circle = new Circle(999);

            //When
            boolean result = shapes.revomeFigure(circle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Circle circle = new Circle(999);
            shapes.addFigure(circle);

            //When
            boolean result = shapes.revomeFigure(circle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapes.shapesQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for Rectangle")
    class TestsRectangle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();

            //When
            shapes.addFigure(new Rectangle(1234));

            //Then
            Assertions.assertEquals(1, shapes.shapesQuantity());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Rectangle rectangle = new Rectangle(345);
            shapes.addFigure(rectangle);

            //When
            Shape retrievedShape;
            retrievedShape = shapes.getFigure(0);

            //Then
            Assertions.assertEquals(rectangle, retrievedShape);
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Rectangle rectangle = new Rectangle(8147);

            //When
            boolean result = shapes.revomeFigure(rectangle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Rectangle rectangle = new Rectangle(823);
            shapes.addFigure(rectangle);

            //When
            boolean result = shapes.revomeFigure(rectangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapes.shapesQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for Triangle")
    class TestsTriangle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();

            //When
            shapes.addFigure(new Triangle(1234));

            //Then
            Assertions.assertEquals(1, shapes.shapesQuantity());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Triangle triangle = new Triangle(543);
            shapes.addFigure(triangle);

            //When
            Shape retrievedShape;
            retrievedShape = shapes.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Triangle triangle = new Triangle(237);

            //When
            boolean result = shapes.revomeFigure(triangle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Triangle triangle = new Triangle(328);
            shapes.addFigure(triangle);

            //When
            boolean result = shapes.revomeFigure(triangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapes.shapesQuantity());
        }
    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        String listOfShapes = "Triangle, Circle, Rectangle, Circle, Triangle";
        shapes.addFigure(new Triangle(1));
        shapes.addFigure(new Circle(2));
        shapes.addFigure(new Rectangle(3));
        shapes.addFigure(new Circle(4));
        shapes.addFigure(new Triangle(5));

        //When
        String result = shapes.showFigures();

        //Then
        Assertions.assertEquals(listOfShapes, result);
    }
}
