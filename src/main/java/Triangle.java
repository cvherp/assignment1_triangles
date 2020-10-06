public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws InvalidTriangleException {
        if(!isValidTriangle(a, b, c)) {
            throw new InvalidTriangleException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleType type() {
        if(isEquilateral(a, b, c)) {
            return TriangleType.EQUILATERAL;
        }

        else if(isIsosceles(a, b, c)) {
            return TriangleType.ISOSCELES;
        }

        else if(isScalene(a, b, c)) {
            return TriangleType.SCALENE;
        }

        return null;
    }

    public static boolean isEquilateral(double a, double b, double c) {
        if(!isValidTriangle(a, b, c)) {
            return false;
        }

        return a == b && b == c;
    }

    public static boolean isIsosceles(double a, double b, double c) {
        if(!isValidTriangle(a, b, c)) {
            return false;
        }

        return (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
    }

    public static boolean isScalene(double a, double b, double c) {
        if(!isValidTriangle(a, b, c)) {
            return false;
        }

        return (a != b) && (a != c) && (b != c);
    }


    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    public static void main(String args[]) {

    }
}
