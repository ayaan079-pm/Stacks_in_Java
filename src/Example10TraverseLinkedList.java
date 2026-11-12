public class Example10TraverseLinkedList {
    public static void main(String[] args) {

        Example12Node<Integer> head = new Example12Node<>(17);

        Example12Node<Integer> n2 = new Example12Node<>(92);

        Example12Node<Integer> n3 = new Example12Node<>(63);

        Example12Node<Integer> n4 = new Example12Node<>(45);

        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        Example12Node<Integer> current = head;

        while (current != null) {

            System.out.println(current.getElement());

            current = current.getNext();
        }
    }
}
