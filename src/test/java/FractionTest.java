import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void add_two_possitive_fractions() throws Exception {
        Fraction expected = new Fraction(2, 1);
        Fraction result = Fraction.add(new Fraction(1, 2), new Fraction(1, 2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void add_two_fractions_with_zero_value_in_denominator() throws Exception {
        Fraction expected = new Fraction(4, 4);
        Fraction result = Fraction.add(new Fraction(1, 0), new Fraction(1, 2));
        assertEquals(expected, result);
    }

    @Test
    public void sub_two_possitive_fractions() throws Exception {
        Fraction expected = new Fraction(4, 4);
        Fraction result = Fraction.sub(new Fraction(3, 2), new Fraction(1, 2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void sub_two_fractions_with_zero_value_in_denominator() throws Exception {
        Fraction expected = new Fraction(4, 4);
        Fraction result = Fraction.sub(new Fraction(3, 0), new Fraction(1, 2));
        assertEquals(expected, result);
    }

    @Test
    public void mul_two_possitive_fractions() throws Exception {
        Fraction expected = new Fraction(3, 4);
        Fraction result = Fraction.mul(new Fraction(3, 2), new Fraction(1, 2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void mul_two_fractions_with_zero_value_in_denominator() throws Exception {
        Fraction expected = new Fraction(3, 4);
        Fraction result = Fraction.mul(new Fraction(3, 0), new Fraction(1, 2));
        assertEquals(expected, result);
    }

    @Test
    public void div_two_possitive_fractions() throws Exception {
        Fraction expected = new Fraction(6,2);
        Fraction result = Fraction.div(new Fraction(3,2), new Fraction(1,2));
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void div_two_fractions_with_zero_value_in_denominator() throws Exception {
        Fraction expected = new Fraction(6,2);
        Fraction result = Fraction.div(new Fraction(2,0), new Fraction(1,2));
        assertEquals(expected, result);
    }
}