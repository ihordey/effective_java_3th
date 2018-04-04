package chapter4.item25;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("{}{}", Utensil.NAME, Utensil.Dessert.NAME);
    }
}
