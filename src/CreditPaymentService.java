public class CreditPaymentService {
    public int calculate(double creditAmount, double interestRate, double termMonths) {
        double monthlyRate = interestRate / 12 / 100;
        double result = creditAmount * ((monthlyRate * Math.pow((1 + monthlyRate), termMonths)) / (Math.pow((1 + monthlyRate), termMonths) - 1));
        return (int) result;
    }
}
