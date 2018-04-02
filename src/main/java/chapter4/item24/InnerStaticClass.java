package chapter4.item24;

import com.google.common.collect.ImmutableList;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

public class InnerStaticClass {

    public static void main(String[] args) {
        Map.Entry<String, String> firstEntry = new AbstractMap.SimpleEntry<>("key1", "val1");
        Map.Entry<String, String> secondEntry = new AbstractMap.SimpleEntry<>("key2", "val2");
        Map.Entry<String, String> therdEntry = new AbstractMap.SimpleEntry<>("key3", "val3");

        List<Map.Entry<String, String>> entries = ImmutableList.of(firstEntry, secondEntry, therdEntry);
        System.out.println(entries);
    }
}