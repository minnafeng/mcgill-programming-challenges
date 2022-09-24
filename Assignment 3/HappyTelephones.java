import java.util.Scanner;

public class HappyTelephones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            // For each test case, get n,m

            int calls = scanner.nextInt();
            int intervals = scanner.nextInt();

            if ((calls == 0) && (intervals == 0)){
                break;
            }

            int[] callList = new int[calls*2]; // store calls
            int index = 0; // indexing for callList

            for (int i=0; i<calls; i++){ // for each call
                scanner.nextInt();
                scanner.nextInt();
                int start = scanner.nextInt();
                int end = scanner.nextInt() + start;

                callList[index] = start;
                index++;
                callList[index] = end;
                index++;
            }

            for (int i=0; i<intervals; i++){ // for each interval
                int start = scanner.nextInt();
                int end = scanner.nextInt() + start;
                int counter = 0;

                for (int j=0; j<callList.length; j+=2){ // for each call
                    int callStart = callList[j];
                    int callEnd = callList[j+1];
                    if ((callEnd > start) && (callStart < end)){
                        counter ++;
                    }
                }

                System.out.println(counter);

            }
        }

        scanner.close();
    }
}
