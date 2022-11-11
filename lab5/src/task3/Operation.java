package task3;

public final class Operation implements Minus, Plus, Mult, Div {
    private float value;

    public Operation(float value) {
        this.value = value;
    }

    @Override
    public void div(float value) {
        if (value == 0) {
            System.out.println("Division by zero is not possible");
        } else {
            this.value /= value;
        }
    }

    @Override
    public void minus(float value) {
        this.value -= value;
    }

    @Override
    public void mult(float value) {
        this.value *= value;
    }

    @Override
    public void plus(float value) {
        this.value += value;
    }

    public float getNumber() {
        return value;
    }
}
