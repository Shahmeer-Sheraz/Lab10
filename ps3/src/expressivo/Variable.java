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
        return Objects.hash(name);
    }


    // Additional instance methods for Variable can be added here
}
