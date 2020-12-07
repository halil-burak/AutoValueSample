package mypkg;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Animal {
    public abstract String name();
    public abstract int numberOfLegs();

    public static Animal create(String name, int numberOfLegs) {
        return new AutoValue_Animal(name, numberOfLegs);
    }
}
