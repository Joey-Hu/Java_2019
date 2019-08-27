package chapter4;

/**
 * @author: huhao
 * @time: 2019/7/12 16:43
 * @desc:
 */


class Point {
    double x;
    double y;

    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double GetDistance(Point p1) {
        return Math.sqrt((p1.x - x) * (p1.x - x) + (p1.y - y) * (p1.y - y));
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(0, 0);
        double dist = p1.GetDistance(p2);
        System.out.println(dist);

    }
}
