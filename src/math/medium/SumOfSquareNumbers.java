package math.medium;

public class SumOfSquareNumbers {

    public static void main(String[] args) {
        System.out.println(new SumOfSquareNumbers().judgeSquareSum(4));
    }
    public boolean judgeSquareSum(int c) {
        return bruceForce(c);
    }

    private boolean bruceForce(int c){
        for(int x = 0; x <= Math.ceil(Math.sqrt(c)); x++){
            for (int y = x; y <= Math.ceil(Math.sqrt(c)); y++){
                if (Math.pow(x, 2) + Math.pow(y, 2) == c) return true;
            }
        }
        return false;
    }
}
