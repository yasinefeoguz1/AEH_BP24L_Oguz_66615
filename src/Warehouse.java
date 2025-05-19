public class Warehouse {
    private int warehouseNumber;
    private int totalCapacity;
    private int availableSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    // Constructor
    public Warehouse(int warehouseNumber, int totalCapacity, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.totalCapacity = totalCapacity;
        this.availableSpace = totalCapacity;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    // Getters and setters
    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availableSpace = totalCapacity; // Opsiyonel: kapasite değişirse, boş alan sıfırlanır
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(int availableSpace) {
        this.availableSpace = availableSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    // Methods
    public void addGoods(int amount) {
        if (amount <= availableSpace) {
            availableSpace -= amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + availableSpace + " units.");
        }
    }

    public void removeGoods(int amount) {
        int occupiedSpace = totalCapacity - availableSpace;
        if (amount <= occupiedSpace) {
            availableSpace += amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough goods to remove. Occupied warehouse space: " + occupiedSpace + " units.");
        }
    }

    public void checkOccupancy() {
        int occupiedSpace = totalCapacity - availableSpace;
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + availableSpace + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        this.ownerEmail = newEmail;
        this.ownerPhone = newPhone;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + ownerEmail);
        System.out.println("New phone number: " + ownerPhone);
    }
}
