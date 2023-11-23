package animals;

public class Lion extends Animal {

    public Lion(String name, String[] favoriteFoods) {
        super(name, favoriteFoods);
        this.type = "Lion";
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

}
