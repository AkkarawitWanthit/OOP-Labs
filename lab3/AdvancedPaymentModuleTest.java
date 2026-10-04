public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule apm = new AdvancedPaymentModule(0);

        apm.payment(new Hourly("Malee", 200, 50));
        System.out.println("Single payment: " + apm.getTotalPay());

        Employee[] list = {
            new Fulltimer("Somchai", 30000),
            new Hourly("Malee", 200, 50),
            new Manager("Anan", 50000, 5),
            new Manager("Preecha", 50000, 12)
        };
        apm.payment(list);
        System.out.println("After array payment: " + apm.getTotalPay());
    }
}
