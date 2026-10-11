package lab4;

public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager manager = new TriangleManager(true);

        Triangle t1 = new EquilateralTraingle(5);
        Triangle t2 = new RightTriangle(3, 4, 5);
        Triangle t3 = new EquilateralTraingle(10);

        manager.addTriangle(t1);
        manager.addTriangle(t2);
        manager.addTriangle(t3);

        Triangle largest = manager.findTriangleWithLargestPerimeter();

        System.out.println("Largest perimeter = " + largest.getPerimeter());
        System.out.println("Longest side = " + largest.getLongestSideLength());
        System.out.println("Largest angle = " + largest.getLargestAngle());

        manager.addTriangle(null);
    }
}