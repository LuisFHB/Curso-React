package ejemplos;

import java.util.Scanner;

public class ticktacktoe {
    public static void main(String[]args) {
        int[][] grid = new int[3][3];
        String[][] gridStr = new String[3][3];
        Scanner input = new Scanner(System.in);
        int x1,y1,x2,y2,k=0;
        boolean winner1=false, winner2=false,x1_fill=false,y1_fill=false,x2_fill=false, y2_fill=false;
        System.out.println("Player one use the X and player two use the O");
        System.out.println("Enter the coordinates to play");
        do {
            if(!winner2) {
                printgrid(grid, gridStr);
                System.out.println("Player one pleas enter coordinate in Y:");
                x1 = input.nextInt();
                System.out.println("Player one pleas enter coordinate in X:");
                y1 = input.nextInt();
                do{
                    if(grid[x1][y1]==0){
                        grid[x1][y1] = 1;
                        gridStr[x1][y1] = "-X-";
                        x1_fill=true;
                        y1_fill=true;
                    }else{
                        System.out.println("That space already is fill, pleas enter other coordinates");
                        System.out.println("Player one pleas enter coordinate in Y:");
                        x1 = input.nextInt();
                        System.out.println("Player one pleas enter coordinate in X:");
                        y1 = input.nextInt();
                        x1_fill=false;
                        y1_fill=false;
                    }
                }while (x1_fill==false || y1_fill==false);
                winner1 = revWinner1(grid);
            }
            k++;
            if(!winner1) {
                printgrid(grid, gridStr);
                System.out.println("Player two pleas enter coordinate in Y:");
                x2 = input.nextInt();
                System.out.println("Player two pleas enter coordinate in X:");
                y2 = input.nextInt();
                do{
                    if(grid[x2][y2]==0){
                        grid[x2][y2] = -1;
                        gridStr[x2][y2] = "-O-";
                        x2_fill=true;
                        y2_fill=true;
                    }else{
                        System.out.println("That space alredy is fill, pleas enter other coordinates");
                        System.out.println("Player two pleas enter coordinate in Y:");
                        x2 = input.nextInt();
                        System.out.println("Player two pleas enter coordinate in X:");
                        y2 = input.nextInt();
                        x2_fill=false;
                        y2_fill=false;
                    }
                }while (x2_fill==false || y2_fill==false);

                winner2 = revWinner2(grid);

            }
            for(int i=0; i<3;i++){
                for(int j=0; j<3;j++){
                    if(grid[i][j]!=0){
                        k++;
                    }else{
                        k=0;
                    }
                }
            }
        }while (winner1==false && winner2==false && k<9);
        printgrid(grid,gridStr);
        if(winner1){
            System.out.println("The winer is the player 1");
        }
        if(winner2){
            System.out.println("The winer is the player 2");
        }if(!winner1 && !winner2){
            System.out.println("No winner");
        }


    }

    public static void printgrid(int[][] grid,String[][]gridStr){
        System.out.println(" [-0-|-1-|-2-]");
        for (int i = 0; i < 3; i++) {
            System.out.print(i+"[");
            for (int j = 0; j < 3; j++) {
                if(grid[i][j]==0) {
                    if (j == 2) {
                        //System.out.print(i + "," + j);
                        System.out.print("---");
                    } else {
                        //System.out.print(i + "," + j + "|");
                        System.out.print("---|");
                    }
                }if(grid[i][j]!=0){
                    if (j == 2) {
                        System.out.print(gridStr[i][j]);
                    } else {
                        System.out.print(gridStr[i][j]+ "|");
                    }
                }
            }
            System.out.println("]");
        }



    }

    public static boolean revWinner1(int[][] grid){
        boolean winner1=false;
        if(
                (grid[0][0]+grid[0][1]+grid[0][2])>2 ||
                (grid[1][0]+grid[1][1]+grid[1][2])>2 ||
                (grid[2][0]+grid[2][1]+grid[2][2])>2 ||
                (grid[0][0]+grid[1][0]+grid[2][0])>2 ||
                (grid[0][1]+grid[1][1]+grid[2][1])>2 ||
                (grid[0][2]+grid[1][2]+grid[2][2])>2 ||
                (grid[0][0]+grid[1][1]+grid[2][2])>2 ||
                (grid[0][2]+grid[1][1]+grid[2][0])>2
        ){
           winner1=true;
        }
        return  winner1;
    }
    public static boolean revWinner2(int[][] grid){
        boolean winner2=false;
        if(
                (grid[0][0]+grid[0][1]+grid[0][2])<-2 ||
                (grid[1][0]+grid[1][1]+grid[1][2])<-2 ||
                (grid[2][0]+grid[2][1]+grid[2][2])<-2 ||
                (grid[0][0]+grid[1][0]+grid[2][0])<-2 ||
                (grid[0][1]+grid[1][1]+grid[2][1])<-2 ||
                (grid[0][2]+grid[1][2]+grid[2][2])<-2 ||
                (grid[0][0]+grid[1][1]+grid[2][2])<-2 ||
                (grid[0][2]+grid[1][1]+grid[2][0])<-2
        ){
           winner2=true;
        }
        return  winner2;
    }


}
