public class Example13LinkedStackTrace {
    public static void main(String[] args) {

        Example12LinkedStack<String> s = new Example12LinkedStack<>();

        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println("size: " + s.size());

        System.out.println("peek: " + s.peek());

        System.out.println("pop: " + s.pop());

        System.out.println("size: " + s.size());

        System.out.println("peek: " + s.peek());
    }
}
