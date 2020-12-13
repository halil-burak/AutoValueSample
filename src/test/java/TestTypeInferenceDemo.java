import mypkg.TypeInferenceDemo;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestTypeInferenceDemo {

    @Test
    public void testSumOfNumberList_upperBoundWildcard() {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.2, 2.4, 3.5, 6.7);

        double intSum = TypeInferenceDemo.sumOfList(integerList);
        double doubleSum = TypeInferenceDemo.sumOfList(doubleList);

        assertEquals("Sum is wrong", 6.0, intSum, 0.0);
        assertEquals("Sum is wrong", 13.8, doubleSum, 0.0);
    }
}
