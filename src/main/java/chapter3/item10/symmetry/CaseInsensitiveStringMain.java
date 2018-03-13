package chapter3.item10.symmetry;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CaseInsensitiveStringMain {

    public static void main(String[] args) {
        List<CaseInsensitiveString> containers = new ArrayList<>();
        CaseInsensitiveString polish = new CaseInsensitiveString("Polish");
        containers.add(polish);

        log.info("contains in collection {}", containers.contains("Polish"));
        log.info("equals {}", polish.equals(null));
    }
}
