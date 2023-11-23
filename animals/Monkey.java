package animals;

public class Monkey extends Animal {

    public Monkey(String name, String[] favoriteFoods) {
        super(name, favoriteFoods);
        this.type = "Monkey";
    }

    @Override
    public void makeSound() {
        System.out.println("Ooh ooh ah ah!");
    }

    @Override
    public void performTrick() {
        System.out.println("Performs somersault");
    }
}
