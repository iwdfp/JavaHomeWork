package homework_5;

public class Dentist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Назначен врач: Дантист. Дантист лечит зубы пациенту");
    }
}
