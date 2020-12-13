import mypkg.GenBoxBoundedType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestGenBoxBoundedType {

    @Test
    public void testGenericBoxBoundedType_testUpperBound() {
        GenBoxBoundedType<Integer> integerBox = new GenBoxBoundedType<>();
        integerBox.setT(123);
        integerBox.inspect(2);
        // Below is compilation error due to the bounded type constraint on the generic class
        //assertFalse(integerBox.inspect("some string"));
        assertTrue(integerBox.getT() == 123);
    }
}
