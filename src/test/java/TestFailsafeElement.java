import mypkg.FailsafeElement;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFailsafeElement {

    @Test
    public void testFailsafeElement() {
        Object obj = new Object();
        FailsafeElement failsafeElement = FailsafeElement.<String, Object> builder()
                .setName("ali")
                .setOriginalPayload("old")
                .setCurrentPayload(obj)
                .build();

        assertEquals(failsafeElement.name(), "ali");
        assertEquals(failsafeElement.currentPayload(), obj);
        assertEquals(failsafeElement.originalPayload(), "old");
    }

    @Test
    public void test2FailsafeElementsEqualWithSameValues_thenCorrect() {
        FailsafeElement failsafeElement1 = FailsafeElement.builder()
                .setOriginalPayload(21312)
                .setCurrentPayload("text")
                .setName("foo")
                .build();

        FailsafeElement failsafeElement2 = FailsafeElement.builder()
                .setName("doe")
                .setCurrentPayload(34242)
                .setOriginalPayload("chernobyl")
                .build();

        assertFalse(failsafeElement1.equals(failsafeElement2));
    }
}
