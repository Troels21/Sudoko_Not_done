package sample;

import java.util.stream.IntStream;

public class Algorimte {
    int[] tal;
    static int[][] board = new int[9][9];
    static int[][] checkBoard = new int[9][9];
    static int[][] SolvedBoard = new int[9][9];
    int bufferrandom;


    public void makeSudoko() {
        makeSudokodiagonal();
        solve(board);
        SolvedBoard=board;
    }

    public void makeSudokodiagonal() {
        //first box
        tal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                bufferrandom = randomnumber();
                while (tal[bufferrandom] == 0) {
                    bufferrandom = randomnumber();
                }
                board[x][y] = tal[bufferrandom];
                tal[bufferrandom] = 0;
            }
        }
        //secound box
        tal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int y = 3; y < 6; y++) {
            for (int x = 3; x < 6; x++) {
                bufferrandom = randomnumber();
                while (tal[bufferrandom] == 0) {
                    bufferrandom = randomnumber();
                }
                board[x][y] = tal[bufferrandom];
                tal[bufferrandom] = 0;
            }
        }
        //third box
        tal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int y = 6; y < 9; y++) {
            for (int x = 6; x < 9; x++) {
                bufferrandom = randomnumber();
                while (tal[bufferrandom] == 0) {
                    bufferrandom = randomnumber();
                }
                board[x][y] = tal[bufferrandom];
                tal[bufferrandom] = 0;
            }
        }
    }

    public boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        board[row][column] = k;
                        if (isValid(board, row, column) && solve(board)) {
                            return true;
                        }
                        board[row][column] = 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int[][] board, int x, int y) {
        return (xtal(board, x)
                && ytal(board, y)
                && tal3x3(board, x, y));
    }

    private boolean xtal(int[][] board, int x) {
        boolean[] talx = new boolean[9];
        return IntStream.range(1, 9).allMatch(y -> checktal(board, x, talx, y));
    }

    private boolean ytal(int[][] board, int y) {
        boolean[] taly = new boolean[9];
        return IntStream.range(1, 9).allMatch(x -> checktal(board, x, taly, y));
    }

    private boolean tal3x3(int[][] board, int x, int y) {
        boolean[] tal3x3 = new boolean[9];
        int subsectionRowStart = (x / 3) * 3;
        int subsectionRowEnd = subsectionRowStart + 3;

        int subsectionColumnStart = (y / 3) * 3;
        int subsectionColumnEnd = subsectionColumnStart + 3;

        for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
            for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
                if (!checktal(board, r, tal3x3, c)) return false;
            }
        }
        return true;
    }


    boolean checktal(int[][] board, int x, boolean[] checktal, int y) {
        if (board[x][y] != 0) {
            if (!checktal[board[x][y] - 1]) {
                checktal[board[x][y] - 1] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        board = new int[9][9];
    }

    public int randomnumber() {
        double math = Math.random() * 9;
        return (int) math;
    }

    public boolean isSudokoSolved() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (checkBoard[x][y] <1 || checkBoard[x][y] >9 ) {
                    return false;
                }
            }
        }

        int counter = 0;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (isValid(checkBoard, row, column)) {
                    counter++;
                }
            }
        }
        if (counter == 81) {
            return true;
        }
        return false;
    }
}
