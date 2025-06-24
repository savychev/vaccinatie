public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog(String name, int age) {
        super(name, age);
        this.hasFoulBreath = true;
    }

    @Override
    public void treatAnimal() {
        this.hasFoulBreath = false;
        this.isClean = true;
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString() + ", Foul Breath: " + hasFoulBreath;
    }
}
