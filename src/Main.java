public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println(monthlyPayment);

        System.out.println(service.calculate(1000000, 9.99, 24));

        System.out.println(service.calculate(1000000, 9.99, 36));
    }
}