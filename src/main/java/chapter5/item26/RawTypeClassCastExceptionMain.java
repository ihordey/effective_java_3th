package chapter5.item26;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class RawTypeClassCastExceptionMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, 42);
        String o = strings.get(0);
        log.info("value {}", o);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }
}
