package entity;

public class Symbol {
    char value;

    public Symbol(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
