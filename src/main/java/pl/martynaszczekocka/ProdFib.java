package pl.martynaszczekocka;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] fibNums = new long[100];
        long[] result = new long[3];
        fibNums[0]=0;
        fibNums[1]=1;

        for (int i=2;i<fibNums.length;i++){
            fibNums[i] = fibNums[i-1]+fibNums[i-2];
        }

        for(int i=1; i< fibNums.length;i++){
            if(fibNums[i]*fibNums[i-1]==prod){
                result[0]=fibNums[i-1];
                result[1]=fibNums[i];
                result[2]=1;
                break;
            }
            if(fibNums[i]*fibNums[i-1]>prod){
                result[0]=fibNums[i-1];
                result[1]=fibNums[i];
                result[2]=0;
                break;
            }
        }

        return result;
    }
}
