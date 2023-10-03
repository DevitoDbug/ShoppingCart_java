public class Item {
    private int itemId;
    private String name;
    private double price;
    private int quantity;
    private boolean deleted = false ;

    Item(int itemsId , String name , double price , int quantity){
        this.itemId = itemsId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setDeleted(boolean delete){
        deleted = delete;
    }

    public boolean getDeleted(){
        return deleted;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
