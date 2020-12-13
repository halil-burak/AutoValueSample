package mypkg;

public class Generic {
    public static class Util {
        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
        }
    }

    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("hello", "world");
        Pair<String, String> pair2 = new Pair<>("hello", "world");

        boolean comparison = Util.compare(pair1, pair2);
        System.out.println(comparison);
    }
}
