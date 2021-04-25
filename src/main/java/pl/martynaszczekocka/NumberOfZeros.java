package pl.martynaszczekocka;

import java.util.List;

public class NumberOfZeros {
    public static int zeros(int n) {
        int result =0;
        int podz2 =0, podz5=0;

        for (int i=1; i<n+1; i++){
            if(i%10==0){
                int temp=i;
                while (temp>9) {
                    temp = temp/10;
                    result++;
                }
            }else if(i%2==0) {
                podz2 ++;
            }else if(i%5==0) {
                podz5 ++;
            }
        }

        if(podz2==podz5){
            result = result + podz2;
        }else if(podz2>podz5){
            result += podz5;
        }else{
            result += podz2;
        }

        return result;
    }
}
