package session6.Encapsulation;

public class Company {

    // Attributes
    private String name;
    private int capacity;

    // Setter Methods
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            System.out.println("Name set to : " + name);
        }else {
            System.out.println("Invalid name. It cannot be null or empty.");
        }
    }

    public void setCapacity(int capacity) {
        if (capacity > 0 && capacity <= 1000) {
            this.capacity = capacity;
            System.out.println("Capacity set to : " + capacity);

        } else {
            System.out.println("Invalid capacity. It must be between 1 and 1000.");
        }
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
