package mypkg;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceDemo {
    public static class Box<T> {
        private T t; // T stands for "Type"

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
    }

    public static <U> void addBoxes(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 0;

        for (Box<U> box : boxes) {
            U boxContent = box.get();
            System.out.println("Box #" + counter + " contains [" + boxContent + "]");
            counter++;
        }
    }

    /**
     * upper bounded wildcard example
     * @param numbers
     * @return
     */
    public static double sumOfList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }

    /**
     * to print a list of any type, unbounded wildcard example
     * @param list
     */
    public static void printList(List<?> list) {
        for (Object ele : list) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    /**
     * a method that puts Integer objects into a list. To maximize flexibility,
     * you would like the method to work on List<Integer>, List<Number>, and List<Object>
     *     — anything that can hold Integer values.
     * To write the method that works on lists of Integer and the supertypes of Integer, such as
     * Integer, Number, and Object, you would specify List<? super Integer>.
     * The term List<Integer> is more restrictive than List<? super Integer> because the former matches a list of type Integer only,
     * whereas the latter matches a list of any type that is a supertype of Integer.
     * @param list
     */
    public static List<Integer> addIntegers(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return (List<Integer>) list;
    }

    public static void main(String[] args) {
        List<Box<Integer>> integerBoxes = new ArrayList<>();
        TypeInferenceDemo.addBoxes(new Integer(12), integerBoxes);
        TypeInferenceDemo.<Integer>addBoxes(100, integerBoxes);
        TypeInferenceDemo.addBoxes(Integer.valueOf(1000), integerBoxes);
        TypeInferenceDemo.outputBoxes(integerBoxes);
    }
}
