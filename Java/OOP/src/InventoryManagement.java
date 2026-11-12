import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        while (true) {

            System.out.println("\n===== INVENTORY MANAGEMENT =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Check Quantity");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter item name: ");
                    String addItem = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int addQuantity = sc.nextInt();

                    inventory.addItem(addItem, addQuantity);
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    String removeItem = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int removeQuantity = sc.nextInt();

                    inventory.removeItem(removeItem, removeQuantity);
                    break;

                case 3:
                    System.out.print("Enter item name: ");
                    String checkItem = sc.nextLine();

                    inventory.checkQuantity(checkItem);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}