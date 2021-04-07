package pl.martynaszczekocka;

public class ValidParentheses {
    public static boolean validParentheses(String parens){
        char[] letters = parens.toCharArray();
        int x=0;

            if (parens.indexOf('(')==-1&&parens.indexOf(')')==-1) return true;

            for (char letter: letters){
            if (letter == '(') x++;
            if (letter == ')'){
                if (x<1) return false;
                x--;
            }
            }

        return x == 0;
    }

}
