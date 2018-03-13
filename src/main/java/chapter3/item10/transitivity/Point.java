package chapter3.item10.transitivity;


import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Point {
    private final int x;
    private final int y;

    private static final Set<Point> unitCircle = ImmutableSet.of(
            new Point(1, 0), new Point(0, 1),
            new Point(-1, 0), new Point(0, -1));

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

  /*  // Broken - violates Liskov substitution principle (page 43)
    @Override public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass())
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }*/
}
