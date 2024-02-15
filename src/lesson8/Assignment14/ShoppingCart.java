package lesson8.Assignment14;

//package-private (default) access, 
//which means it can be accessed only within the same package.

public interface ShoppingCart {
    
    void addItem(Item item);
    
    void removeItem(Item item);

    double calculateTotal();

}
