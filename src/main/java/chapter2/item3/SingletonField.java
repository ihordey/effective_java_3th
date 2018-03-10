package chapter2.item3;

import lombok.ToString;

@ToString
final class SingletonField {
    private final int value;
    static final SingletonField singleton = new SingletonField(10);

    private SingletonField(int value) {
        if (singleton != null)
            throw new IllegalArgumentException();
        this.value = value;
    }
}
