package chapter6.item39.array_arithmetic;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticArrayTest {

    @ExceptionArrayTest( {IndexOutOfBoundsException.class, NullPointerException.class})
    public static void doublyBad() {
        List<String> list = new ArrayList<>();
        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5, null);
    }
}
