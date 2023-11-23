package employees;
// Zookeeper.java

import animals.Animal;

public abstract class Zookeeper extends Employee {
    
    public Zookeeper(String name) {
        super(name);
    }

    public void feedAnimal(Animal animal) {
        System.out.println(getName() + " is feeding " + animal.getName());
    }

    public void cleanCage(Animal animal) {
        System.out.println(getName() + " is cleaning " + animal.getType() + "'s cage");
    }
}
