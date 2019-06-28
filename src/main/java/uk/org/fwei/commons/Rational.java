package uk.org.fwei.commons;

/* https://en.wikipedia.org/wiki/Rational_number#Arithmetic */
public class Rational extends Number {
    private static final long serialVersionUID = 1L;

    private final int numerator;
    private final int denominator;

    public Rational(final int numerator, final int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational(final int integer) {
        this(integer, 1);
    }

    public <NUMBER extends Number> NUMBER multiply(final NUMBER number) {
    }

    public Rational multiply(final Rational rational) {
        final int numerator = this.numerator * rational.numerator;
        final int denominator = this.denominator * rational.denominator;
        return new Rational(numerator, denominator);
    }

    public <NUMBER extends Number> NUMBER divide(final NUMBER number) {
    }

    public Rational divide(final Rational rational) {
        final int numerator = this.numerator * rational.denominator;
        final int denominator = this.denominator * rational.numerator;
        return new Rational(numerator, denominator);
    }

    @Override
    public float floatValue() {
        final float numeratorFloat = numerator;
        final float denominatorFloat = denominator;
        final float value = numeratorFloat / denominatorFloat;

        return value;
    }

    @Override
    public int intValue() {
        return Math.round(floatValue());
    }

    @Override
    public double doubleValue() {
        final double numeratorDouble = numerator;
        final double denominatorDouble = denominator;
        final double value = numeratorDouble / denominatorDouble;

        return value;
    }

    @Override
    public long longValue() {
        return Math.round(doubleValue());
    }

    @Override
    public String toString() {
        final String string = String.format("%d/%d", numerator, denominator);

        return string;
    }
}
