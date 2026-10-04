public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(0);

        pm.payment(new Fulltimer("Somchai", 30000));
        System.out.println("After Fulltimer: " + pm.getTotalPay());

        pm.payment(new Hourly("Malee", 200, 50));
        System.out.println("After Hourly: " + pm.getTotalPay());

        pm.payment(new Manager("Anan", 50000, 5));
        System.out.println("After Manager (5 yrs): " + pm.getTotalPay());

        pm.payment(new Manager("Preecha", 50000, 12));
        System.out.println("After Manager (12 yrs): " + pm.getTotalPay());

        pm.payment(new Employee());
        System.out.println("After Employee: " + pm.getTotalPay());
    }
}
