package Abstration;


class Product {
    private int id;
    private String name;
    protected double basePrice;

    public Product(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }

    public double calculateDiscount() {
        return 0.0; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Product product = (Product) obj;
        return this.id == product.id;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Name='" + name + "', Base Price=$" + basePrice + ", Final Price=$" + (basePrice - calculateDiscount()) + "]";
    }
}

class Electronics extends Product {
    public Electronics(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateDiscount() {
        return basePrice * 0.15;
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateDiscount() {
        return basePrice > 10 ? 10.0 : 0.0;
    }
}

class Grocery extends Product {
    public Grocery(int id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateDiscount() {
        return basePrice * 0.05;
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {
        Product[] inventory = new Product[] {
            new Electronics(101, "Laptop", 1200.0),
            new Clothing(102, "Jeans", 60.0),
            new Grocery(103, "Apple Pack", 15.0),
            new Electronics(104, "Smartphone", 800.0)
        };

        System.out.println("--- All Inventory Items ---");
        for (Product p : inventory) {
            System.out.println(p);
        }

        String searchName = "Jeans";
        System.out.println("\n--- Searching for: " + searchName + " ---");
        boolean found = false;
        for (Product p : inventory) {
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Match found: " + p);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Product not found.");

        System.out.println("\n--- Testing equals() Override ---");
        Product itemA = new Electronics(101, "Laptop", 1200.0);
        Product itemB = new Electronics(101, "Refurbished Laptop", 950.0);

        System.out.println("Are itemA and itemB equal? " + itemA.equals(itemB)); 
    }
}
