package pl.martynaszczekocka;

public class Kata2 {
    public static int findEvenIndex(int[] arr) {
        int result = -1;
        int temp1 =0, temp2=0, temp0 =0;

        for (int i= 1; i< arr.length;i++){
            temp0 = temp0 + arr[i];
        }
        if (temp0==0) return 0;

        for (int i = 0; i< arr.length;i++){
            temp1 =0;
            temp2=0;
            for (int j=0; j<i+1;j++){
                temp1=temp1 + arr[j];
            }

            for (int k=i+2; k<arr.length;k++){
                temp2 =temp2 + arr[k];
            }

            if (temp1==temp2){
                if (result==-1){
                    result = i+1;
                } else if (result>i+1){
                    result =i+1;
                }
            }
        }
        return result;
    }
}
