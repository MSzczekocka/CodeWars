package pl.mszczekocka;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int noN =0, noS = 0, noE=0, noW=0;
        boolean isOk = false;


        if (walk.length!=10) return false;

        for (int i = 0; i< walk.length;i++){
            if (walk[i] == 'n') noN++;
            if (walk[i] == 's') noS++;
            if (walk[i] == 'w') noW++;
            if (walk[i] == 'e') noE++;
        }

        if (noN==noS && noE==noW) isOk = true;
        return isOk;
    }
}
