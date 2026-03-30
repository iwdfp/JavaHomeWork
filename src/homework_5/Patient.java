package homework_5;

public class Patient {
    int planHeal;
    Doctor doctor;

    public Patient(int planHeal) {
        this.planHeal = planHeal;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
