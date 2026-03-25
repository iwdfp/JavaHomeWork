package homework_4.hm_4_2;

public class Bankomat {
    int count20;
    int count50;
    int count100;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void plus(int up20, int up50, int up100) {
        count20 += up20;
        count50 += up50;
        count100 += up100;
        System.out.println("Внесено " + (up20 * 20 + up50 * 50 + up100 * 100) + "р.");
    }

    public boolean minus(int sumMinus) {
        int minMinus = sumMinus; //для корректного вывода информации
        int total = count20 * 20 + count50 * 50 + count100 * 100;
        if (total < sumMinus) {
            System.out.println("Недостаточно средств");
            return false;
        } else {
            int need100 = Math.min(sumMinus / 100, count100);
            sumMinus -= need100 * 100;

            int need50 = Math.min(sumMinus / 50, count50);
            sumMinus -= need50 * 50;

            int need20 = Math.min(sumMinus / 20, count20);
            sumMinus -= need20 * 20;

            if (sumMinus > 0) {
                System.out.println("Недостаточно купюр для выдачи введенной суммы или введена некорректная сумма");
                return false;
            } else {
                count100 -= need100;
                count50 -= need50;
                count20 -= need20; // в данной задачке необязательно, но вообще нужно для актуализации купюр в банкомате после выдачи
                System.out.println("Выдано " + need100 + " купюр по 100, " + need50 + " по 50, " + need20 + " по 20 на общую сумму " + minMinus + "р.");
            }
        }
        return true;
    }
}
