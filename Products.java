public abstract class Products {
    protected double price;
    protected int stockQuantity;
    protected int soldQuantity;
    public double sellUnits(int amount) {
        int revenue = 0;
        if (amount <= stockQuantity) {
            stockQuantity -= amount;
            soldQuantity += amount;
            revenue = (int) (amount * price);
            return revenue;

        }return 0.0;
    }
}
