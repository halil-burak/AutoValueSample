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

    public static void main(String[] args) {
        List<Box<Integer>> integerBoxes = new ArrayList<>();
        TypeInferenceDemo.addBoxes(new Integer(12), integerBoxes);
        TypeInferenceDemo.<Integer>addBoxes(100, integerBoxes);
        TypeInferenceDemo.addBoxes(Integer.valueOf(1000), integerBoxes);
        TypeInferenceDemo.outputBoxes(integerBoxes);
    }
}
