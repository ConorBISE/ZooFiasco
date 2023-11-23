package employees;

import animals.Animal;

public class SeniorZookeeper extends Zookeeper {
    public SeniorZookeeper(String name) {
        super(name);
    }

    public void giveMedicine(Animal animal) {
        System.out.println(getName() + " is giving medicine to " + animal.getType());
    }
}
