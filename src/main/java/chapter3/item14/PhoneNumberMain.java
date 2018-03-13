package chapter3.item14;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class PhoneNumberMain {

    public static void main(String[] args) {
        PhoneNumber f3 = new PhoneNumber(1, 2, 3);
        PhoneNumber f4 = new PhoneNumber(1, 2, 4);
        PhoneNumber f2 = new PhoneNumber(1, 1, 4);
        PhoneNumber f1 = new PhoneNumber(0, 2, 4);
        PhoneNumber f5 = new PhoneNumber(3, 2, 4);

       /* log.info("result = {}", ImmutableList.of(f1, f2, f3, f4, f5).stream()
                .sorted()
                .collect(toList())); */

        List<PhoneNumber> list = new ArrayList<>();
        list.add(f2);
        list.add(f5);
        list.add(f3);
        list.add(f1);
        list.add(f4);
        Collections.sort(list);

        for (PhoneNumber phoneNumber : list) {
            log.info("sort by collections = {}", phoneNumber);
        }
    }
}
