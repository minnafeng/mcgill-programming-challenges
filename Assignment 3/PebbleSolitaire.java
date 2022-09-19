import java.util.Scanner;

public class PebbleSolitaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints
        scanner.nextLine(); // read the leftover new line since we are reading lines after

        for (int i = 0; i < n; i++){
          char[] game = scanner.nextLine().toCharArray();
        
        boolean hasMoves = true;

        while (hasMoves){
          for (int x = 0; x < 12; x++){
            if (game[x] == 'o'){
              
            }
          }
        }

      }

        scanner.close();
    }
}

