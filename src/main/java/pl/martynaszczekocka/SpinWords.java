package pl.martynaszczekocka;

public class SpinWords {
    public String spinWords(String sentence) {
       String[]words = sentence.split(" ");

       for (int i=0; i< words.length;i++){
           words[i] = words[i].length()<=4 ? words[i] : spinning(words[i]);
       }

       String newString = words[0];

       for (int i=1; i< words.length; i++){
           newString =newString + " " + words[i];
       }
      return newString;
    }

    public String spinning(String word){
    char[] arr = word.toCharArray();
    char temp = ' ';

    for (int i=0; i< arr.length/2;i++){
        temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i]= temp;
    }

    return String.valueOf(arr);
    }
}
