package pl.mszczekocka;

import java.util.Locale;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String text2 = text.toLowerCase();
        int result =0;

        for (int i= 0; i< text2.length(); i++){
           char chars =  text2.charAt(i);
           if (text2.indexOf(chars) != text2.lastIndexOf(chars) && chars !=' '){
               result ++;
               text2 =text2.replace(chars,' ');
           }
        }
        return result ;
    }
}
