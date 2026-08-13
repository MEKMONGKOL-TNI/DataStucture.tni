
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {

    public static Queue<Integer> queue = new ArrayDeque<Integer>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        originalQueue();

        while (true) {

            System.out.print("\nPress 1 to rotate queue: ");

            int option = input.nextInt();

            if (option == 1) {

                rotateQueue();

            } else {

                System.out.println("Exit");
                break;

            }
        }
    }

    
    public static void rotateQueue() {

        int number = queue.poll();

        System.out.println("Calling queue: " + number);

        queue.offer(number); 

        System.out.println("Queue => " + queue);
    }

    
    public static void originalQueue() {

        for (int i = 101; i <= 107; i++) {

            queue.offer(i);

        }

        System.out.println("Queue => " + queue);
    }
}
