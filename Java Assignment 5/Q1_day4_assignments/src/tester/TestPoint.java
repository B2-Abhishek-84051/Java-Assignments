package tester;
import com.app.geometry.*;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D();
        p1.acceptData();
        p2.acceptData();
        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());

        if (p1.isEqual(p2))
        {
            System.out.println("Same point");
            System.out.println("Distance = 0");
        }
        else
        {
            System.out.println("Distance = "+p1.calculateDistance(p1,p2));
        }
    }
}
