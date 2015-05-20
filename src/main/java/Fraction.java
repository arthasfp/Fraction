
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static Fraction add(Fraction fractionOne, Fraction fractionTwo) {
        if (fractionOne.getDenominator() == 0 || fractionTwo.getDenominator() == 0)
            throw new ArithmeticException();
        int nok = lcm(fractionOne.getDenominator(), fractionTwo.getDenominator());
        Fraction fractionThree = new Fraction(0, 0);
        fractionThree.setDenominator(nok);
        fractionThree.setNumerator(fractionOne.getNumerator() * fractionTwo.getDenominator() + fractionTwo.getNumerator() * fractionOne.getDenominator());
        int nod = gcd(fractionThree.getNumerator(), fractionThree.getDenominator());
        fractionThree.setDenominator(nok / nod);
        fractionThree.setNumerator(fractionThree.getNumerator() / nod);
        return fractionThree;
    }

    public static Fraction mul(Fraction fractionOne, Fraction fractionTwo) {
        if (fractionOne.getDenominator() == 0 || fractionTwo.getDenominator() == 0)
            throw new ArithmeticException();
        return new Fraction((fractionOne.getNumerator() * fractionTwo.getNumerator()), fractionOne.getDenominator() * fractionTwo.getDenominator());
    }

    public static Fraction sub(Fraction fractionOne, Fraction fractionTwo) {
        if (fractionOne.getDenominator() == 0 || fractionTwo.getDenominator() == 0)
            throw new ArithmeticException();
        return new Fraction((fractionOne.getNumerator() * fractionTwo.getDenominator() - fractionTwo.getNumerator() * fractionOne.getDenominator()), (fractionOne.getDenominator() * fractionTwo.getDenominator()));
    }

    public static Fraction div(Fraction fractionOne, Fraction fractionTwo) {
        if (fractionOne.getDenominator() == 0 || fractionTwo.getNumerator() == 0)
            throw new ArithmeticException();
        return new Fraction((fractionOne.getNumerator() * fractionTwo.getDenominator()), (fractionTwo.getNumerator() * fractionOne.getDenominator()));
    }

    @Override
    public String toString() {
        return numerator + "\n-\n" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;

    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
