package operators;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter circumference : ");
        double circumference = myObj.nextDouble();
        System.out.print("Please enter height : ");
        double height =myObj.nextDouble();
        double  lidDiameter = circumference/Math.PI;
        double lidArea = Math.PI*(lidDiameter/2)*(lidDiameter/2);
        double casingArea = circumference*height;
        double sheet =2*lidArea+casingArea;
        double volume =lidArea*height;
        System.out.println("Sheet metal area: "+sheet);
        System.out.println("Volume: "+volume);
    }
}
