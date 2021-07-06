package pl.martynaszczekocka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggerNumber {

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];

        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);
    }
}

}

//
//    public static long nextBiggerNumber(long n){
//        char arr[] = String.valueOf(n).toCharArray();
//        int x = arr.length;
//        char data[]=new char[arr.length];
//
//
//        if (combination(arr, data, 0, x-1, 0,n).size()==0){
//            return -1;
//        }else{
//            return combination(arr, data, 0, x-1, 0,n).get(0);
//        }
//
//    }
//
//    static List<Long> combination(char arr[], char data[], int start, int end, int index, long n){
//        List<Long> results = new ArrayList<>();
//        long tempMax = 10*n;
//        long temp = 0L;
//
//        if (index == arr.length) {
//            temp = Long.getLong(String.valueOf(data));
//            if (temp>n){
//                results.add(temp);
//            }
//        }
//
//        for (int i=start; i<=end && end-i+1 >= arr.length-index; i++){
//            data[index] = arr[i];
//            combination(arr, data, i+1, end, index+1, n);
//
//        }
//
//        Collections.sort(results);
//
//        return results;
//    }
