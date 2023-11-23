package employees;

// ZooManager.java
public class ZooManager extends Employee {
    public ZooManager(String name) {
        super(name);
    }

    public void announce(String message) {
        System.out.println("Zoo Manager " + getName() + " announces: " + message);
    }
}
