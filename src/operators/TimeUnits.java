package operators;

import java.util.Scanner;

public class TimeUnits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter Time in Seconds : ");
        int timeInSeconds = myObj.nextInt();
        int years = timeInSeconds/(365*24*60*60);
        timeInSeconds = timeInSeconds%(365*24*60*60);
        int days =timeInSeconds/(24*60*60);
        timeInSeconds = timeInSeconds%(24*60*60);
        int hours = timeInSeconds/(60*60);
        timeInSeconds =timeInSeconds%(60*60);
        int minute = timeInSeconds /(60);
        timeInSeconds =timeInSeconds%(60);

        System.out.println(years+" years and "+ days+" days and "+hours+" hours and "+minute+" minutes and "+timeInSeconds+" seconds");
    }
}
