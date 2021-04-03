package pl.martynaszczekocka;

public class DRoot {
    public static int digital_root(int n) {
        String number = String.valueOf(n);
        int result = 0;

        do {
            result = 0;
            char[] digitChar = number.toCharArray();
            int[] digitInt = new int[digitChar.length];
            for (int i = 0; i < digitChar.length; i++) {
                digitInt[i] = Character.getNumericValue(digitChar[i]);
            }

            for (int i = 0; i < digitInt.length; i++) {
                result = result + digitInt[i];
            }
            number = Integer.toString(result);

        }while (result>=10 );

        return result;
    }
}
