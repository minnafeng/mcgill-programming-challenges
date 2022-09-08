import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints

        for (int i = 0; i < n; i++){
            int num = scanner.nextInt();
            if (num % 2 == 0){
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }

        scanner.close();
    }
}
