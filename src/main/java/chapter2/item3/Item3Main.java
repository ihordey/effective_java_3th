package chapter2.item3;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;

@Slf4j
public class Item3Main {

    public static void main(String[] args) throws Exception {
        SingletonField singleton = SingletonField.singleton;
        for (Constructor<?> constructor : singleton.getClass().getDeclaredConstructors()) {
            constructor.setAccessible(true);
//            Object newSingleton = constructor.newInstance(33);
//            log.info("new singleton {}", newSingleton);

        }
        log.info("singleton field {}", singleton);
        log.info("singleton method {}", SingletonMethod.getInstance());
    }
}
