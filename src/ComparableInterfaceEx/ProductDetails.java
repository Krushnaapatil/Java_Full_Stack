package ComparableInterfaceEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {
    int id;
    int price;
    String name;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", stock=" + stock +
                '}';
    }

    int rating;
    int stock;

    public Product(int id, String name, int price, int rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }


    @Override
    public int compareTo(Product that) {
        return this.price>that.price?1:-1;
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        List<Product> pro = new ArrayList<>();

        pro.add(new Product(2,"Aalu", 20, 4, 40000));
        pro.add(new Product(1,"baigan", 60, 3, 2000));
        pro.add(new Product(4,"onion", 50, 5, 50000));
        pro.add(new Product(3,"rasun", 25, 4, 10000));


        Collections.sort(pro);

        System.out.println("--- Sorted by Price (Natural Order) ---");
        for (Product e : pro) {
            System.out.println(e);
        }

        Comparator<Product> idComparator = (e1, e2) -> Integer.compare(e1.id, e2.id);
        Collections.sort(pro, idComparator);

        System.out.println("\n--- Re-sorted by ID (Using Comparator) ---");
        for (Product e : pro) {
            System.out.println(e);
        }
    }
}
