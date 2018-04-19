package chapter6.item39;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Slf4j
public class RunArithmeticExceptionTest {
    enum TestType {
        FAILED, PASSED, TOTAl;

        final static Map<TestType, ArrayList<String>> testTypeMap = Arrays.stream(values())
                .collect(toMap(Function.identity(), (t) -> new ArrayList<>(), (x, y) -> x, HashMap::new));
    }

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passedTest = 0;

        Class<?> testClass = Class.forName("chapter6.item39.ArithmeticExceptionTest");
        for (Method method : testClass.getDeclaredMethods()) {
            log.info("method : {}", method.getName());
            if (Modifier.isStatic(method.getModifiers()) && method.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    method.invoke(null);
                    log.error("failed test because no exception in method {}", method.getName());
                    TestType.testTypeMap.get(TestType.FAILED).add(method.getName());
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    Class<? extends Throwable> annotationClass = method.getAnnotation(ExceptionTest.class).value();
                    if (annotationClass.isInstance(cause)) {
                        TestType.testTypeMap.get(TestType.PASSED).add(method.getName());
                        log.info("passed test in method {}", method.getName());
                        passedTest++;

                    } else {
                        TestType.testTypeMap.get(TestType.FAILED).add(method.getName());
                        log.info("failed test because  method {} throws {} exception not expected ArithmeticException",
                                method.getName(), e.getCause());
                    }
                }
                log.info("");
            }
        }
        log.info("tests {} passed {}  failed {} ", tests, passedTest, tests - passedTest);
        log.info("map : {}", TestType.testTypeMap);
    }
}
