package minefield;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Welcome minefield!");
        System.out.println("if you see -2 don't have any mine");
        System.out.println("you see have mine number");
        System.out.println("Good Luck!");

        System.out.println("Please enter your dimension:");
        System.out.println("Enter row:");
        row = input.nextByte();
        System.out.println("Enter col:");
        col = input.nextByte();

        GameMaterials mine = new GameMaterials(row,col);
        mine.run();
    }
}
