package shopping;

public class Products {
    private int id;
    private int cost;
    private String name;
    private int quantity;
    Products(int id,int cost,String name,int quantity){
        this.id=id;
        this.cost=cost;
        this.name=name;
        this.quantity=quantity;
    }

    public int getid() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return cost;
    }

    public int getQuantityAvailable() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void displayProduct(){
        System.out.println("Product Id : "+id);
        System.out.println("Product Name : " +name);
        System.out.println("Quantity : "+quantity);
        System.out.println("Price : "+cost);

        System.out.println("\n");
    }
}
