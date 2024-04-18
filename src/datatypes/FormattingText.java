package datatypes;

import java.util.Scanner;

public class FormattingText {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = myObj.nextLine();
        int countHashtags = 0;
        int firstHashtag = -1;
        int countUnderscore = 0;
        int firstUnderscore = -1;
        String hashSub ="";
        String underscoreSub = "";
        for(int i = 0; i < fileName.length(); i++) {
            if (fileName.charAt(i) == '#'){
                countHashtags++;
                if(countHashtags == 1){
                    firstHashtag = i;
                    continue;
                }
                else if(countHashtags == 2){
                    hashSub = fileName.substring(firstHashtag,i+1);
                    fileName = fileName.replace(hashSub,hashSub.toLowerCase().replace("#" , ""));
                    countHashtags = 0;
                    firstHashtag = -1;
                }


            }
            else if(fileName.charAt(i) ==' '){
                if(countHashtags == 1){
                    countHashtags = 0;
                }

            }
        }
        for(int i = 0; i < fileName.length(); i++) {
            if (fileName.charAt(i) == '_'){
                countUnderscore++;
                if(countUnderscore == 1){
                    firstUnderscore = i;
                    continue;
                }
                else if(countUnderscore == 2){
                    underscoreSub = fileName.substring(firstUnderscore,i+1);
                    fileName = fileName.replace(underscoreSub,underscoreSub.toUpperCase().replace("_" , ""));
                    countUnderscore = 0;
                    firstUnderscore = -1;
                }


            }
            else if(fileName.charAt(i) ==' '){
                if(countUnderscore == 1){
                    countUnderscore = 0;
                }

            }
        }
        System.out.println(fileName);

    }
}








