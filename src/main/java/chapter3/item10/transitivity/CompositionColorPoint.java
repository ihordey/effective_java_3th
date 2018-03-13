package chapter3.item10.transitivity;

public class CompositionColorPoint {
    private final Point point;
    private final ColorPoint.Color color;

    public CompositionColorPoint(Point point, ColorPoint.Color color) {
        this.point = point;
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        CompositionColorPoint cp = (CompositionColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
