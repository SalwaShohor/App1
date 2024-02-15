package lesson8.Assignment14;

public class InStoreShoppingCart implements ShoppingCart{

    private double totalCost;

    @Override
    public void addItem(Item item){
        // add an item for in-store shopping
        // update the total cost
        totalCost = totalCost + item.getPrice();
        System.out.println(item.getName() + " added to in-store shopping cart.");
    }

    @Override
    public void removeItem(Item item){
        // remove an item for in-store shopping
        // update the total cost
        totalCost = totalCost - item.getPrice();
        System.out.println(item.getName() + " removed from in-store shopping cart.");
    }

    @Override
    public double calculateTotal(){
        // calculate the total cost for in-store shopping
        return totalCost;
    }
    
}
