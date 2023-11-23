package animals;

// Animal.java
public abstract class Animal {
    private String name;
    protected String type;
    private String[] favoriteFoods;

    public Animal(String name, String[] favoriteFoods) {
        this.name = name;
        this.favoriteFoods = favoriteFoods;
    }

    public abstract void makeSound();

    public void performTrick() {
        System.out.println("No trick available");
    };

    public void feed() {
        System.out.println("Feeding " + name + " with " + favoriteFoods[0]);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void exercise() {
        System.out.println("No exercise available");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String[] getFavoriteFoods() {
        return favoriteFoods;
    }
}
