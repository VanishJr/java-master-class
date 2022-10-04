package academy.learnprogramming;

public class AreaCalculator {
    public static double area (double radius) {
        if (radius >= 0) {
            double circle = Math.PI * radius * radius;
            System.out.println(circle);
        }
        return -1;
    }
    public static double area (double x, double y) {
        if ((x >= 0) && (y >= 0)) {
            double rectangle = x * y;
            System.out.println(rectangle);
        }
        return -1;
    }
}
