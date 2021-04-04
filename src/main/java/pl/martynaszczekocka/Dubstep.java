package pl.martynaszczekocka;

public class Dubstep {
    public static String SongDecoder (String song) {
        String[] words = song.split("WUB");
        int size =0;
        int x =0;

        for (int i = 0; i<words.length;i++){
            if (!words[i].equals("")) size++;
        }

        String[] result = new String[size];

        for (int i =0; i< words.length;i++){
            if (!words[i].equals("")) {
                result[x] = words[i];
                x++;
            }
        }

        return String.join(" ",result);
    }
}
