import java.util.*;

public class GuessTheDataStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) { // read until EOF
            int n = scanner.nextInt(); // number of test cases
            scanner.nextLine(); // read the leftover new line since we are reading lines after

            // Define all 3 data structures
            Stack<String> stack = new Stack<>();
            LinkedList<String> queue = new LinkedList<>();
            PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // turn into maxPQ

            // define flags
            boolean isStack = true;
            boolean isQueue = true;
            boolean isPQ = true;

            for (int i = 0; i < n; i++) { // iterate through each command
                String cmd = scanner.nextLine(); // read in next command
                String[] cmdArray = cmd.split(" "); // [command type, element]

                if (cmdArray[0].equals("1")) { // type 1 command
                    stack.add(cmdArray[1]);
                    queue.addLast(cmdArray[1]);
                    priorityQueue.add(cmdArray[1]);

                } else { // type 2 command
                    if (stack.isEmpty() || !(cmdArray[1].equals(stack.pop()))) {
                        isStack = false;
                    }
                    if (queue.isEmpty() || !(cmdArray[1].equals(queue.removeFirst()))) {
                        isQueue = false;
                    }
                    if (priorityQueue.isEmpty() || !(cmdArray[1].equals(priorityQueue.poll()))) {
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