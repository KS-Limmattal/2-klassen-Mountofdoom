import java.awt.Point;

public class PointTester{
    public static void main(String[] args) {
        Point p = new Point(2, 5);
        System.out.println(p.toString());
        double x = p.getX();
        double y = p.getY();
        p.setLocation(y, x);
        Point q = new Point(p);
        System.out.println(q.toString());
    }
}
