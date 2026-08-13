import java.util.ArrayDeque;
import java.util.Deque;

public class StackValidSequence {

    public static Deque<String> stack1 = new ArrayDeque<String>();

    public static void main(String[] args) {

        String[][] testcases = {
                {"red", "blue", "green", "orange"},
                {"red", "green", "blue", "orange"},
                {"blue", "orange", "green", "red"}
        };

        for (int i = 0; i < testcases.length; i++) {

            originalStack();

            System.out.println("Sequence testcase" + (i + 1) + " is "
                    + (isValidSequence(testcases[i]) ? "Valid" : "Invalid"));

            System.out.println();
        }
    }

    public static boolean isValidSequence(String[] testcase) {

        Deque<String> stack_break = new ArrayDeque<String>();

        int focus = 0;

        while (!stack1.isEmpty()) {

            
            String value = stack1.pop();

            
            if (focus < testcase.length && value.equals(testcase[focus])) {

                focus++;

            } else {

                
                stack_break.push(value);

            }

            
            while (!stack_break.isEmpty()
                    && focus < testcase.length
                    && stack_break.peek().equals(testcase[focus])) {

                stack_break.pop();
                focus++;

            }
        }

        return stack_break.isEmpty() && focus == testcase.length;
    }

    public static void originalStack() {

        stack1.clear();

        final String[] colors = {"red", "green", "blue", "orange"};

        for (String color : colors) {
            stack1.push(color);
        }

        System.out.println("Original stack => " + stack1);
    }
}