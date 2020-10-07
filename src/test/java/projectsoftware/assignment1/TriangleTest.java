package projectsoftware.assignment1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test(expected = InvalidTriangleException.class)
    public void testInvalidTriangle() throws InvalidTriangleException {
        new Triangle(3, 3, 10);
    }

    @Test
    public void testStaticFunctions() {
        assertFalse(Triangle.isEquilateral(3, 3, 10));
        assertFalse(Triangle.isIsosceles(3, 3, 10));
        assertFalse(Triangle.isScalene(3, 3, 10));
        assertFalse(Triangle.isValidTriangle(3, 3, 10));
    }

    @Test
    public void testEquilateralTriangle() throws InvalidTriangleException {
        Triangle triangle = new Triangle(3, 3, 3);
        assertTrue(triangle.type() == TriangleType.EQUILATERAL);
    }

    @Test
    public void testIsoscelesTriangle() throws InvalidTriangleException {
        Triangle triangle = new Triangle(3, 3, 5);
        assertTrue(triangle.type() == TriangleType.ISOSCELES);
    }

    @Test
    public void testScaleneTriangle() throws InvalidTriangleException {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.type() == TriangleType.SCALENE);
    }
}