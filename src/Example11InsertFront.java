public class Example11InsertFront {

    static void print(String label, Example12Node<String> head) {

        System.out.print(label);

        Example12Node<String> cur = head;

        for (int i = 0; i < 5 && cur != null; i++) {

            System.out.print(cur.getElement() + " -> ");

            cur = cur.getNext();
        }

        System.out.println(cur == null ? "null" : "...");
    }

    public static void main(String[] args) {

        // Correct order
        Example12Node<String> head = new Example12Node<>("B");

        Example12Node<String> newNode = new Example12Node<>("A");

        newNode.setNext(head);

        head = newNode;

        print("Correct: ", head);

        // Swapped order
        head = new Example12Node<>("B");

        newNode = new Example12Node<>("A");

        head = newNode;

        newNode.setNext(head);

        print("Swapped: ", head);
    }
}