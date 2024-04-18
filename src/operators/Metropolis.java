package operators;

import java.util.Scanner;

public class Metropolis {
    public static void main(String[] args) {

       Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter Name of the city : ");
        String cityName =myObj.next();
        System.out.println("Is "+cityName+"a capital ('true' or 'false')?");
        boolean isCapital = myObj.nextBoolean();
        System.out.println("What is the population of"+cityName+"?");
        int population =myObj.nextInt();
        System.out.println("Tax income per inhabitant :");
        double taxPerPerson = myObj.nextInt();

        if (isCapital && population>100000 ){
            System.out.println(cityName +"is a metropolis,because it is a capital with a population of 1200000"+ population);
        }
        else if (population>200000 && (taxPerPerson*population)>=1000000000){
            System.out.println(cityName +"is a metropolis,because the population "+ population+" annual tax income is"+taxPerPerson*population);
        }
        else {
            System.out.println(cityName+"is no metropolis");
        }
    }
}
