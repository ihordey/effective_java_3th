package chapter3.item10.transitivity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompositionColorPointMain {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        CompositionColorPoint compositionColorPoint = new CompositionColorPoint(new Point(1, 2), ColorPoint.Color.RED);

        log.info("composition point eq to compositionColorPoint = {}", point.equals(compositionColorPoint));
        log.info("composition compositionColorPoint eq to point = {}", compositionColorPoint.equals(point));
    }
}
