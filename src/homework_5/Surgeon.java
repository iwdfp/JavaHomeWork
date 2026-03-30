package homework_5;

public class Surgeon extends Doctor {

    @Override
    public void heal() {
        System.out.println("Назначен врач: Хирург. Хирург делает операцию пациенту");
    }
}
