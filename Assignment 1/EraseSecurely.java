import java.util.Scanner;

public class EraseSecurely {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints
        scanner.nextLine(); // read the leftover new line since we are reading lines after
        String result = "";
        for (int i = 0; i < n; i++){

            System.out.println("Case #"+ i+1 + ": " + result);
        }

        scanner.close();
    }
}

/* Base Template

import java.util.Scanner;

public class EraseSecurely {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints
        scanner.nextLine(); // read the leftover new line since we are reading lines after

        for (int i = 0; i < n; i++){

        }
    }
}
*/