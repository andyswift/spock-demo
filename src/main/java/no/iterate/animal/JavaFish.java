package no.iterate.animal;

import java.util.Objects;

/**
 * Java equivalent of the wet lovable creature.
 */
public class JavaFish {

    private final String name;

    public JavaFish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final JavaFish other = (JavaFish) obj;
        return Objects.equals(this.name, other.name);
    }
}
