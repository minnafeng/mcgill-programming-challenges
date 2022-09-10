import java.util.Scanner;
import java.util.LinkedList;

public class Backspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(); // get input

        LinkedList<Character> list = new LinkedList<>(); // need mutable list
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '<'){
                list.removeLast();
            } else {
                list.add(string.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character c : list){
            result.append(c);
        }

        System.out.println(result);

        scanner.close();
    }
}