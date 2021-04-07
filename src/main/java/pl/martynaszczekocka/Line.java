package pl.martynaszczekocka;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Line {
    public static String Tickets(int[] peopleInLine){
        Arrays.sort(peopleInLine);
        int oddMoney25 =0, oddMoney50 =0;

        for (int person: peopleInLine){
            if (person == 25) oddMoney25 = oddMoney25 + 1;
            if (person ==50 ){
                if(oddMoney25<1)return "NO";
                oddMoney25 = oddMoney25 -1;
                oddMoney50 = oddMoney50 +1;
            }
            if (person == 100){
                if(oddMoney25<1) return "NO";
                if(oddMoney50<1) {
                    if (oddMoney25 > 2) {
                        oddMoney25 = oddMoney25 - 3;
                    } else {
                        return "NO";
                    }
                }
                    oddMoney50 =oddMoney50-1;
                    oddMoney25 =oddMoney25-1;
            }
        }
    return "YES";
    }
}
