package HW5.Q3;

public class Item {
    public Item(String id, int price) {
        Id = id;
        this.price = price;
    }

    String Id;
    int price;

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }

}
