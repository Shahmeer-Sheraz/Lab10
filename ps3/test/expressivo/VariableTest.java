import expressivo.Expression;
import expressivo.Variable;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class VariableTest {

    @Test
    public void testVariableToString() {
        Variable variable = new Variable("x");
        assertEquals("x", variable.toString());
    }
    @Test
    public void testVariableEquals() {
        Variable variable1 = new Variable("x");
        Variable variable2 = new Variable("x");
        Variable differentVariable = new Variable("y");

        assertEquals(variable1, variable2); // Same variables, should be equal
        assertNotEquals(variable1, differentVariable); // Different variables, should not be equal
    }
    @Test
    public void testVariableHashCode() {
        Variable variable1 = new Variable("x");
        Variable variable2 = new Variable("x");

        assertEquals(variable1.hashCode(), variable2.hashCode()); // Hash codes should be equal for equal variables
    }}
