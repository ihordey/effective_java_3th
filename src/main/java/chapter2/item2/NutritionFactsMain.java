package chapter2.item2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NutritionFactsMain {

    public static void main(String[] args) {
        log.info("Builder with Build class {}", new NutritionFacts.Builder(10, 3).calories(100).build());
        log.info("Builder with build()  {} " + NutritionFactsWithBuildMethod.build(10, 3).build());
    }
}
