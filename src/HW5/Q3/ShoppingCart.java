package HW5.Q3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> itemList;

    public ShoppingCart(){
    itemList = new ArrayList<>();
    }
    public void addItem(Item item){
        itemList.add(item);
    }
    public void removeItem(Item item){
        itemList.remove(item);
    }
    public int calculateTotal(){
        int price = 0;

        for (int i = 0; i < itemList.size(); i++) {
            price += itemList.get(i).getPrice();

        }
        return price;

    }
    public void pay(PaymentStrategy strategy){
        strategy.pay(calculateTotal());
    }
}
