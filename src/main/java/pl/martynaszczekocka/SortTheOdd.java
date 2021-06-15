package pl.martynaszczekocka;

import java.util.Arrays;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        int temp =0;

        for(int i=0; i< array.length;i++){
            for (int j=0; j< array.length;j++){
                if(array[i]%2==1&&array[j]%2==1){
                    if(array[i]<array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }

}

