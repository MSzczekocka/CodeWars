package pl.martynaszczekocka;

import java.util.Arrays;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);

        return arr[0]!=arr[1]? arr[0]: arr[arr.length-1];
    }
}
