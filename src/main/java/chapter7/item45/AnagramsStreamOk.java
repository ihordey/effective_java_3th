package chapter7.item45;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

@Slf4j
public class AnagramsStreamOk {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("./src/main/resources/item45.txt");
        int minGroupSize = 2;
        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(groupingBy(AnagramsStreamOk::alphabetize))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> log.info(g.size() + ": " + g));
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
