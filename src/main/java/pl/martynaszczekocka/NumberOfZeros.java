package pl.martynaszczekocka;

import java.util.List;

public class NumberOfZeros {
    public static int zeros(int n) {
        int[] numbers = new int[n];
        int result =0;
        int podz2 =0, podz5=0;

        for (int i=1; i<n+1; i++){
            numbers[i-1] = i;
        }

        for (int number: numbers){
            if(number%10==0){
                result++;
            }else if(number%2==0) {
                podz2++;
            }else if(number%5==0) {
                podz5++;
            }
        }

        if(podz2==podz5){
            result = result + podz2;
        }else if(podz2>podz5){
            result += podz5;
        }else {
            result += podz2;
        }


        return result;
    }
}
