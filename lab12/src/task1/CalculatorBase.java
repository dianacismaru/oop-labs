package task1;

import java.util.Collection;

public final class CalculatorBase implements Calculator {
    @Override
    public Double add(Double nr1, Double nr2) {
        if (nr1 == null || nr2 == null) {
            throw new NullParameterException();
        }

        if (nr1 + nr2 > Double.MAX_VALUE) {
            throw new OverflowException();
        }

        if (nr1 + nr2 < -Double.MAX_VALUE) {
            throw new UnderflowException();
        }

        return nr1 + nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) {
        if (nr1 == null || nr2 == null) {
            throw new NullParameterException();
        }

        if (nr1 / nr2 == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException();
        }

        if (nr1 / nr2 == Double.POSITIVE_INFINITY) {
            throw new OverflowException();
        }

        return nr1 / nr2;
    }

    @Override
    public Double average(Collection<Double> numbers) {
        double sum = 0.0;
        for (Double number: numbers) {
            sum = add(sum, number);
        }
        return divide(sum, (double) numbers.size());
    }
}
