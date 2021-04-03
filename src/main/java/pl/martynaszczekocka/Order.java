package pl.martynaszczekocka;

public class Order {
    public static String order(String words) {
     String[] word = words.split(" ");
     int number =0;
     String temp = "";

     for (int i=1; i<=word.length;i++){
         String nr = String.valueOf(i);
         for (int j=0; j< word.length;j++){
             if (word[j].contains(nr)){
                 temp = word[i-1];
                 word[i-1] = word[j];
                 word[j] = temp;
             }
         }
        }
     return String.join(" ", word);
    }
}
