package health;

public class Medication {
    private String name;
    private int price;
    private boolean availability;

    public String getName() {
        return name;
    }

    public Medication(String name, int price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Medication{" + "name='" + name + '\'' + ", price=" + price + ", availability=" + availability + '}';
    }

    public boolean isAvailability() {
        return availability;
    }
}
