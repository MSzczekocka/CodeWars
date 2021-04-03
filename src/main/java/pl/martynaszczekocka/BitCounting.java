package pl.martynaszczekocka;

public class BitCounting {
    public static int countBits(int n){
        String binaryN = Integer.toBinaryString(n);
        int result = 0;

        for (int i=0; i<binaryN.length();i++){
            char number = binaryN.charAt(i);
            result = result +Character.getNumericValue(number);
        }

        return result;
    }
}
