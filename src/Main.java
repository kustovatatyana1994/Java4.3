public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int term = 12; // в месяцах
        int payment = service.calculate(amount, term);
        System.out.println("Размер ежемесячного платежа на 12 месяцев:" + payment);

        amount = 1_000_000;
        term = 24; // в месяцах
        payment = service.calculate(amount, term);
        System.out.println("Размер ежемесячного платежа на 24 месяца:" + payment);

        amount = 1_000_000;
        term = 36; // в месяцах
        payment = service.calculate(amount, term);
        System.out.println("Размер ежемесячного платежа на 36 месяцев:" + payment);
    }
}
