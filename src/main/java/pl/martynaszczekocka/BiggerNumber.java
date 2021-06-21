package pl.martynaszczekocka;

import java.util.Arrays;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){



        return -1;
    }

    static void combination(int arr[], int data[], int start, int end, int index, int r){

        if (index == r) {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++){
            data[index] = arr[i];
            combination(arr, data, i+1, end, index+1, r);
        }
    }

    static void numCombination() {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        int data[]=new int[r];

        combination(arr, data, 0, n-1, 0, r);
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
