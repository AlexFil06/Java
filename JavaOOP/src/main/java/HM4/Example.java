package HM4;

public class Example<T, V> {
    private T first;
    private V second;

    public Example(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Example<String, Integer> example1 = new Example<>("Hello", 123);
        System.out.println("First: " + example1.getFirst() + ", Second: " + example1.getSecond());
        Example<Boolean, Double> example2 = new Example<>(true, 3.14);
        System.out.println("First: " + example2.getFirst() + ", Second: " + example2.getSecond());
    }
}
