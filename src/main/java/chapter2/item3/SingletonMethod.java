package chapter2.item3;

import lombok.ToString;

@ToString
class SingletonMethod {
    private final int value;
    private static final SingletonMethod INSTANCE = new SingletonMethod(10);

    private SingletonMethod(int value) {
        this.value = value;
    }

    public static SingletonMethod getInstance() {
        return INSTANCE;
    }
}
