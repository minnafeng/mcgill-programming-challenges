import java.util.*;

public class GuessTheDataStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) { // read until EOF
            int n = scanner.nextInt(); // number of test cases
            //scanner.nextLine(); // read the leftover new line since we are reading lines after

            // Define all 3 data structures
            Stack<Integer> stack = new Stack<>();
            LinkedList<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // turn into maxPQ

            // define flags
            boolean isStack = true;
            boolean isQueue = true;
            boolean isPQ = true;

            for (int i = 0; i < n; i++) { // iterate through each command
                int cmd = scanner.nextInt();

                if (cmd == 1) { // type 1 command
                    int next = scanner.nextInt();
                    stack.add(next);
                    queue.addLast(next);
                    priorityQueue.add(next);

                } else { // type 2 command
                    int expected = scanner.nextInt();
                    if (stack.isEmpty() || !(expected == stack.pop())) {
                        isStack = false;
                    }
                    if (queue.isEmpty() || !(expected == queue.removeFirst())) {
                        isQueue = false;
                    }
                    if (priorityQueue.isEmpty() || !(expected == priorityQueue.poll())) {
                        isPQ = false;
                    }
                }
            }

            if ((isStack && isQueue) || (isStack && isPQ) || (isQueue && isPQ)) { // if more than 2 true
                System.out.println("not sure");
            } else if (isStack) {
                System.out.println("stack");
            } else if (isQueue) {
                System.out.println("queue");
            } else if (isPQ) {
                System.out.println("priority queue");
            } else { // none are true
                System.out.println("impossible");
            }
        }
        scanner.close();
    }
}
