package ejemplos;

import java.util.Scanner;

public class battleShip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to battle ship");
        System.out.println("Pleas enter the number of boxes in X");
        int boxesX=input.nextInt();
        System.out.println("Pleas enter the number of boxes in Y");
        int boxesY=input.nextInt();
        String[][] board1_str = new String[boxesY][boxesX];
        String[][] board2_str = new String[boxesY][boxesX];
        String[][] boardEnemies_str = new String[boxesY][boxesX];
        int[][] board1_int = new int[boxesY][boxesX];
        int[][] board2_int = new int[boxesY][boxesX];
        int[][] board3_int = new int[boxesY][boxesX];
        System.out.println("Pleas enter how many ships want:");
        int numberShips = input.nextInt();
        //fill arrays
        for (int i = 0; i < boxesY; i++) {
            for (int j = 0; j < boxesX; j++) {
                board1_str[i][j] = "0";
                boardEnemies_str[i][j] = "0";
            }
        }
        //fill ships
        for (int i = 0; i < numberShips; i++) {
            boolean fill1 = false, fill2 = false;
            do {
                System.out.println("Enter coordinate X (0-"+(boxesX-1)+") for the ship number " + (i + 1) + ":");
                int x = input.nextInt();
                System.out.println("Enter coordinate Y (0-"+(boxesY-1)+") for the ship number " + (i + 1) + ":");
                int y = input.nextInt();
                if (board1_int[y][x] == 0) {
                    board1_int[y][x] = 10;
                    board1_str[y][x] = "S";
                    fill1 = true;
                } else {
                    System.out.println("The coordinate is already fill whit a ship");
                    System.out.println("pleas enter other coordinate");
                    fill1 = false;
                }
            } while (!fill1);
            int x2,y2;
            do {
                x2 = (int) (Math.random() * boxesX);
                y2 = (int) (Math.random() * boxesY);
                if (board2_int[y2][x2] == 0) {
                    board2_int[y2][x2] = 10;
                    board2_str[y2][x2] = "S";
                    fill2 = true;
                } else {
                    fill2 = false;
                }
            } while (!fill2);
            //System.out.println("Coordinate of the enmies:("+x2+","+y2+")");
        }
        boolean winner1 = false, winner2 = false;
        //play
        System.out.println("Remember S is for Ship and X is a coordinate attacked");
        do {
            System.out.println("Board of enemies");
            printBorad(boardEnemies_str,boxesX,boxesY);
            System.out.println("You board");
            printBorad(board1_str,boxesX,boxesY);
            System.out.println("Pleas enter the coordinates to attack ");
            System.out.println("Pleas enter the coordinate (0-"+(boxesX-1)+") in X");
            int x = input.nextInt();
            System.out.println("Pleas enter the coordinate(0-"+(boxesY-1)+") in Y");
            int y = input.nextInt();
            if (board2_int[y][x] != 0) {
                System.out.println("You attack one enemies ship");
                board2_int[y][x] = 0;
            } else if (board2_int[y][x] == 0) {
                System.out.println("--------You fail");
            }
            boardEnemies_str[y][x] = "X";

            System.out.println("Turn of your enemies");
            boolean fillAttack = false;
            int x2 = 0, y2 = 0;
            do {
                x2 = (int) (Math.random() * boxesX);
                y2 = (int) (Math.random() * boxesY);
                if (board3_int[y2][x2] == 0) {
                    board3_int[y2][x2] = 5;
                    fillAttack = true;
                }else {
                    fillAttack = false;
                }
            } while (!fillAttack);
            System.out.println("The enemies attack in the coordinates (" + x2 + "," + y2 + ")");
            if (board1_int[y2][x2] != 0) {
                System.out.println("The enemies attack your ship");
                board1_int[y2][x2]=0;
            } else if (board1_int[y2][x2] == 0) {
                System.out.println("---------The enemies fail");
            }
            board1_str[y2][x2] = "X";
            winner1 = winner(board2_int,numberShips,boxesX,boxesY);
            winner2 = winner(board1_int,numberShips,boxesX,boxesY);
        } while (!winner1 && !winner2);

        if(winner1){
            System.out.println("The winner is the player 1");
        }else{
            System.out.println("The winner is the player 2");
        }

    }

    public static void printBorad(String[][] board,int boxesX,int boxesY) {
        System.out.print(" |");
        for(int i=0; i<boxesY;i++){
            if(i==(boxesY-1)) {
                System.out.print(i);
            }else{
                System.out.print(i + "|");
            }
        }
        System.out.println("|");
        for (int i = 0; i < boxesY; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < boxesX; j++) {
                if (j == (boxesX-1)) {
                    System.out.println(board[i][j] + "|");
                } else {
                    System.out.print(board[i][j] + "|");
                }
            }
        }
    }

    public static boolean winner(int[][] board, int numberShips,int boxesX,int boxesY) {
        boolean winner = false;
        int k = 0;
        for (int i = 0; i < boxesY; i++) {
            for (int j = 0; j < boxesX; j++) {
                if (board[i][j] > 0) {
                    k++;
                }
            }
        }
        if(k==numberShips){
            winner=false;
        }if(k==0){
            winner=true;
        }
        return winner;
    }
}




