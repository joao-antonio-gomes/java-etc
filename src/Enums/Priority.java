package Enums;

public enum Priority {
    MIN(1), NORMAL(5), MAX(10);

    private final int value;

    Priority (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
