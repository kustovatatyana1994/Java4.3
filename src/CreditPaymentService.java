public class CreditPaymentService {
    public int calculate(int amount, int term) {
        double percent = 9.99F;
        double rate = percent / 12 / 100;

        double n = (1 + rate);
        double a = Math.pow(n, term);

        double ratio = (double) ((rate * a) / (a - 1));
        double result = ratio * amount;
        return (int) result;
    }
}

