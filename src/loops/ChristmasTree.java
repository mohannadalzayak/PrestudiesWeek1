package loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner mxObj = new Scanner(System.in);
        System.out.print("Enter the high of tree : ");
        int treeHigh = mxObj.nextInt();
        for (int i = 0; i < treeHigh; i++) {
            for (int j = 0; j < treeHigh - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*" );
            }
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < treeHigh - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" I");
        }
    }
}
