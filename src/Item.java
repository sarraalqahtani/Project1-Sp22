public class Item {

    // Initialize the private variables of the class
    private String itemName;
    private double itemPrice;

    // Default constructor
    public Item() {
        this.itemName = "UNKNOWN";
        this.itemPrice = 0;
    }

    // Constructor assigning the name and price of an Item
    public Item(String name, double price) {
        this.itemName = name;
        this.itemPrice = price;
    }

    // Assign a specific name to the calling Item (Setter)
    public void setItemName(String name) {
        this.itemName = name;
    }

    // Assign a specific price to the calling Item (Setter)
    public void setItemPrice(Double price) {
        this.itemPrice = 0;
    }

    // Returns the private price of the item (Getter)
    public double getItemPrice() {
        return this.itemPrice;
    }

    // Returns the private name of the Item (Getter)
    public String getItemName() {
        return this.itemName;
    }
}
