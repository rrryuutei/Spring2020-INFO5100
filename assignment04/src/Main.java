public class Main {
    public static void main(String[] args) {
        ConcurrentQueue q1 = new ConcurrentQueue();

        q1.queue.add(1);
        q1.queue.add("abc");
        q1.queue.add(2);
        System.out.println( q1.queue);
        System.out.println(q1.queue.peek());
        System.out.println(q1.queue.remove());
        System.out.println(q1.queue.isEmpty());
        System.out.println(q1.queue);
    }
}
