package pl.martynaszczekocka;

public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.split(" ");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int temp2 =0;
        String result = "";

        for (int i=0; i< words.length; i++){
            int temp=0;
            char[] letters = words[i].toCharArray();
            for (char letter: letters){
                temp = temp + alphabet.indexOf(letter)+1;
            }
            if (temp>temp2){
                temp2 = temp;
                result = words[i];
            }
        }

        return result;
    }
}
