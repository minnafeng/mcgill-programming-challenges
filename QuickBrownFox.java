import java.util.Scanner;


public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints
        scanner.nextLine(); // read the leftover new line since we are reading lines after

        for (int i = 0; i < n; i++){
            boolean[] alphabet = new boolean[26]; // array to check letters for each phrase
            String str = scanner.nextLine().toLowerCase(); // get next phrase in lowercase
            char[] chars = str.toCharArray(); // convert string to char[] array

            // iterate over char[] array
            for (char ch: chars) {
                if (ch > 96 && ch < 123 ){ // if char is a letter
                    alphabet[ch - 'a'] = true; // set letter to true
                }
            }

            String missing = "";
            boolean isPangram = true;
            for (int j = 0; j < alphabet.length; j++){
                if (alphabet[j] == false){
                    missing += (char) (j + 'a');
                    isPangram = false;
                }
            }

            if (isPangram == true){
                System.out.println("pangram");
            } else {
                System.out.println("missing " + missing.toString());
            }

        }

        scanner.close();


    }
}
