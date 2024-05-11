// Class Laptop extending computers since laptops and desktops share some common attributes
public class Laptop extends Computers{
    //Declaring private attributes for Laptops class
    private double screenSize;

    //Constructor initializing instance variables of this class
    public Laptop (double price, int quantity, double cpuSpeed, int ram, boolean isSSD, int storage, double screenSize){
        this.price = price;
        this.stockQuantity = quantity;
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.isSSD = isSSD;
        this.storage = storage;
        this.screenSize = screenSize;
    }
    //Sell units method using super from the products class to minimize duplicate code
    public double sellUnits(int amount){
        super.sellUnits(amount);
        return amount;
    }
    //toString to format string output to meet our requirements & returns a string with specifications of Laptops object
    public String toString() {
        return screenSize + " Inch Laptop PC with " + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + (isSSD ? "SSD" : "HHD") + " drive. (" + price + " dollars each, " + stockQuantity + " in stock, " + soldQuantity + " sold)";
    }
}
