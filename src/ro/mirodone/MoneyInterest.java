package ro.mirodone;

public class MoneyInterest {

    int calculateYears(double principal, double interest, double tax, double desired) {

        int years = 0;
        double money = principal;


       while (desired > money) {
           years++;
           money = money + (money * interest - (money * interest * tax));
        }

        return years;
    }


}
