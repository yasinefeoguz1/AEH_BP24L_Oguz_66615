public class myNinthApp {
    public static void main(String[] args) {
        // Create a new Warehouse object
        Warehouse myWarehouse = new Warehouse(
                1, 5000, "Emily Carter", "emily.carter@example.com", "+1 555 123 4567"
        );

        // Add goods
        myWarehouse.addGoods(3000);  // Remaining space: 2000
        myWarehouse.removeGoods(1000); // Remaining space: 3000
        myWarehouse.addGoods(2500); // Remaining space: 500

        // Check occupancy
        myWarehouse.checkOccupancy();

        // Update owner's contact info
        myWarehouse.updateContact("emily@warehouse.com", "+1 555 987 6543");

        // Try to add more goods than available space
        myWarehouse.addGoods(1000); // Should print an error message
    }
}
