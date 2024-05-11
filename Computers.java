//Computers class to join the shared attributes between desktops and laptops class
public abstract class Computers extends Products{
    //Attributes are protected to allow the classes extending this class to use its attributes
    protected double cpuSpeed;
    protected int ram;
    protected boolean isSSD;
    protected int storage;
    public void update() {}
}
