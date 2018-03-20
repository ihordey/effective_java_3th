package chapter4.item18;

import com.google.common.collect.ImmutableList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InstrumentedHashSetMain {

    public static void main(String[] args) {
        InstrumentedHashSet<Object> storage = new InstrumentedHashSet<>();
        storage.addAll(ImmutableList.of("Snap", "Crackle", "Pop"));

        log.info("element count {}", storage.getAddCount());
    }
}
