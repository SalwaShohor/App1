package lesson8.Assignment14;

public class Main {
    public static void main(String[] args) {
        
        // creating items
        Item hardDisk = new Item("Hard Disk", 200.00);
        Item keyboard = new Item("Keyboard", 80.00);
        Item pendrive = new Item("Pendrive", 60.00);

        // Online Shopping Cart
        ShoppingCart onlineCart = new OnlineShoppingCart();
        onlineCart.addItem(hardDisk);
        onlineCart.addItem(keyboard);
        onlineCart.addItem(pendrive);

        System.out.println("Online Shopping Cart Total: RM " + onlineCart.calculateTotal() + "\n");

        onlineCart.removeItem(keyboard);

        System.out.println("Online Shopping Cart Total: RM " + onlineCart.calculateTotal()+ "\n");

        //In-Store shopping cart
        ShoppingCart inStoreCart = new InStoreShoppingCart();
        inStoreCart.addItem(pendrive);
        inStoreCart.addItem(keyboard);
        inStoreCart.addItem(pendrive);

        System.out.println("In-Store Shopping Cart Total: RM " + inStoreCart.calculateTotal()+ "\n");

        inStoreCart.removeItem(pendrive);

        System.out.println("In-Store Shopping Cart Total: RM " + inStoreCart.calculateTotal()+ "\n");


    }
    
}
