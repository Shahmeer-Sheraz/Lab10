import expressivo.Addition;
import expressivo.Expression;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AdditionTest {

    @Test
    public void testAdditionToString() {
        Expression left = new Variable("x");
        Expression right = new Variable("y");
        Addition addition = new Addition(left, right);
        assertEquals("(x + y)", addition.toString());
    }

    @Test
    public void testAdditionEquals() {
        Expression left1 = new Variable("x");
        Expression right1 = new Variable("y");
        Addition addition1 = new Addition(left1, right1);

        Expression left2 = new Variable("x");
        Expression right2 = new Variable("y");
        Addition addition2 = new Addition(left2, right2);

        Expression differentLeft = new Variable("z");
        Expression differentRight = new Variable("y");
        Addition differentAddition = new Addition(differentLeft, differentRight);

        assertEquals(addition1, addition2); // Same expressions, should be equal
        assertNotEquals(addition1, differentAddition); // Different expressions, should not be equal
    }

    @Test
    public void testAdditionHashCode() {
        Expression left1 = new Variable("x");
        Expression right1 = new Variable("y");
        Addition addition1 = new Addition(left1, right1);

        Expression left2 = new Variable("x");
        Expression right2 = new Variable("y");
        Addition addition2 = new Addition(left2, right2);

        assertEquals(addition1.hashCode(), addition2.hashCode()); // Hash codes should be equal for equal expressions
    }

    // Add more test methods as needed
}
