
public class Order implements ShopItem {

    private double price;
    
    
    public Order(double price) {
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }
    
}
