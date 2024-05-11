// Class fridge extending appliances since fridge and oven share some common attributes
public class Fridge extends Appliances{
    //Declaring private attributes for fridge class
    private boolean hasFreezer;

    //Constructor initializing instance variables of this class
    public Fridge (double price, int quantity, int wattage, String colour, String brand, boolean freezer){
        this.price = price;
        this.stockQuantity = quantity;
        this.wattage = wattage;
        this.colour = colour;
        this.brand = brand;
        this.hasFreezer = freezer;
    }
    //Sell units method using super from the products class to minimize duplicate code
    public double sellUnits(int amount){
        super.sellUnits(amount);
        return amount;
    }
    //toString to format string output to meet our requirements & returns a string with specifications of fridge object
    public String toString() {
        return brand + " Fridge " + hasFreezer + " (" + colour + ", " + wattage + " watts) (" + price + " dollars each, " + stockQuantity + " in stock, " + soldQuantity + " sold)";
    }
    }


