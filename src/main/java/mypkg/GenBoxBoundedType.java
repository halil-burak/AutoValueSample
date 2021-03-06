package mypkg;

public class GenBoxBoundedType<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T:" + t.getClass().getName());
        System.out.println("U:" + u.getClass().getName());
    }

    public static void main(String[] args) {
        GenBoxBoundedType<Integer> integerBox = new GenBoxBoundedType<>();
        integerBox.setT(new Integer(10));
        //integerBox.inspect("some text");
    }
}
