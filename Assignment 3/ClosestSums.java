import java.util.Arrays;
import java.util.Scanner;

public class ClosestSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = 1; //  test case number

        while(scanner.hasNext()){
            // For each test case
            System.out.println("Case "+testCase+":");

            // Get array of numbers that will be used for summation
            int numInt = scanner.nextInt();
            int[] numbers = new int[numInt];

            for (int i=0; i<numInt; i++){
                numbers[i] = scanner.nextInt();
            }

            // Get array of queries
            int numQueries = scanner.nextInt();
            int[] queries = new int[numQueries];

            for (int i=0; i<numQueries; i++){ // for each query
                queries[i] = scanner.nextInt();
            }

            // Sort numbers
            Arrays.sort(numbers);

            // Find closest sums for each query
            for (int i=0; i<numQueries; i++){ // for each query
                int diff = Integer.MAX_VALUE; // best difference found so far
                int query = queries[i]; // get target query

                for (int a=0; a<numbers.length-1; a++){ // iterate through numbers to sum
                    for (int b=a+1; b<numbers.length; b++){
                        int currDiff = query - (numbers[a] + numbers[b]);
                        if (Math.abs(currDiff) < Math.abs(diff)){
                            diff = currDiff; // update best diff
                        }
                    }
                }
                System.out.println("Closest sum to "+query+" is "+Math.abs(query-diff)+".");
            }
            testCase++;
        }
        scanner.close();
    }
}
