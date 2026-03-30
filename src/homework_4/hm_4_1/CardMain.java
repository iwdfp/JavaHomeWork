package homework_4.hm_4_1;

public class CardMain {
    public static void main(String[] args) {
        CreditCard CreditCard1 = new CreditCard(1700, 1000);
        CreditCard CreditCard2 = new CreditCard(9300, 7500);
        CreditCard CreditCard3 = new CreditCard(5400, 85120);

        CreditCard1.plus(500);
        CreditCard2.plus(7000);
        CreditCard3.minus(500000);

        CreditCard1.print();
        CreditCard2.print();
        if (CreditCard3.cardSum < 0) {
            System.out.println("На карте " + CreditCard3.cardNumber + " Недостаточно средств");
        } else {
            CreditCard3.print();
        }
    }
}
