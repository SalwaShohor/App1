package lesson8.Assignment14;

public class OnlineShoppingCart implements ShoppingCart {
    private double totalCost;

    @Override
    public void addItem(Item item){
        // add an item for online shopping
        // update the total cost
        totalCost = totalCost + item.getPrice();
        System.out.println(item.getName() + " added to online shopping cart.");
    }

    @Override
    public void removeItem(Item item){
        // remove an item for online shopping
        // update the total cost
        totalCost = totalCost - item.getPrice();
        System.out.println(item.getName() +" removed from online shopping cart.");
    }

    @Override
    public double calculateTotal(){
        // calculate the total cost for online shopping
        return totalCost;
    }
    
}
