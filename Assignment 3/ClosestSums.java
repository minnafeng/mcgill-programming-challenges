import java.util.Arrays;
import java.util.Scanner;

public class ClosestSums {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = 1; //  test case number

    while(scanner.hasNext()){
      // For each test case
      System.out.println("Case "+testCase+":");
      testCase++;

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

      // Sort queries
      Arrays.sort(queries);

      // Find closest sums for each query 
    
      for (int i=0; i<queries.length; i++){
        int currDiff = Integer.MAX_VALUE; // best difference found so far 

        int query = queries[i]; 
        
        for (int a=0; a<numbers.length; a++){
          for (int b=0; b<numbers.length; b++){

          }
        }
      }
    }


    scanner.close();
  }
}
