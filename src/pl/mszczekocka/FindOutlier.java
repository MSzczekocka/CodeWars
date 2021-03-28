package pl.mszczekocka;

public class FindOutlier {
    static int find(int[] integers){
        int result=0, odd = 0, even =0;

        for (int i=0; i<3; i++){
            if(integers[i]%2==0)  odd++;
        }

        if (odd==3 || odd==2){
          for (int i=0; i< integers.length; i++){
              if (Math.abs(integers[i]%2) ==1) result= integers[i];
          }
        }else{
            for (int i=0; i< integers.length; i++){
                if (integers[i]%2 ==0) result= integers[i];
            }
        }
        return result;
    }
}
