package org.example;

public interface MineSweeperInterface {
    static final int ROWS = 10;
    static final int COLS = 10;
    static final int MINES = 10;

    boolean[][] board = new boolean[ROWS][COLS];
    boolean[][] revealed = new boolean[ROWS][COLS];

    void intializeBoard();

    void printBoard();

    public default boolean getboard() {
        return board[ROWS][COLS];
    }


}
