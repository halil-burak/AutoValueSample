import mypkg.TypeInferenceDemo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static mypkg.TypeInferenceDemo.printList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testGenericPrintList_unboundedWildcard() {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
        assertTrue(li.size() == 3);
        assertTrue(ls.size() == 3);
    }

    @Test
    public void testAddNumbers_lowerBoundedWildcardExample() {
        List<Integer> li = new ArrayList<>();
        TypeInferenceDemo.addIntegers(li);
        assertEquals(li.size(), 10);
    }
}
