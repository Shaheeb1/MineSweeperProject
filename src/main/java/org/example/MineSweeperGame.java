package org.example;
import java.util.*;

public class MineSweeperGame {
    private static final int ROWS = 8;
    private static final int COLS = 8;
    private static final int MINES = 8;

    public boolean[][] board;
    public boolean[][] revealed;

    private Random rand = new Random();

    public MineSweeperGame() {
        board = new boolean[ROWS][COLS];
        revealed = new boolean[ROWS][COLS];
        initializeBoard();
    }

    public void initializeBoard() {

        int minesPlaced = 0;

        while (minesPlaced < MINES) {
            //generate 2 random numbers between 0 number columns and row place mine

            int row = rand.nextInt(ROWS);
            int col = rand.nextInt(COLS);
            //checking if mine already placed, not overlapping, if so skip
            if (!board[row][col]) {
                board[row][col] = true; // places mine and set location to true
                minesPlaced++;
            }
        }
    }

    public void printBoard() {

        System.out.println("0 1 2 3 4 5 6 7");
        System.out.println("---------------");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                //method checks cell is revealed (true) - if cell revealed
                // checks mine at cell if true displays Bomb
                if (revealed[row][col]) {
                    if (board[row][col]) {
                        System.out.print("B ");
                    } else {
                        //calls method how many cells/mines near cells
                        System.out.print(getAdjacentMines(row, col) + " ");
                    }
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public int getAdjacentMines(int row, int col) {

        int mineCount = 0;
        for (int i = row ;  i <= row + 1; i++) {
            for (int j = col ; j <= col + 1; j++) {
                //checking if cell is valid on gameboard, checks for mine
                //check each cell laft to right and up and down and if
                //mine present then increase counter
                if (i >= 0 && i < ROWS && j >= 0 && j < COLS && board[i][j]) {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            //prompts user to enter row and column select cell
            System.out.print("Enter row (0-7)" + " and column (0-7):");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
                System.out.println("Invalid input.");

            }
            //cant click same tile
            if (revealed[row][col]) {
                System.out.println("This cell has already been revealed.");

            }
            revealed[row][col] = true; //
            if (board[row][col]) {
                System.out.println("Game over!");
                             break;
            }

        }
        scanner.close();
    }

    public static void main(String[] args) {
        MineSweeperGame game = new MineSweeperGame();
        game.play();
    }

}
