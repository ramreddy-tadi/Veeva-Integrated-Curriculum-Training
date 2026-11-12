import java.util.HashMap;

public class Inventory {

    private HashMap<String, Integer> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(String item, int quantity) {

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        items.put(item, items.getOrDefault(item, 0) + quantity);

        System.out.println(quantity + " " + item + "(s) added successfully.");
    }

    public void removeItem(String item, int quantity) {

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        if (!items.containsKey(item)) {
            System.out.println("Item not found.");
            return;
        }

        int currentQuantity = items.get(item);

        if (quantity > currentQuantity) {
            System.out.println("Insufficient quantity.");
        } else {
            int remaining = currentQuantity - quantity;

            if (remaining == 0) {
                items.remove(item);
            } else {
                items.put(item, remaining);
            }

            System.out.println("Item removed successfully.");
        }
    }

    public void checkQuantity(String item) {

        if (items.containsKey(item)) {
            System.out.println("Available quantity: " + items.get(item));
        } else {
            System.out.println("Item not found.");
        }
    }
}