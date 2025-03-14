package Chapter8_inheritance.No4_polymorphism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10001);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        Customer customerKim = new VIPCustomer(1002, "김유신", 13432);
        customerKim.bonusPoint = 1000;

        System.out.println(customerKim.showCustomerInfo());
        System.out.println("====== 할인율과 보너스 포인트 계산 ======");

        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);

        System.out.println(customerLee);
    }
}
