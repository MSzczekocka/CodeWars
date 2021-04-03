package pl.martynaszczekocka;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length!=10) return null;
        return "(" + numbers[0]+numbers[1]+numbers[2] + ")" + " " + numbers[3]+numbers[4]+numbers[5]+ "-"+ numbers[6]+numbers[7]+numbers[8]+numbers[9];
    }

}
