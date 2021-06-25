package pl.martynaszczekocka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){
        char arr[] = String.valueOf(n).toCharArray();
        int x = arr.length;
        char data[]=new char[arr.length];


        if (combination(arr, data, 0, x-1, 0,n).size()==0){
            return -1;
        }else{
            return combination(arr, data, 0, x-1, 0,n).get(0);
        }

    }

    static List<Long> combination(char arr[], char data[], int start, int end, int index, long n){
        List<Long> results = new ArrayList<>();
        long tempMax = 10*n;
        long temp = 0L;

        if (index == arr.length) {
            temp = Long.getLong(String.valueOf(data));
            if (temp>n){
                results.add(temp);
            }
        }

        for (int i=start; i<=end && end-i+1 >= arr.length-index; i++){
            data[index] = arr[i];
            combination(arr, data, i+1, end, index+1, n);

        }

        Collections.sort(results);

        return results;
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
