import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartInterface{
    private List<Item> cartItems;

    ShoppingCart(){
        this.cartItems = new ArrayList<>();
    }

    @Override
    public List<Item> GetAllItems() {
        List<Item> allItems = new ArrayList<>() ;
        cartItems.forEach(item -> {
            if (!item.getDeleted()){
                allItems.add(item);
            }
        });
        return allItems;
    }

    @Override
    public void AddItemToCart(Item item) {
        if (this.cartItems == null){
            item.setItemId(1);
        }else{
            item.setItemId(this.cartItems.size()+1);//Setting the item id
        }
        this.cartItems.add(item);
    }

    @Override
    public void RemoveItem(int itemId) {
        cartItems.get(itemId).setDeleted(true);
    }

    @Override
    public void RestoreItem(int itemId) {
        cartItems.get(itemId).setDeleted(false);
    }

    @Override
    public void ForgetItem(int itemId) {
        cartItems.remove(itemId);
    }

    @Override
    public double TotalPrice() {
        int totalPrice = 0;
        if (this.cartItems != null)
        for(int i = 0 ; i < cartItems.size() ; i++){
            totalPrice += cartItems.get(i).getPrice();
        }
        return totalPrice;
    }

    @Override
    public int NumberOfItems() {
        return cartItems.size();
    }
}
