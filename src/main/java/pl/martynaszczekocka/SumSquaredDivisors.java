package pl.martynaszczekocka;

import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        List<String> res = new ArrayList<>();

        for (long i=m; i<n+1;i++){
            long temp= 0;

            for(long j=1; j<i+1;j++){
                if(i%j==0){
                    temp= temp + j*j;
                }
            }

            if(Math.sqrt(temp)%1==0){
                res.add("[" +i+ ", " + temp+ "]");
            }
        }


        return "["+ String.join(", ",res) + "]";
    }
}
