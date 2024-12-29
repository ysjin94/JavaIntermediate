package lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int value) {
        this.value += value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
