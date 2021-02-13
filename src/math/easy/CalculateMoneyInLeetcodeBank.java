package math.easy;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        if(n == 0) return 0;

        int totalFullWeeks = n / 7;
        int leftOverDays = n % 7;

        int totalMoney = 0;
        int week = 0;
        while(week < totalFullWeeks){
            totalMoney += (week + 7) * (week + 8) /  2 - week * (week + 1) / 2;
            week++;
        }

        totalMoney += (leftOverDays > 0 ) ? (week + leftOverDays) * (week + leftOverDays + 1) / 2 - week * (week + 1) / 2 : 0;
        return totalMoney;
    }
}
