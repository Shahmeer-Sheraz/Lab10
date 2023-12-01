// Multiplication.java
package expressivo;

import java.util.Objects;

public class Multiplication implements Expression {
    private final Expression left;
    private final Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = Objects.requireNonNull(left, "Left operand cannot be null");
        this.right = Objects.requireNonNull(right, "Right operand cannot be null");
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Multiplication multiplication = (Multiplication) thatObject;
        return left.equals(multiplication.left) && right.equals(multiplication.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

   
    // Additional instance methods for Multiplication can be added here
}
