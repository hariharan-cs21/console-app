package shopping;

public class Order {
    private String Name;
    private double Price;
    private int quantity;
    Order(String Name,double Price,int quantity){
        this.Name=Name;
        this.Price=Price;
        this.quantity=quantity;
    }
    public String getProductName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }
    public int getQuantity() {
        return quantity;
    }

}
