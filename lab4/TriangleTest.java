package lab4;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new EquilateralTraingle(5);
        Triangle t2 = new RightTriangle(3, 4, 5);

        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getLargestAngle());

        System.out.println(t2.getLongestSideLength());
        System.out.println(t2.getPerimeter());
        System.out.println(t2.getLargestAngle());
    }
}