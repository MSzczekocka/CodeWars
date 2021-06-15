package pl.martynaszczekocka;

public class ToSmallest {

    public static long[] smallest(long n){
        String number = Long.toString(n);
        long[] result = new long[3];
        result[0] = n;

        for (int i=0; i<number.length();i++){
            for (int j=0; j<number.length(); j++){
                String digit = number.substring(i,i+1);
                String tempStr = number.substring(0,i) + number.substring(i+1);
                String tempStr2 = tempStr.substring(0,j) + digit + tempStr.substring(j);

                if (Long.parseLong(tempStr2)<result[0]){
                    result[0] = Long.parseLong(tempStr2);
                    result[1] =i;
                    result[2] = j;
                }

            }
        }

        return result;

    }
}
