import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cart extends Item{
    // 상품에서 선택한 목록을 보여준다.

    //HashMap<String, Item> cartList = new HashMap<>();

   // private Item item;


//    @Override
//    public void Burger(String name, double price, String explain) {
//        super.Burger(name, price, explain);
//    }
//
//    @Override
//    public void Drink(String name, double price, String explain) {
//        super.Drink(name, price, explain);
//    }
//
//    @Override
//    public void Side(String name, double price, String explain) {
//        super.Side(name, price, explain);
//    }

    List<Item> cartBurger = burgerList.stream().toList();
    List<Item> cartDrink = drinkList.stream().toList();
    List<Item> cartSide = sideList.stream().toList();

    public List<Item> getCartBurger() {
//        for (int i = 0; i < burgerList.size(); i++) {
//        }
        return cartBurger;
    }



    public List<Item> getCartDrink() {
        return cartDrink;
    }

    public List<Item> getCartSide() {
        return cartSide;
    }

    public void setCartSide(List<Item> cartSide) {
        this.cartSide = cartSide;
    }

    public void setCartBurger(List<Item> cartBurger) {
        this.cartBurger = cartBurger;
    }

    public void setCartDrink(List<Item> cartDrink) {
        this.cartDrink = cartDrink;
    }



    //    public void cartList() {
//        cartItem.add(item.burgerList)
//        return null;
//    }


//    public void CartList() {
//        cartList.put("cart", )
//    }



}
