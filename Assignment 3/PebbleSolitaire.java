import java.util.Scanner;

// Complete search approach 
public class PebbleSolitaire {
    public static boolean isValidRight(char[] board, int pos){
        try{
            if (board[pos+1] == 'o' && board[pos+2] == '-'){ // if space on the right
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidLeft(char[] board, int pos){
        try{
            if (board[pos-1] == 'o' && board[pos-2] == '-'){ // if space on the left
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static char[] rightMove(char[] board, int pos){
        board[pos] = '-';
        board[pos+1] = '-';
        board[pos+2] = 'o';
        return board;
    }

    public static char[] leftMove(char[] board, int pos){
        board[pos] = '-';
        board[pos-1] = '-';
        board[pos-2] = 'o';
        return board;
    }

    public static char[] undoRightMove(char[] board, int pos){
        board[pos] = 'o';
        board[pos+1] = 'o';
        board[pos+2] = '-';
        return board;
    }

    public static char[] undoLeftMove(char[] board, int pos){
        board[pos] = 'o';
        board[pos-1] = 'o';
        board[pos-2] = '-';
        return board;
    }

    public static int solve(char[] board, int minCount){
        for (int i = 0; i < 12; i++){
            if (board[i] == 'o'){
                if (isValidRight(board,i)){
                    board = rightMove(board,i);
                    int count = countPebbles(board);
                    if (count < minCount){
                        minCount = count;
                    }
                    minCount = solve(board, minCount);
                    board = undoRightMove(board,i);
                }
                if (isValidLeft(board,i)){
                    board = leftMove(board,i);
                    int count = countPebbles(board);
                    if (count < minCount){
                        minCount = count;
                    }
                    minCount = solve(board, minCount);
                    board = undoLeftMove(board,i);
                }
            }
        }
        return minCount;
    }

    // Count remaining pebbles in board
    public static int countPebbles(char[] board){
        int count = 0;
        for (char x: board){
            if (x == 'o'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of ints
        scanner.nextLine(); // read the leftover new line since we are reading lines after

        for (int i = 0; i < n; i++){ // for each game
            char[] board = scanner.nextLine().toCharArray();
            int initialCount = countPebbles(board);
            int finalCount = solve(board,initialCount);
            System.out.println(finalCount);
        }

        scanner.close();
    }
}

