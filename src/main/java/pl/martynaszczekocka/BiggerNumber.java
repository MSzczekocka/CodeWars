package pl.martynaszczekocka;

import java.util.Arrays;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){
        char arr[] = String.valueOf(n).toCharArray();
        int x = arr.length;
        char data[]=new char[arr.length];


        if (combination(arr, data, 0, x-1, 0,n)==10*n){
            return -1;
        }else{
            return combination(arr, data, 0, x-1, 0,n);
        }

    }

    static long combination(char arr[], char data[], int start, int end, int index, long n){
        long tempMax = 10*n;
        long temp = 0L;

        if (index == arr.length) {
            temp = Long.getLong(String.valueOf(arr));
            if(temp<tempMax && temp>n){
                tempMax = temp;
            }
        }

        for (int i=start; i<=end && end-i+1 >= arr.length-index; i++){
            data[index] = arr[i];
            combination(arr, data, i+1, end, index+1,n);
        }

        return tempMax;
    }

//    static void numCombination() {
//        char arr[] = String.valueOf(n).toCharArray();
//        int r = arr.length;
//        int n = arr.length;
//        int data[]=new int[r];
//
//        combination(arr, data, 0, n-1, 0, r);
//    }


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
