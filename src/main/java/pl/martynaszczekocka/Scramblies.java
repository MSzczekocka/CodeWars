package pl.martynaszczekocka;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        char[] str1l = str1.toCharArray();
        char[] str2l = str2.toCharArray();

        for (int i =0; i<str2.length();i++){
            for (int j=0; j< str1l.length;j++){
                if (str2l[i]==str1l[j]){
                    str2l[i] = '0';
                    str1l[j] = '0';
                    break;
                }
            }
        }

        for (int i =0; i<str2.length();i++){
            if (str2l[i]!='0')
                return false;
        }
        return true;
    }
}
