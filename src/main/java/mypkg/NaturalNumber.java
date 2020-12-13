package mypkg;

public class NaturalNumber<T extends Integer> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public NaturalNumber() {
    }

    public NaturalNumber(T t) {
        this.t = t;
    }

    /**
     * In addition to limiting the types you can use to instantiate a generic type,
     * bounded type parameters allow you to invoke methods defined in the bounds:
     * @return true or false whether the t is even or odd
     */
    public boolean isEven() {
        return t.intValue() % 2 == 0;
    }

    public static void main(String[] args) {
        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(13);
        System.out.println(naturalNumber.isEven());
    }
}
