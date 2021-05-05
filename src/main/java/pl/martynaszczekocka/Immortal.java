package pl.martynaszczekocka;

public class Immortal {
    static boolean debug = true;

    static long elderAge(long n, long m, long k, long newp) {
        long result = 0L;

        for (long i=0; i<n; i++){
            for(long j=0; j<m; j++){
                if (i==j)
                    continue;
                long temp = 0L;
                temp += i^j;
                    result += (i ^ j) - k;
                if (result>=newp)
                    result -= newp;
            }
        }

        return result;
    }
}
