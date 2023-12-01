// Variable.java
package expressivo;

import java.util.Objects;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = Objects.requireNonNull(name, "Variable name cannot be null");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;

        Variable variable = (Variable) thatObject;

        // Structural equality check
        return name.equals(variable.name);
    }

    @Override
    public int hashCode() {
        // Custom hash code calculation based on the characters of the name
        int hash = 0;
        for (char c : name.toCharArray()) {
            hash = 31 * hash + c;
        }
        return hash;


    // Additional instance methods for Variable can be added here
}
}
