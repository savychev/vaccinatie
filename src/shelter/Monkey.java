package shelter;
public class Monkey extends Animal {
    private boolean isHyperActive;

    public Monkey(String name, int age) {
        super(name, age);
        this.isHyperActive = true;
    }

    @Override
    public void treatAnimal() {
        this.isHyperActive = false;
        this.isClean = true;
    }

    @Override
    public String toString() {
        return "Monkey: " + super.toString() + ", Hyperactive: " + isHyperActive;
    }
}
