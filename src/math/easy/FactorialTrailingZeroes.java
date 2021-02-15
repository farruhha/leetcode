package math.easy;

import java.math.BigInteger;

public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int increment = 1;
        BigInteger product = new BigInteger("1");
        while(increment <=n){
            product.multiply(new BigInteger(String.valueOf(increment)));
            increment++;
        }

        System.out.println(product);
        int result = 0;

        while(product.intValue() > 0){
            if(product.mod(BigInteger.TEN).equals("0")) return result;
            ++result;
            product.divide(BigInteger.TEN);
        }

        return result;
    }

}
