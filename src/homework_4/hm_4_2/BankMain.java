package homework_4.hm_4_2;

public class BankMain {
    public static void main(String[] args) {

        Bankomat Bankomat = new Bankomat(0, 0, 0);
        Bankomat Bankomat2 = new Bankomat(54, 534, 5643);
        Bankomat Bankomat3 = new Bankomat(2, 5, 1);

        Bankomat.plus(17, 82, 23);
        System.out.println(Bankomat.minus(1570));
        System.out.println(); //пробел
        Bankomat2.plus(0, 0, 23);
        System.out.println(Bankomat.minus(165));
        System.out.println(); //пробел
        Bankomat3.plus(0, 0, 0);
        System.out.println(Bankomat.minus(45263426));
    }
}
