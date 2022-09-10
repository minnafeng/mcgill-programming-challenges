import java.util.Scanner;


public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints
        int c = 0; // counter

        for (int i = 0; i < n; i++){
            int num = scanner.nextInt();
            if (num < 0){
                c++;
            }
        }

        System.out.println(c);

        scanner.close();
    }
}
