package animals;

public class Elephant extends Animal {

    public Elephant(String name, String[] favoriteFoods) {
        super(name, favoriteFoods);
        this.type = "Elephant";
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    @Override
    public void exercise() {
        System.out.println("Elephant is lifting weights");
    }
}
