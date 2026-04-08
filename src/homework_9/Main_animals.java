package homework_9;

public class Main_animals {
    public static void main(String[] args) {

        Animals animals = new Animals();
        animals.addAnimal("Слон");
        animals.addAnimal("Тигр");
        animals.removeAnimal();
        System.out.println(animals.animals);

        animals.addAnimal("Кошка");
        animals.addAnimal("Собака");
        System.out.println(animals.animals);

        animals.addAnimal("Жираф");
        animals.addAnimal("Бегемот");
        System.out.println(animals.animals);

        animals.removeAnimal();
        animals.removeAnimal();
        animals.removeAnimal();
        System.out.println(animals.animals);

        animals.addAnimal("Свинья");
        animals.addAnimal("Леопард");
        animals.removeAnimal();
        System.out.println(animals.animals);
    }
}
