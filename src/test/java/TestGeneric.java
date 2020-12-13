import mypkg.Generic.Pair;
import mypkg.Generic.Util;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestGeneric {
    @Test
    public void testGenericPairs_withEqualValues_thenComparisonReturnsTrue() {
        Pair<String, Integer> p1 = new Pair<>("id", 123);
        Pair<String, Integer> p2 = new Pair<>("id", 123);

        assertTrue(Util.compare(p1, p2));
    }

    @Test
    public void testGenericPairs_withUnequalValues_thenComparisonReturnsFalse() {
        Pair<String, Integer> p1 = new Pair<>("id", 123);
        Pair<String, Integer> p2 = new Pair<>("id", 124);

        assertFalse(Util.compare(p1, p2));
    }
}
