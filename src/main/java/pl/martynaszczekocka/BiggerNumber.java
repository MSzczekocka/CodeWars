package pl.martynaszczekocka;

public class BiggerNumber {

    public static long nextBiggerNumber(long n){
        // zrobić na liśt?
        String number = Long.toString(n);
        char temp = 'x';
        long tempNum = n*10;
        long newNumL = 0L;
        String newNumS = "";

        for (int i=0; i< number.length();i++){
            for(int j=0; j<number.length(); j++){
                char[] digits = number.toCharArray();
                temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
                newNumS = String.valueOf(digits);
                newNumL = Long.parseLong(newNumS);

                if (newNumL>n && tempNum>newNumL){
                    tempNum = newNumL;
                }

            }
        }

        if (tempNum == n*10)
            return -1;

        return tempNum;
    }

}
