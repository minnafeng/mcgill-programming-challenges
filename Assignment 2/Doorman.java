import java.util.LinkedList;
import java.util.Scanner;

public class Doorman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDiff = scanner.nextInt(); // biggest difference
        scanner.nextLine(); // read leftover new line


        String line = scanner.nextLine();
        int men = 0; // number of men
        int women = 0; // number of women
        int inside = 0; // number of people let in

        LinkedList<Character> queue = new LinkedList<>(); // convert into queue
        for (char c : line.toCharArray()){
            queue.add(c);
        }

        while (queue.size() != 0){
            char person = queue.removeFirst();

            if (person == 'W'){
                women++;
            } else {
                men++;
            }

            // check if diff is exceeded
            int diff = Math.abs(men-women); // compute absolute difference

            if (diff > maxDiff){
                char nextPerson = queue.removeFirst(); // get second person in line
                if (nextPerson != person){
                    // add nextPerson
                    if (nextPerson == 'W'){
                        women++;
                    } else {
                        men++;
                    }
                    inside += 2;
                } else {
                    break;
                }
            } else {
                inside++;
            }
        }

        System.out.println(inside);

        scanner.close();

    }
}