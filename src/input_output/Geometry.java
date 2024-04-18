package input_output;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {

      Scanner myObj = new Scanner(System.in);
      System.out.println("Please enter Number a : ");
      double number = myObj.nextDouble();
      System.out.println("Please enter Number b : ");
      double number2 = myObj.nextDouble();
      System.out.println("rectangle Area is " + (number + number2) *2);
      System.out.println("rectangle perimeter is " + (number * number2));
      System.out.println("triangle area is " + (number * number2)* 0.5);
      double hypotenuse = Math.sqrt(Math.pow(number,2) + Math.pow(number2,2));
      System.out.println("triangle area is " + (hypotenuse+number2+number));
    }
}
