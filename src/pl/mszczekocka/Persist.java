package pl.mszczekocka;

public class Persist {
    public static int persistence(long n) {
        int result =0;

        while (n>=10){
            String nStr = Long.toString(n);
            char[] digitsChar = nStr.toCharArray();
            int[] digits = new int[digitsChar.length];
            int x =1;

            for (int i= 0; i< digitsChar.length;i++){
            digits[i] = Character.getNumericValue(digitsChar[i]);
            }

            for (int i=0; i<digits.length; i++){
                x =x*digits[i];
            }
            n=x;
            result++;
        }
        return result;
    }

}
