package pl.martynaszczekocka;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){
        String number = Long.toString(n);
        long tempNum = n*10;
        long newNumL = 0L;
        String newNumS = "";

        for (int i=0; i< number.length();i++){
            char digit = number.charAt(i);
            String tempN = number.substring(0,i) +number.substring(i+1);
            for(int j=0; j<number.length(); j++){
                newNumS = tempN.substring(0,j) + digit + tempN.substring(j+1);
                newNumL = Long.parseLong(newNumS);

                if (newNumL==n+1){
                    return n+1;
                } else if (newNumL>n && tempNum>newNumL){
                    tempNum = newNumL;
                }

            }
        }

        if (tempNum == n*10)
            return -1;

        return tempNum;
    }


}
