package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        MoneyInterest interest = new MoneyInterest();

        System.out.println(interest.calculateYears(1000, 0.05, 0.18, 1100));
        System.out.println(interest.calculateYears(1000,0.01625,0.18,1200));
        System.out.println(interest.calculateYears(1000,0.05,0.18,1000));

    }
}
