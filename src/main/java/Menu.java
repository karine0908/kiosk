import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    // 이름, 설명 필드를 가지는 클래스로 만들어주세요.
    public String name;
    public String explain;


//    Map<String, Item> selectMeal = new HashMap<>();
//    public void selectMenu(String name, String explain) {
//        System.out.println(ID + name + " | " + explain);
//        System.out.println(ID + name + " | " + explain);
//        System.out.println(ID + name + " | " + explain);
//    }

    Map<String, Menu> selectMeal = new HashMap<>();

//    public void select(String name, int price, String explain) {
//
//    }

    public void Burger(String name, double price, String explain) {
        List<Item> burgerList = new ArrayList<>();
      //  burgerList.add(new Item("burger" + " | W " + 9.0 + " | " + "gkdl"));

    }



    public void Side(String name, double price, String explain) {
        List<Item> sideList = new ArrayList<>();



    }

    public void Drink(String name, double price, String explain) {
        List<Item> drinkList = new ArrayList<>();

    }

}
