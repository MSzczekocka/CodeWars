package pl.martynaszczekocka;

public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2){
        int index1 =0, index2 =0;

        for (int i=0; i<s.length();i++){
            if(s.charAt(i)==part1.charAt(index1)){
                if (index1<part1.length()-1)
                    index1++;
            }else if (s.charAt(i)==part2.charAt(index2)){
                if (index2>=part2.length()-1)
                    index2++;
            }else {
                return false;
            }
        }

        return true;
    }
}
