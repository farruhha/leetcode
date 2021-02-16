package math.easy;

public class PrimeArrangement {
    public int numPrimeArrangements(int n) {
        int increment = 1;
        int prime = 0;
        while(increment <= n){
            if(isPrime(increment)) prime++;
            increment++;
        }

        int result = 0;
        System.out.println(result);
        return result;
    }


    private boolean isPrime(int n){
        int increment = 2;
        while(increment < n){
            if(n % increment == 0) return false;
            increment++;
        }

        return true;
    }

    private long factorial(int n){
        int product = 1;

        while(n > 0){
            product *=n;
            --n;
        }

        return product;
    }
}
