//Appliance class to join the shared attributes between fridge and oven class
public abstract class Appliances extends Products{
    //Attributes are protected to allow the classes extending this class to use its attributes
    protected int wattage;
    protected String colour;
    protected String brand;
    public void update() {}
}
