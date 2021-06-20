package pl.martynaszczekocka;

import java.util.Arrays;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){
        char[] digitsN = String.valueOf(n).toCharArray();
        char[] temp = digitsN;




        return -1;
    }

}

//    long result = -1L;
//    char[] digitsN = String.valueOf(n).toCharArray();
//        Arrays.sort(digitsN);
//                String digitsS = String.valueOf(digitsN);
//
//                for (long i = n+1; i <n*10; i++){
//        char[] digitsN2 = String.valueOf(i).toCharArray();
//        Arrays.sort(digitsN2);
//        String digitsS2 = String.valueOf(digitsN2);
//
//        if (digitsS.equals(digitsS2)){
//        return i;
//        }
//
//        }
