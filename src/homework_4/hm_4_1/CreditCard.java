package homework_4.hm_4_1;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

public class CreditCard {
    int cardNumber;
    int cardSum;

    public CreditCard(int cardNumber, int cardSum) {
        this.cardNumber = cardNumber;
        this.cardSum = cardSum;
    }

    public void plus(int up){
        cardSum = cardSum + up;
    }

    public void minus(int down){
        cardSum = cardSum - down;
    }

    public void print() {
        System.out.println("Баланс карты с номером " + cardNumber + " = " + cardSum);
    }
}
