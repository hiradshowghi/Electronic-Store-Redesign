// Class Desktop extending computers since desktops and laptops share some common attributes
public class Desktop extends Computers{
    //Declaring private attributes for Desktops class
    private String profile;

    //Constructor initializing instance variables of this class
    public Desktop(double price, int quantity, double cpuSpeed, int ram, boolean isSSD, int storage, String profile) {
        this.price = price;
        this.stockQuantity = quantity;
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.storage = storage;
        this.isSSD = isSSD;
        this.profile = profile;
    }

    //Sell units method using super from the products class to minimize duplicate code
    public double sellUnits(int amount){
        super.sellUnits(amount);
        return amount;
    }
    //toString to format string output to meet our requirements & returns a string with specifications of Desktop object
    public String toString() {
        return profile + " Desktop PC with " + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + (isSSD ? "SSD" : "HHD") + " drive. (" + price + " dollars each, " + stockQuantity + " in stock, " + soldQuantity + " sold)";
        }
}









