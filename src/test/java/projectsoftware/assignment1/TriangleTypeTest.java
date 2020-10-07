package projectsoftware.assignment1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTypeTest {

    @Test
    public void testToString() {
        assertSame("Equilateral", TriangleType.EQUILATERAL.toString());
        assertSame("Isosceles", TriangleType.ISOSCELES.toString());
        assertSame("Scalene", TriangleType.SCALENE.toString());
    }
}