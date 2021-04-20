package pl.martynaszczekocka;

import java.util.ArrayList;
import java.util.List;

public class WeightSort {
    public static String orderWeight(String strng) {
        String[] wordsTemp = strng.split(" ");
        List<String> wordsL = new ArrayList<>();

        for (String wordTemp: wordsTemp){
            if(!wordTemp.equals("")){
                wordsL.add(wordTemp);
            }
        }

        String[] words = new String[wordsL.size()];
        wordsL.toArray(words);
        Integer[] numbers = new Integer[wordsL.size()];

        for (int i=0; i< words.length;i++){
            int temp1 =0;
            char[] temp = words[i].toCharArray();
            Integer[] digits = new Integer[temp.length];
            for (char t: temp){
               temp1 = temp1 + Character.getNumericValue(t);
            }
            numbers[i] = temp1;
        }

        for (int j=0; j< numbers.length; j++){
            int temp=0;
            String temp2="";
            for (int k=0; k< numbers.length;k++){
                if(numbers[j]<numbers[k]) {
                    temp = numbers[k];
                    numbers[k] = numbers[j];
                    numbers[j] = temp;
                    temp2 = words[k];
                    words[k] = words[j];
                    words[j] = temp2;
                }if (numbers[j].equals(numbers[k])){
                    if (words[j].compareTo(words[k])<0){
                        temp = numbers[k];
                        numbers[k] = numbers[j];
                        numbers[j] = temp;
                        temp2 = words[k];
                        words[k] = words[j];
                        words[j] = temp2;
                    }
                }
            }
        }

        return String.join(" ",words);
    }
}
