
import java.util.LinkedList;
import java.util.Queue;

public class LabQueue01 {

    public static void main(String[] args) {

        
        Queue<Integer> queue = new LinkedList<>();

        
        for (int i = 101; i <= 105; i++) {
            queue.offer(i); // enqueue
            System.out.println("Enqueue: " + i);
        }

        
        System.out.println("Queue => " + queue);
        System.out.println();

        while (!queue.isEmpty()) {

            
            int number = queue.peek();
            System.out.println("Calling number: " + number);

            
            number = queue.poll();
            System.out.println("Providing service number: " + number);
            System.out.println();
        }

        
        System.out.println("Queue => " + queue);
    }
}

