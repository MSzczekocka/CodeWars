package pl.martynaszczekocka;


public class PrimeDecomp {
    public static String factors(int n){
        String pr = "";
        int tempN = n;
        String result = "";

        for (int i=2; i<n; i++){
            if (tempN ==0)
                break;;
            int temp =0;
            boolean isPrime = true;

            for (int j=2; j<i; j++){
                if (i%j==0){
                    isPrime = false;
                }
            }
            if (isPrime){
                while (tempN%i==0 && tempN!=0){
                    tempN /= i;
                    temp +=1;
                }

                if (temp== 0){
                    result += "("+ i+")";
                }else{
                    result += "("+ i+ "**"+ temp +")";
                }

            }
        }

        return result;
    }
}


