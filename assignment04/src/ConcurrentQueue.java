
import java.util.LinkedList;
import java.util.Queue;


public class ConcurrentQueue <T> {


    Queue<T> queue = new LinkedList();

    private static ConcurrentQueue obj = new ConcurrentQueue();

    // add
    void add(T data) {
        synchronized (obj) {
            queue.add(data);
        }
        queue.add(data);

    }
    // remove
    T remove() {
        synchronized (obj) {
            return queue.remove();
        }
    }

    //peek
    T peek() {
        synchronized (obj) {
            return queue.peek();
        }
    }
    //Boolean isEmpty
    boolean isEmpty() {
        synchronized (obj) {
            return queue.isEmpty();
        }
    }
}

