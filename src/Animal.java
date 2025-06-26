import java.util.EnumMap;
import java.util.Map;

abstract class Animal implements Vaccinateable, Treatable {
    protected int animalNumber; // uniek ID voor elk dier
    protected String name; // naam van het dier
    protected int age; // leeftijd van het dier
    protected boolean isClean; // geeft aan of het dier schoon/behandeld is
    protected Map<Disease, Boolean> isVaccinated; // houdt bij of dier gevaccineerd is tegen elke ziekte (true/false)
    protected static int animalId = 1; // gebruikt om animalNumber automatisch toe te wijzen

    // Lege constructor
    public Animal() {
        this.animalNumber = animalId++;
        this.name = "Unknown";
        this.age = 0;
        this.isClean = false;
        this.isVaccinated = new EnumMap<>(Disease.class); // is een speciale soort Map in Java die alleen gebruikt wordt met enum.
        // We gebruiken het (Disease.class), omdat EnumMap moet weten welk enum-type je als sleutel gebruikt, en dat geef je zo aan.
        for (Disease d : Disease.values()) {
            isVaccinated.put(d, false); // alle
        }
    }

    // Constructor met naam en leeftijd
    public Animal(String name, int age) {
        this.animalNumber = animalId++;
        this.name = name;
        this.age = age;
        this.isClean = false;
        this.isVaccinated = new EnumMap<>(Disease.class); // is een speciale soort Map in Java die alleen gebruikt wordt met enum
        for (Disease d : Disease.values()) {
            isVaccinated.put(d, false);
        }
    }

    // markeert dier als gevaccineerd voor opgegeven ziekte
    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease, true);
    }

    // markeert dier als behandeld (isClean = true) – override in subklassen voor extra gedrag
    @Override
    public void treatAnimal() {
        this.isClean = true;
    }

    // controleert of dier gevaccineerd is voor ziekte
    public boolean isVaccinated(Disease d) {
        return isVaccinated.getOrDefault(d, false);
    }

    // Getters en setters


    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public static int getAnimalId() {
        return animalId;
    }

    public static void setAnimalId(int animalId) {
        Animal.animalId = animalId;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + animalNumber;
    }
}
