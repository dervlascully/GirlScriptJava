package Week3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TicTacToe {

    // global variables -> scope = TicTacToe class; we can use these anywhere within the class
    static Scanner sc;   // Scanner to read in user input
    static String[] board;
    static String turn;  // "X" or "O"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
        populateEmptyBoard();  // populate the empty board with numbers 1 - 9

        System.out.println("Welcome to 2 Player Tic Tac Toe.");
        System.out.println("--------------------------------");
        printBoard();
        System.out.println("X's will play first. Enter a slot number to place X in:");

        while (winner == null) {


            try {
                int numInput = sc.nextInt();

                // int between 1 and 9 entered
                if(numInput >= 1 && numInput <= 9){
                    // if the slot still has the number in it (ie not an "X" or "O") then it is free
                    // if the slot does not still have the number in it then it is taken - error
                    // array indexes are 0 - 8, numbers are 1 - 9, so we check if board[numInput-1] == numInput
                    if(board[numInput-1].equals(String.valueOf(numInput))) {
                        board[numInput - 1] = turn; // set slot to "X" or "O"

                        // swap turn
                        if (turn.equals("X")) {
                            turn = "O";
                        } else {
                            turn = "X";
                        }

                        printBoard();
                        winner = checkWinner(); // winner = null, "X", "O" or "Draw"



                    }
                    // slot taken - error
                    else {
                        System.out.println("Slot already taken; re-enter slot number:");
                        continue;
                    }
                }

                // int entered not between 0 and 9
                else if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }

                }
                // int not entered, e.g. String or char entered
                catch (InputMismatchException e) {
                    System.out.println("Invalid input; re-enter slot number:");
                    sc.nextLine(); // clear buffer

                }
        }

        // winner = "draw" (in the case that both players lose. No one got 3 in a row)
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        }
        // winner = "X" or "O"
        else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }

    // returns "X", "O", "Draw" or null
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                break; // at least one of 1, 2, ..., 9 is in a slot - there is still an empty slot so the game is not over
            }
            // no one has won and there are no more empty slots - draw
            else if (a == 8) return "draw";
        }

        // no one has one and there are still empty slots - game is not over yet
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;

    }

    static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("/---|---|---\\");
    }

    // populates 'board' with "1" "2" "3" "4" "5" "6" "7" "8" "9"(board is an array of strings)
    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a+1);
        }
    }

}
