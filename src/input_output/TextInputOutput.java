package input_output;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//import java.math.BigInteger;
import java.util.Scanner;
public class TextInputOutput {
    public static void main(String[] args) {

      Scanner myObj = new Scanner(System.in);
      System.out.println("Please enter your name : ");
      String userName = myObj.nextLine();
      System.out.println("Hello " + userName +", Welcome to the training!") ;

    }

}

