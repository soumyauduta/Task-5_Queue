import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        System.out.println("Queue Elements: "+q);
        System.out.print("Removed Element: "+q.remove()+" ");
        System.out.println(q.remove());
        System.out.println("Existing Elements: "+q);
    }
}
