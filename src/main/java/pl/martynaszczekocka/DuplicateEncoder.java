package pl.martynaszczekocka;

public class DuplicateEncoder {
    static String encode(String word){
        word= word.toLowerCase();
        char[] chars = word.toCharArray();
        int[] noChars = new int[chars.length];
        int no =0;

        for (int i = 0; i< chars.length;i++){
            no =0;
            for (int j=0; j< noChars.length;j++){
                if (chars[i]==chars[j]){
                    no++;
                }
            }
            noChars[i]=no;
        }

        for (int i=0;i< noChars.length; i++){
            if (noChars[i]==1){
               chars[i] = '(';
            }else{
                chars[i] = ')';
            }
        }
        return String.copyValueOf(chars);
    }
}
