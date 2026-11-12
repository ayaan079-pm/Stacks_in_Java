public class Example8ArrayStackTrace {
    public static void main(String[] args) {

        Example7ArrayStack<String> s = new Example7ArrayStack<>();

        s.push("A");
        s.push("B");

        System.out.println("size " + s.size()
                + ", capacity " + s.capacity());

        s.push("C");

        System.out.println("size " + s.size()
                + ", capacity " + s.capacity());

        System.out.println("peek: " + s.peek());

        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
    }
}