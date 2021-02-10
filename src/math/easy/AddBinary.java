package math.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int lengthOfA = a.length() - 1;
        int lengthOfB = b.length() - 1;
        int remainder = 0;
        StringBuilder result = new StringBuilder();

        while(lengthOfA >= 0 || lengthOfB >= 0){
            int digitA = lengthOfA >= 0 ? Character.digit(a.charAt(lengthOfA),10) : 0;
            int digitB = lengthOfB >= 0 ? Character.digit(b.charAt(lengthOfB), 10) : 0;
            int sum = digitA + digitB + remainder;
            result.append(sum % 2);
            remainder = sum / 2;
            lengthOfA--;
            lengthOfB--;
        }

        if (remainder > 0){
            result.append(remainder);
        }
        return result.reverse().toString();
    }
}
