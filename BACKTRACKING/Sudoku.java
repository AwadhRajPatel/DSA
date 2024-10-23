package BACKTRACKING;

public class Sudoku {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 9, 6, 0, 0, 0, 0, 0, 7, 8 },
                { 0, 2, 0, 0, 3, 0, 0, 4, 0 },
                { 0, 0, 0, 0, 4, 0, 7, 0, 3 },
                { 7, 4, 3, 9, 0, 0, 5, 0, 0 },
                { 8, 2, 7, 0, 0, 3, 9, 0, 0 }
        };

        if (solveBoard(board)) {
            System.out.println("Sudoku solved successfully!");
        } else {
            System.out.println("Unsolvable Sudoku board.");
        }

        printBoard(board);
    }

    // Solve the Sudoku board using backtracking
    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                // Look for an empty cell
                if (board[row][col] == 0) {
                    // Try digits 1 through 9
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidPlacement(board, num, row, col)) {
                            board[row][col] = num;

                            // Recursively try to fill the rest of the board
                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][col] = 0; // Undo the move
                            }
                        }
                    }
                    return false; // No valid placement found
                }
            }
        }
        return true; // All cells are filled
    }

    // Check if placing num at board[row][col] is valid
    private static boolean isValidPlacement(int[][] board, int num, int row, int col) {
        // Check if num is already in the row, column, or 3x3 sub-grid
        return !isInRow(board, num, row) && !isInCol(board, num, col) && !isInBox(board, num, row, col);
    }

    // Check if num is in the given row
    private static boolean isInRow(int[][] board, int num, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num) {
                return true;
            }
        }
        return false;
    }

    // Check if num is in the given column
    private static boolean isInCol(int[][] board, int num, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    // Check if num is in the 3x3 sub-grid containing board[row][col]
    private static boolean isInBox(int[][] board, int num, int row, int col) {
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    // Print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

}
