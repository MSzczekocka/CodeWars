package pl.martynaszczekocka;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){
        String number = Long.toString(n);
        long result = -1;

        for (int i=0; i< number.length();i++){
            char digit = number.charAt(i);
            for(int j=0; j<number.length(); j++){
                String newNumS = number.substring(0,i) + digit + number.substring(i+1);
                long newNumL = Long.getLong(newNumS);


            }
        }


        return n;
    }


}
