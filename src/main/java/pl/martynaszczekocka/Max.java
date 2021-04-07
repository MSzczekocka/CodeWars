package pl.martynaszczekocka;

public class Max {
    public static int sequence(int[] arr){
        int[] maxSums = new int[arr.length];
        int temp=0, temp1=0, sum =0, maxSum=0;
        boolean areAllNegative = true;

        if (arr.length==0) return 0;

        for (int l=0;l<arr.length; l++){
            if (arr[l]>=0){
                areAllNegative = false;
                break;
            }
        }

        if (areAllNegative) return 0;

        for (int k=0; k<arr.length;k++) {
            for (int j = 0; j < arr.length; j++) {
                sum=0;
                for (int i = k; i < arr.length - j; i++) {
                    sum = sum + arr[i];
                }
                if (sum > maxSum) maxSum = sum;
            }
        }

        return maxSum;
    }
}


