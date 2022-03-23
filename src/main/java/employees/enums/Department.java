package employees.enums;

public enum Department {

    WORKSHOP(0),
    WAREHOUSE(1);

    private final int value;

    Department(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
