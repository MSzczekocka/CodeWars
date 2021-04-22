package pl.martynaszczekocka;

public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.split(" ");
        int[] points = new int[words.length];
        int a=0, b=0, c=0;
        int temp =0, result=0;

        for (int i=0; i< words.length;i++){
            char[] let = words[i].toCharArray();
            a=0;
            b=0;
            c=0;
            for (int j=0; j< let.length; j++){
                if(let[j]=='a'){
                    a = a + 1;
                }else if (let[j]=='b'){
                    b=b+2;
                }else if (let[j]=='c'){
                    c=c+3;
                }
            }
            points[i] = a+b+c;
        }

        for (int i=0; i< words.length;i++){
            if (points[i]>temp){
                temp = points[i];
                result=i;
            }

        }

        return words[result];
    }
}
