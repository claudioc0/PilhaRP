import java.util.Arrays;
import java.util.EmptyStackException;

public class DynamicStack<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private T[] data;
    private int top;
    private int capacity;

    public DynamicStack() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacidade inicial deve ser maior que zero.");
        }
        capacity = initialCapacity;
        data = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T pushValue) {
        if (isFull()) {
            increaseCapacity();
        }
        data[++top] = pushValue;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = data[top];
        data[top--] = null;
        return value;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            data[i] = null;
        }
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        data = Arrays.copyOf(data, capacity);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Pilha vazia";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Pilha: [");
        for (int i = 0; i <= top; i++) {
            sb.append(data[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
