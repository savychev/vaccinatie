package shelter;
public class MainApp {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Voeg 10 dieren toe
        shelter.addAnimal(new Cat("Minoes", 4));
        shelter.addAnimal(new Dog("Bello", 6));
        shelter.addAnimal(new Monkey("George", 10));
        shelter.addAnimal(new Cat("Whiskers", 2));
        shelter.addAnimal(new Dog("Rex", 5));
        shelter.addAnimal(new Monkey("Ziggy", 7));
        shelter.addAnimal(new Cat("Luna", 3));
        shelter.addAnimal(new Dog("Max", 8));
        shelter.addAnimal(new Monkey("Koko", 6));
        shelter.addAnimal(new Cat("Snoes", 1));

        // Behandel alle dieren
        shelter.treatAllAnimals();

        // Sorteer op leeftijd
        shelter.sortAnimalsByAge();

        // Toon niet-gevaccineerde dieren tegen waterpokken
        System.out.println("\nNiet gevaccineerd tegen CHICKENPOCKS:");
        shelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);

        // Specifieke behandeling
        shelter.treatAnimal("Bello");

        // Zoek oudste dier
        Animal oudste = shelter.findOldestAnimal();
        System.out.println("\nOudste dier: " + oudste);

        // Aantal dieren
        System.out.println("\nAantal dieren in het asiel: " + shelter.countAnimals());

        // Alle dieren tonen
        System.out.println("\nAlle dieren:");
        shelter.printAnimals();
    }
}
