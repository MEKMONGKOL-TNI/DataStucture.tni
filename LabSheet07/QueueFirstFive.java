
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueFirstFive {

    public static void main(String[] args) {

        Queue<Integer> n_queue = new ArrayDeque<Integer>();

        
        for (int i = 101; i <= 110; i++) {

            n_queue.offer(i);

        }

        
        System.out.println("Queue => " + n_queue);

        
        for (int i = 0; i < 5; i++) {

            int number = n_queue.poll();

            System.out.println(number);

            n_queue.offer(number); // ใส่กลับท้ายคิว

        }

        
        for (int i = 0; i < n_queue.size() - 5; i++) {

            n_queue.offer(n_queue.poll());

        }

       
        System.out.println("Queue => " + n_queue);
    }
}

