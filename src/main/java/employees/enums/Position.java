package employees.enums;

public enum Position {

    INSTALLER(0),
    ELECTRONIC_ENGINEER(1),
    DEVELOPER(2);

    private final int value;

    Position(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
