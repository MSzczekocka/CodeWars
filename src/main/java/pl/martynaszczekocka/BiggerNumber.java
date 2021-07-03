package pl.martynaszczekocka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggerNumber {

    public static void main (String[] args) {

        private void helper(List<int[]>, combinations, int data[], int start, int end, int index) {
            if (index == data.length) {
                int[] combination = data.clone();
                combinations.add(combination);
            } else if (start <= end) {
                data[index] = start;
                helper(combinations, data, start + 1, end, index + 1);
                helper(combinations, data, start + 1, end, index);

            }
        }

        public List<int[]> generate(int n, int r) {
            List<int[]> combinations = new ArrayList<>();
            helper(combinations, new int[r], 0, n-1, 0);
            return combinations;
        }

        List<int[]> combinations = generate(N, R);
        for (int[] combination : combinations) {
            System.out.println(Arrays.toString(combination));fd
        }

        System.out.printf("generated %d combinations of %d items from %d ", combinations.size(), R, N);


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
