package chapter5.item26;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class QuestionMarksGenericMain {

    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add("1");
        set1.add("2");
        set1.add(3);
        Set set2 = new HashSet();
        set2.add(4);
        set2.add("5");
        set2.add("1");
        set2.add("2");
        set2.add(3);
        log.info("count {}", numElementsInCommon(set1, set2));
    }

    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }
}
