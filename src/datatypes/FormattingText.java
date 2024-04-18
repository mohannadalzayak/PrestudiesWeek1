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










//        if (fileName.contains("#")) {
//            int yy =fileName.indexOf("#");
//            int xx = fileName.lastIndexOf("#");
//            String zz = fileName.substring(yy,xx+1);
//            fileName = fileName.replace(zz,zz.toLowerCase());
//            fileName = fileName.replace("#","");
//        }
//        if (fileName.contains("_")) {
//            int y = fileName.indexOf("_");
//            int x =fileName.lastIndexOf("_");
//            String z = fileName.substring(y,x+1);
//            fileName = fileName.replace(z,z.toUpperCase());
//            fileName = fileName.replace("_","");
//
//        }

//    static String formattingText(String text,char sympol){
//        int count_hashtags = 0;
//        int first_hashtag = -1;
//        String hash_sub ="";
//        for(int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == sympol){
//                count_hashtags++;
//                if(count_hashtags == 1){
//                    first_hashtag = i;
//                    continue;
//                }
//                else if(count_hashtags == 2){
//                    hash_sub = text.substring(first_hashtag,i+1);
//                    text = text.replace(hash_sub,hash_sub.toLowerCase().replace(String.valueOf(sympol) , ""));
//                    count_hashtags = 0;
//                    first_hashtag = -1;
//                }
//
//
//            }
//            else if(text.charAt(i) ==' '){
//                if(count_hashtags == 1){
//                    count_hashtags = 0;
//                }
//
//            }
//        }
//        return text;


