package pl.mszczekocka;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
            double[] result = new double[n];
            if (n>s.length) n=s.length;
            if (s==null) return null;
            if (s.length==0) return new double[0];

        for (int j =0; j<n; j++) {
            result[j] = s[j];
        }

            for (int i = 3; i < result.length; i++) {
                result[i] = result[i - 3] + result[i - 2] + result[i - 1];
            }

        return result;
    }

}
