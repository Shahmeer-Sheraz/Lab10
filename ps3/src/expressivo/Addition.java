// Addition.java
package expressivo;

import java.util.Objects;

public class Addition implements Expression {
    private final Expression left;
    private final Expression right;

    public Addition(Expression left, Expression right) {
        this.left = Objects.requireNonNull(left, "Left operand cannot be null");
        this.right = Objects.requireNonNull(right, "Right operand cannot be null");
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Addition addition = (Addition) thatObject;
        return left.equals(addition.left) && right.equals(addition.right);
    }

    @Override
    public int hashCode() {
        // Custom hash code calculation based on the hash codes of the subexpressions
        int leftHash = (left == null) ? 0 : left.hashCode();
        int rightHash = (right == null) ? 0 : right.hashCode();
        return 31 * leftHash + rightHash;
    }

    // Additional instance methods for Addition can be added here
}
