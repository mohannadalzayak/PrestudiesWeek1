package loops;

import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

public class GuessingNumbers {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int x = (int)Math.floor(Math.random() * (max - min + 1) + min);
//       int x = ThreadLocalRandom.current().nextInt(1,101); another way to create random number
        System.out.println(x);
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter A number");
        while (true){

        int number = myObj.nextInt();
        if (number > x){
            System.out.println("Try a smaller number");
        }
        else if (number <x){
            System.out.println("Try a greater number");
        }
        else {
            System.out.println("Cood That is the Number!");
            break;
        }
        }

    }
}
