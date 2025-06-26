package shelter;
import java.util.*;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>(); // lijst met alle dieren
    // private int animalId = 1; // volgens opdracht moet er hier staan, maar ik deze in constructor van Animals heb realiseren

    // voegt dier toe en wijst uniek diernummer toe via animalId++
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // retourneert het aantal dieren in de shelter
    public int countAnimals() {
        return animals.size();
    }

    // sorteert dieren op diernummer (natuurlijke volgorde)
    public void sortAnimals() {
        animals.sort(Comparator.comparingInt(Animal::getAnimalNumber));
    }

    // sorteert dieren alfabetisch op naam
    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    // sorteert dieren op oplopende leeftijd
    public void sortAnimalsByAge() {
        animals.sort(Comparator.comparingInt(Animal::getAge));
    }

    // toont alle dieren in de shelter
    public void printAnimals() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    // print dieren die niet gevaccineerd zijn voor de opgegeven ziekte
    public void printAnimalsNotVaccinated(Disease disease) {
        for (Animal a : animals) {
            if (!a.isVaccinated(disease)) {
                System.out.println(a);
            }
        }
    }

    // zoekt dier met opgegeven diernummer
    public Animal findAnimal(int number) {
        for (Animal a : animals) {
            if (a.getAnimalNumber() == number) {
                return a;
            }
        }
        return null;
    }

    // zoekt dier op naam
    public Animal findAnimal(String name) {
        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }

    // behandelt dier met gegeven diernummer
    public void treatAnimal(int number) {
        Animal a = findAnimal(number);
        if (a != null) {
            a.treatAnimal();
        }
    }

    // behandelt dier met gegeven naam
    public void treatAnimal(String name) {
        Animal a = findAnimal(name);
        if (a != null) {
            a.treatAnimal();
        }
    }

    // behandelt alle dieren in de shelter
    public void treatAllAnimals() {
        for (Animal a : animals) {
            a.treatAnimal();
        }
    }

    // retourneert het oudste dier in de shelter
    public Animal findOldestAnimal() {
        if (animals.isEmpty()) return null;

        Animal oldest = animals.get(0);
        for (Animal a : animals) {
            if (a.getAge() > oldest.getAge()) {
                oldest = a;
            }
        }
        return oldest;
    }
}
