package chapter4.item18.composition;

import com.google.common.collect.ImmutableList;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;


@Slf4j
public class InstrumentedSetMain {

    public static void main(String[] args) {
        InstrumentedSet<String> storage = new InstrumentedSet<>(new HashSet<>());
        storage.addAll(ImmutableList.of("Snap", "Crackle", "Pop"));

        log.info("element count {}", storage.getAddCount());
    }
}
