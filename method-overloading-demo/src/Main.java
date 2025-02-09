import com.kodtodya.practice.overloading.service.InterestCalculation;

public class Main {
    public static void main(String[] args) {
        InterestCalculation interestCalculator = new InterestCalculation();

        System.out.println("Interest for Rs. 1000 : " + interestCalculator.calculate(1000));
        System.out.println("Interest for Rs. 1000 for 5 years: " + interestCalculator.calculate(1000, 5));
        System.out.println("Interest for Rs. 1000 for 10 years & with 5.6% interest rate: " +
                interestCalculator.calculate(1000, 10, 5.6));
    }
}