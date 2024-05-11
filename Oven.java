// Class Oven extending appliances since oven and fridge share some common attributes
public class Oven extends Appliances{
    //Declaring private attributes for oven class
    private boolean hasConvection;

    //Constructor initializing instance variables of this class
    public Oven (double price, int quantity, int wattage, String colour, String brand, boolean hasConvection){
        this.price = price;
        this.stockQuantity = quantity;
        this.wattage = wattage;
        this.colour = colour;
        this.brand = brand;
        this.hasConvection = hasConvection;
    }

    //Sell units method using super from the products class to minimize duplicate code
    public double sellUnits(int amount){
        super.sellUnits(amount);
        return amount;
    }

    //toString to format string output to meet our requirements & returns a string with specifications of oven object
    public String toString() {
        return brand + " Oven " + hasConvection + " (" + colour + ", " + wattage + " watts) (" + price + " dollars each, " + stockQuantity + " in stock, " + soldQuantity + " sold)";
    }
}
