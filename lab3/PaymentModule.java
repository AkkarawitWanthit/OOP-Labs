public class PaymentModule {
    private double totalPay;

    public PaymentModule(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void payment(Employee e) {
        double pay = e.computePay();
        if (e instanceof Manager) {
            Manager m = (Manager) e;
            if (m.getWorkYear() > 10) {
                pay *= 2;
            }
        }
        totalPay += pay;
    }
}
