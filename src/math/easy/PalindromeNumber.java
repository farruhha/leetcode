package math.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String n = String.valueOf(x);
        int start = 0;
        int end = n.length() - 1;

        while(start <= end){
            if(n.charAt(start) != n.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
