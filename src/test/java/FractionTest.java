import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void add() throws Exception {
        Fraction expected = new Fraction(new Fraction.Numerator(4), new Fraction.Denominator(4));
        Fraction result = Fraction.add(new Fraction.Numerator(1), new Fraction.Denominator(2), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void add_with_zero() throws Exception {
        Fraction expected = new Fraction(new Fraction.Numerator(4), new Fraction.Denominator(4));
        Fraction result = Fraction.add(new Fraction.Numerator(1), new Fraction.Denominator(0), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test
    public void sub() throws Exception{
        Fraction expected = new Fraction(new Fraction.Numerator(4), new Fraction.Denominator(4));
        Fraction result = Fraction.sub(new Fraction.Numerator(3), new Fraction.Denominator(2), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void sub_with_zero() throws Exception{
        Fraction expected = new Fraction(new Fraction.Numerator(4), new Fraction.Denominator(4));
        Fraction result = Fraction.sub(new Fraction.Numerator(3), new Fraction.Denominator(0), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test
    public void mul() throws Exception{
        Fraction expected = new Fraction(new Fraction.Numerator(3), new Fraction.Denominator(4));
        Fraction result = Fraction.mul(new Fraction.Numerator(3), new Fraction.Denominator(2), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void mul_with_zero() throws Exception{
        Fraction expected = new Fraction(new Fraction.Numerator(3), new Fraction.Denominator(4));
        Fraction result = Fraction.mul(new Fraction.Numerator(3), new Fraction.Denominator(0), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test
    public void div() throws Exception{
        Fraction expected = new Fraction(new Fraction.Numerator(6), new Fraction.Denominator(2));
        Fraction result = Fraction.div(new Fraction.Numerator(3), new Fraction.Denominator(2), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void div_with_zero() throws Exception{
        Fraction expected = new Fraction(new Fraction.Numerator(6), new Fraction.Denominator(2));
        Fraction result = Fraction.div(new Fraction.Numerator(2), new Fraction.Denominator(0), new Fraction.Numerator(1), new Fraction.Denominator(2));
        assertEquals(expected, result);
    }
}