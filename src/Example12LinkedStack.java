import java.util.EmptyStackException;

public class Example12LinkedStack<T> {

    private int count;
    private Example12Node<T> top;

    public Example12LinkedStack() {
        count = 0;
        top = null;
    }

    public void push(T element) {

        Example12Node<T> temp = new Example12Node<>(element);

        temp.setNext(top);

        top = temp;

        count++;
    }

    public T pop() throws EmptyStackException {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T result = top.getElement();

        top = top.getNext();

        count--;

        return result;
    }

    public T peek() throws EmptyStackException {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}