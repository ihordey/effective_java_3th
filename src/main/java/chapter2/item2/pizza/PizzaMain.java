package chapter2.item2.pizza;

import lombok.extern.slf4j.Slf4j;

import static chapter2.item2.pizza.Pizza.Topping.*;

@Slf4j
public class PizzaMain {

    public static void main(String[] args) {
        Pizza pizza = new NyPizza.Builder(NyPizza.Size.MEDIUM).addTopping(ONION).addTopping(MUSHROOM).build();
        printPizza(pizza);
        pizza = new Calzone.Builder().addTopping(HAM).addTopping(SAUSAGE).build();
        printPizza(pizza);
        pizza = new Calzone.Builder().souceInside().build();
        printPizza(pizza);
    }

    private static void printPizza(Pizza pizza) {
        log.info("\n class: {}  \n pizza : {} \n", pizza.getClass(), pizza);
    }
}
