import java.util.EmptyStackException;

public class StaticStack<T> {
    private int top;
    private T[] data;
    private static final int StandartSize = 5;
    private final int size;

    public StaticStack(int size){
        this.size = size > 0 ? size : StandartSize;
        top = -1;
        data = (T[]) new Object[size];
    }

    public StaticStack(){
        this(StandartSize);
    }

    public void push(T pushValue){
        if (isFull()){
            throw new FullStackException(String.format("A pilha está cheia, nào é possível adicionar %s", pushValue));
        }
        data[++top] = pushValue;
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return data[top--];
    }

    public void clear(){
        top = -1;
        for (int i = 0; i < size; i ++ ){
            data[i] = null;
        }
    }

    public boolean isFull(){
        return top == size -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
