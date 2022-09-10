import java.util.Scanner;

public class Backspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(); // get input

        String result = "";
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '<'){
                result = result.replaceAll(".$",""); // remove last char from result
            } else {
                result += string.charAt(i);
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
