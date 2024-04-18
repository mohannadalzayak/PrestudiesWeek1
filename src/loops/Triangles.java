package loops;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("How large should the triangles be? ");
        int large =myObj.nextByte();
        System.out.print("How many triangles would you like? ");
        int numberOfTriangles = myObj.nextByte();
        for (int t=0 ;t<numberOfTriangles;t++){
        for (int i=0 ;i<=large ;i++){
            for (int j=0 ;j<i;j++){
                System.out.print("*");
                }
             System.out.println();


            }
        }

    }
}
