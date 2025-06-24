public class Cat extends Animal {
    private boolean hasLongNails;

    public Cat(String name, int age) {
        super(name, age);
        this.hasLongNails = true;
    }

    @Override
    public void treatAnimal() {
        this.hasLongNails = false;
        this.isClean = true;
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString() + ", Long Nails: " + hasLongNails;
    }
}
