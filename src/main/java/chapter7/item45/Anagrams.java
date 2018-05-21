package chapter7.item45;

import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.*;

@Slf4j
public class Anagrams {

    public static void main(String[] args) {
        InputStream dictionary = Anagrams.class.getResourceAsStream("/item45.txt");
        int minGroupSize = 2;
        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>()).add(word);
            }
        }
        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                log.info(group.size() + ": " + group);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}