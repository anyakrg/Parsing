package entity;

public class Whitespace {
    char value;

    public Whitespace(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
