package minefield;

import java.util.Scanner;
import java.util.Random;
public class GameMaterials {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random rand = new Random();
    Scanner inp = new Scanner(System.in);

    GameMaterials(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row, col, finish = 0;
        prepareGame();
        System.out.println("Oyun Basladi ! ");
        while (game) {
            print(board);
            System.out.println(" Satir");
            row = inp.nextInt();
            System.out.println("Sutun : ");
            col = inp.nextInt();
            if (row < 0 || row >= rowNumber) {
                System.out.println(" Gecersiz Koordinat ");
                continue;
            }
            if (col < 0 || col >= colNumber) {
                System.out.println(" Gecersiz Koordinat ");
                continue;
            }
            if (map[row][col] != -1) {
                check(row, col);
                finish++;
                if (finish == size - (size / 4)) {
                    System.out.println("Tebrikler Kazandiniz !!!");
                    break;
                }
            } else {
                this.game = false;
                System.out.println("Game Over !!");

            }

        }


    }


    public void check(int r, int c) {

        if (map[r][c] == 0) {
            if ((r > 0) && (c < colNumber - 1) && this.map[r - 1][c + 1] == -1) {
                board[r][c]++;
            }
            if ((c < colNumber - 1) && (this.map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((c < colNumber - 1) && (r < rowNumber - 1) && this.map[r + 1][c + 1] == -1) {
                board[r][c]++;
            }
            if ((r > 0) && (this.map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (this.map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (c > 0) && this.map[r - 1][c - 1] == -1) {
                board[r][c]++;
            }
            if ((c > 0) && (this.map[r][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (c > 0) && this.map[r + 1][c - 1] == -1) {
                board[r][c]++;
            }

            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }

    }

    public void prepareGame() {
        int randRow, randCol, count = 0;

        while (count != (this.size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (this.map[randRow][randCol] != -1) {
                this.map[randRow][randCol] = -1;

            }
            count++;

        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");

                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
