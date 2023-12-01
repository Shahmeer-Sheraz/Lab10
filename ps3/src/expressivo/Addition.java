// Addition.java
package expressivo;

import java.util.Objects;

/**
 * An immutable class representing an addition expression in a polynomial.
 * Addition expressions consist of a left and a right operand.
 *
 * <p>PS3 instructions: this class is a concrete variant of the Expression interface.
 * It represents an addition operation in a polynomial expression.
 */
public class Addition implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Creates a new Addition expression with the given left and right operands.
     *
     * @param left  the left operand, must not be null
     * @param right the right operand, must not be null
     * @throws NullPointerException if left or right is null
     */
    public Addition(Expression left, Expression right) {
        this.left = Objects.requireNonNull(left, "Left operand cannot be null");
        this.right = Objects.requireNonNull(right, "Right operand cannot be null");
    }

    /**
     * Returns a string representation of the addition expression.
     *
     * @return a string representing the addition operation with operands
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * Checks if this addition expression is equal to another object.
     *
     * @param thatObject the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Addition addition = (Addition) thatObject;
        return left.equals(addition.left) && right.equals(addition.right);
    }

    /**
     * Computes the hash code of the addition expression.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        // Custom hash code calculation based on the hash codes of the subexpressions
        int leftHash = (left == null) ? 0 : left.hashCode();
        int rightHash = (right == null) ? 0 : right.hashCode();
        return 31 * leftHash + rightHash;
    }

    // Abstraction Function: Represents an addition expression with left and right operands.
    // Rep Invariant: Both left and right operands must not be null.

    // No checkRep is needed here as the class maintains a simple and clear rep invariant.

    // Additional instance methods for Addition can be added here
}
