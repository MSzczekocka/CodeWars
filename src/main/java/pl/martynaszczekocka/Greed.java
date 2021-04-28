package pl.martynaszczekocka;

public class Greed {
    public static int greedy(int[] dice){
        int no1=0, no2=0, no3=0,no4=0,no5=0,no6=0;
        int result =0;

        for (int i=0; i< dice.length; i++){
            switch (dice[i]) {
                case 1:
                    no1++;
                    break;
                case 2:
                    no2++;
                    break;
                case 3:
                    no3++;
                    break;
                case 4:
                    no4++;
                    break;
                case 5:
                    no5++;
                    break;
                case 6:
                    no6++;
                    break;
            }
        }

        while (no1>2){
            result += 1000;
            no1 -= 3;
        }
        while (no2>2){
            result += 200;
            no2 -= 3;
        }
        while (no3>2){
            result += 300;
            no3 -= 3;
        }
        while (no4>2){
            result += 400;
            no4 -= 3;
        }
        while (no5>2){
            result += 500;
            no5 -= 3;
        }
        while (no6>2){
            result += 600;
            no6 -= 3;
        }

        result = result + no1*100;
        result = result + no5*50;

        return result;
    }
}
