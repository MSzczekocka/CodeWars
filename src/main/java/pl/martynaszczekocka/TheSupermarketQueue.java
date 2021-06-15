package pl.martynaszczekocka;

public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] checkoutTills = new int[n];

        if (customers.length==1)
            return customers[0];


        if (n> customers.length){
            int result =0;
            for (int customer:customers){
                if (customer>result)
                    result = customer;
            }
            return result;
        }

        if (n==1){
            int result =0;
            for (int customer: customers){
                result =result + customer;
            }
            return result;
        }

        for (int i=0; i< checkoutTills.length;i++){
            checkoutTills[i] = customers[i];
        }

        for (int i=n; i< customers.length;i++){
            int temp =checkoutTills[0];
            int temp2=0;
            for (int j=1; j< checkoutTills.length;j++){
                if(checkoutTills[j]<temp){
                    temp = checkoutTills[j];
                    temp2 =j;
                }
            }
            checkoutTills[temp2] = checkoutTills[temp2] + customers[i];
        }

        int result =0;

        for (int checkoutTill: checkoutTills){
            if (checkoutTill>result){
                result = checkoutTill;
            }
        }

        return result;
    }
}
