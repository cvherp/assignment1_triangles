import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTypeTest {

    @Test
    public void testToString() {

        assertSame(TriangleType.EQUILATERAL.toString(), "Equilateral");
        assertSame(TriangleType.ISOSCELES.toString(), "Isosceles");
        assertSame(TriangleType.SCALENE.toString(), "Scalene");
    }
}