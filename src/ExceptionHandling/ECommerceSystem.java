package ExceptionHandling;
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Order {
    private int availableStock = 5;

    public void placeOrder(int requestedQuantity) throws OutOfStockException {
        System.out.println("Available Stock: " + availableStock);
        System.out.println("Requested Quantity: " + requestedQuantity);
        System.out.println("-----------------------------------");

        if (requestedQuantity > availableStock) {
            throw new OutOfStockException("Product Out of Stock");
        }

        availableStock -= requestedQuantity;
        System.out.println("Order placed successfully! Remaining Stock: " + availableStock);
    }
}

public class ECommerceSystem {
    static void main(String[] args) {
        Order order = new Order();
        int requestedQuantity = 8;
        try {
            order.placeOrder(requestedQuantity);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}

