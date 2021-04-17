package pl.martynaszczekocka;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String hs, mins, ss;
        int h = seconds/3600;
        int min = (seconds-h*3600)/60;
        int sec = (seconds-h*3600-min*60);

        if (h<10){
            hs = "0"+ h;
        }else{
            hs= String.valueOf(h);
        }

        if (min<10){
            mins = "0"+ min;
        }else{
            mins= String.valueOf(min);
        }

        if (sec<10){
            ss = "0"+ sec;
        }else{
            ss= String.valueOf(sec);
        }

        return String.format("%s:%s:%s", hs, mins,ss);
    }
}
