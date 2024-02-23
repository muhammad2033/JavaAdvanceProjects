import java.util.*;

public class Sokoban {
    static final int ROW = 10;
    static final int COL = 10;
    static char[][] grid = new char[ROW][COL];
    static int playerRow, playerCol;

    public static void main(String[] args) {
        initializeGrid();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                printGrid();
                System.out.print("Enter move (WASD): ");
                char move = sc.next().charAt(0);
                switch (move) {
                    case 'w':
                        if (isValidMove(playerRow - 1, playerCol)) {
                            playerRow--;
                        }
                        break;
                    case 'a':
                        if (isValidMove(playerRow, playerCol - 1)) {
                            playerCol--;
                        }
                        break;
                    case 's':
                        if (isValidMove(playerRow + 1, playerCol)) {
                            playerRow++;
                        }
                        break;
                    case 'd':
                        if (isValidMove(playerRow, playerCol + 1)) {
                            playerCol++;
                        }
                        break;
                    default:
                        System.out.println("Invalid move.");
                        break;
                }
            }
        }
    }

    private static void initializeGrid() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                grid[i][j] = '.';
            }
        }
        playerRow = 0;
        playerCol = 0;
        grid[playerRow][playerCol] = 'P';
    }

    private static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= ROW || col < 0 || col >= COL) {
            return false;
        }
        return true;
    }

    private static void printGrid() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
