// Variable.java
package expressivo;

import java.util.Objects;

/**
 * An immutable class representing a variable expression in a polynomial.
 * Variables are case-sensitive nonempty strings of letters.
 *
 * <p>PS3 instructions: this class is a concrete variant of the Expression interface.
 * It represents a variable in a polynomial expression.
 */
public class Variable implements Expression {
    private final String name;

    /**
     * Creates a new Variable with the given name.
     *
     * @param name the name of the variable, must be a nonempty string of letters
     * @throws NullPointerException if the name is null
     */
    public Variable(String name) {
        this.name = Objects.requireNonNull(name, "Variable name cannot be null");
    }

    /**
     * Returns a string representation of the variable.
     *
     * @return the name of the variable
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Checks if this variable is equal to another object.
     *
     * @param thatObject the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;

        Variable variable = (Variable) thatObject;

        // Structural equality check
        return name.equals(variable.name);
    }

    /**
     * Computes the hash code of the variable.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        // Custom hash code calculation based on the characters of the name
        int hash = 0;
        for (char c : name.toCharArray()) {
            hash = 31 * hash + c;
        }
        return hash;
    }

    // Abstraction Function: Represents a variable expression with a unique name.
    // Rep Invariant: The name must be a nonempty string of letters.

    // No checkRep is needed here as the class maintains a simple and clear rep invariant.

    // Additional instance methods for Variable can be added here
}

