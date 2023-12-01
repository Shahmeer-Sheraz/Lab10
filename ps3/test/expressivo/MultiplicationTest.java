import expressivo.Expression;
import expressivo.Multiplication;
import expressivo.Variable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MultiplicationTest {

    @Test
    public void testMultiplicationToString() {
        Expression left = new Variable("x");
        Expression right = new Variable("y");
        Multiplication multiplication = new Multiplication(left, right);
        assertEquals("(x * y)", multiplication.toString());
    }

    @Test
    public void testMultiplicationEquals() {
        Expression left1 = new Variable("x");
        Expression right1 = new Variable("y");
        Multiplication multiplication1 = new Multiplication(left1, right1);

        Expression left2 = new Variable("x");
        Expression right2 = new Variable("y");
        Multiplication multiplication2 = new Multiplication(left2, right2);

        Expression differentLeft = new Variable("z");
        Expression differentRight = new Variable("y");
        Multiplication differentMultiplication = new Multiplication(differentLeft, differentRight);

        assertEquals(multiplication1, multiplication2); // Same expressions, should be equal
        assertNotEquals(multiplication1, differentMultiplication); // Different expressions, should not be equal
    }

    @Test
    public void testMultiplicationHashCode() {
        Expression left1 = new Variable("x");
        Expression right1 = new Variable("y");
        Multiplication multiplication1 = new Multiplication(left1, right1);

        Expression left2 = new Variable("x");
        Expression right2 = new Variable("y");
        Multiplication multiplication2 = new Multiplication(left2, right2);

        assertEquals(multiplication1.hashCode(), multiplication2.hashCode()); // Hash codes should be equal for equal expressions
    }

    // Add more test methods as needed
}
