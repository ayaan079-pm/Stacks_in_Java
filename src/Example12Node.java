public class Example12Node<T> {

    private T element;
    private Example12Node<T> next;

    public Example12Node() {
        element = null;
        next = null;
    }

    public Example12Node(T element) {
        this.element = element;
        next = null;
    }

    public Example12Node<T> getNext() {
        return next;
    }

    public void setNext(Example12Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}