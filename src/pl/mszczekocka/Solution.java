package pl.mszczekocka;

public class Solution {
    public static String whoLikesIt(String... names) {
        String result = new String("");
        int others = names.length-2;

        switch (names.length){
            case 0:
               result= "no one likes this";
               break;
            case 1:
                result = names[0] + " likes this";
                break;
            case 2:
                result = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                result = names[0] + ", "+names[1]+ " and " + names[2] + " like this";
                break;
            default:
                result = names[0] + ", " + names[1] + " and " + others + " others like this";
        }

        return result ;
    }
}
