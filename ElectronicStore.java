//Importing scanner for user input
import java.util.Scanner;
public class ElectronicStore {
    //Declaring private class variables for ElectronicStore and storing array of electronic products the size of MAX_PRODUCTS
    private final int MAX_PRODUCTS = 10;
    private String name;
    private double revenue = 0;
    private Products[] products = new Products[MAX_PRODUCTS];

    //Constructor initializing instance variables of this class
    public ElectronicStore (String name){
        this.name = name;
    }
    //getName method to get name of the specific store when needed
    public String getName(){
        return name;
    }
    //addProduct method which uses a for loop to see if there is space in the array and allows you to add products while i < MAX_PRODUCTS returning true and returns false if no space
    public boolean addProduct(Products p){
         for (int i = 0; i < MAX_PRODUCTS; i++){
             if (products[i] == null){
                 products[i] = p;
                 return true;
             }
         }return false;
    }

    //sellProducts method which prints the stock and asks the user to input product index and quantity.
     public boolean sellProducts() {
        printStock();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the index of the product to sell: "); int item = scanner.nextInt();
         System.out.println("Enter the quantity to sell: "); int amount = scanner.nextInt();

         // If statement to verify input by checking if the input is a valid item, if item is greater than products available, and if item is more than MAX_PRODUCTS(10).
         if (item < 0 || item >= MAX_PRODUCTS || products[item] == null || amount <= 0) {
             System.out.println("Invalid input, sale cannot be made.");
             // If any of the conditions are applicable returns false as no valid product can be sold.
             return false;
         }

         // Another if statement to check if the amount wanted by customer is more than stock of item available.
         Products p = products[item];
         if (p.stockQuantity < amount) {
             System.out.println("Not enough stock to complete sale.");
             //If stock is less than wanted quantity returns false as sale cannot be made.
             return false;
         }
         //This method also updates revenue by adding price of items sold to revenue increasing it from what it was
         double price = p.price * amount;
         p.sellUnits(amount);
         revenue += price;
         System.out.println("Sale complete. Total revenue: $" + revenue);
         return true;
     }
     //sellProducts (int item, int amount) uses if statement to see if item
     public boolean sellProducts(int item, int amount) {
        if (item < 0 || item >= MAX_PRODUCTS) {
            return false;
        }

        Products p = products[item];
         if (products[item] == null){
             return false;
         }

        if (amount <= 0 || amount > p.stockQuantity) {
            return false;
        }

        p.sellUnits(amount);
        revenue += amount * p.price;
        return true;
    }

    //getRevenue method to return revenue value as double
    public double getRevenue() {
        return revenue;
    }

    //printStock method which uses for loop and prints all the valid items which are not null in the array in the formatted way
    public void printStock() {
        int counter = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((counter + 1) + ". " + products[i]);
                counter++;
            }
        }
    }
}

