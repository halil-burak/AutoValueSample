import mypkg.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimal {

    @Test
    public void givenValueTypeWithAutoValue_whenFieldsAreCorrectlySet_thenAssertTrue() {
        Animal animal = Animal.create("lion", 4);
        assertEquals(animal.name(), "lion");
        assertEquals(animal.numberOfLegs(), 4);
    }

    @Test
    public void given2EqualValueTypesWithAutoValue_whenFieldsAreEqual_thenCorrect() {
        Animal animal1 = Animal.create("dog", 4);
        Animal animal2 = Animal.create("dog", 4);
        assertTrue(animal1.equals(animal2));
    }

    @Test
    public void given2DifferentValueTypesWithAutoValue_whenNotEqual_thenShouldFail() {
        Animal animal1 = Animal.create("cat", 4);
        Animal animal2 = Animal.create("cat", 6);
        assertFalse(animal1.equals(animal2));
    }
}
