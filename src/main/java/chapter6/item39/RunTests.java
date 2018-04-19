package chapter6.item39;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@Slf4j
public class RunTests {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                log.info("method {}", m.getName());
                tests++;
                try {
                    if (Modifier.isStatic(m.getModifiers())) {
                        m.invoke(null);
                    } else {
                        m.invoke(testClass.newInstance());
                    }
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    log.info("method {} failed: {}", m, wrappedExc.getCause());
                } catch (Exception exc) {
                    log.info("Invalid @Test: {}", m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
