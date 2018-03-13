package chapter3.item10.transitivity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PointMain {

    public static void main(String[] args) {
        // Broken - violates symmetry!
        Point symmetryPoint = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, ColorPoint.Color.RED);
        log.info("symmetry Point equals to ColorPoint = {}", symmetryPoint.equals(colorPoint));
        log.info("symmetry ColorPoint equals to Point = {}", colorPoint.equals(symmetryPoint));

        // Broken - violates transitivity!
        ColorPoint redPoint = new ColorPoint(1, 2, ColorPoint.Color.RED);
        Point transitivityPoint = new Point(1, 2);
        ColorPoint yellowPoint = new ColorPoint(1, 2, ColorPoint.Color.YELLOW);
        log.info("\n");
        log.info("transitivity redPoint equals to transitivityPoint = {}", redPoint.equals(transitivityPoint));
        log.info("transitivity transitivityPoint equals to yellowPoint = {}", transitivityPoint.equals(yellowPoint));
        log.info("transitivity redPoint equals to yellowPoint = {}", redPoint.equals(yellowPoint));
    }
}
