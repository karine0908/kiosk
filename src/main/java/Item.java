import java.util.ArrayList;
import java.util.List;

public class Item {
// 상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요,
// 상품 클래스의 이름, 설명 필드는 메뉴 클래스를 상속받아 사용하는 구조로 개발해주세요.
// Map, ArrayList

    public static int sequenceId;
    public String name, explain;
    public double price;
    public int id;

    public Item(String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.id = sequenceId++;
    }

    public Item() {

    }


    public String getName() {
        return name;
    }

    public String getExplain() {
        return explain;
    }

    public double getPrice() {
        return price;
    }

    // Map<String, Item> selectMeal = new HashMap<>();
    ArrayList<Item> burgerList = new ArrayList<>();
    ArrayList<Item> sideList = new ArrayList<>();
    ArrayList<Item> drinkList = new ArrayList<>();


    public void Burger(String name, double price, String explain) {
        Item chicken = new Item("치킨버거",  9.0, "닭고기가 들어있습니다.");
        Item beef = new Item("쇠고기버거", 5.0, "소고기가 들어있습니다.");
        Item shrimp = new Item("새우버거",4.0,"새우가 들어있습니다.");
        Item calamari = new Item("오징어버거", 4.0, "오징어가 들어있습니다.");
        Item cheese = new Item("치즈버거", 4.5, "치즈가 들어있습니다.");
        Item twoCheese = new Item("더블치즈버거", 8.0, "치즈가 2장 들어있습니다.");

        burgerList.add(chicken);
        burgerList.add(beef);
        burgerList.add(shrimp);
        burgerList.add(calamari);
        burgerList.add(cheese);
        burgerList.add(twoCheese);
        // selectMeal.put("burger", );

//        for (int i = 0; i < burgerList.size(); i++) {
//            System.out.printf(name + " | W | " + price + " | " + explain);
//        }
    }


    public void Side(String name, double price, String explain) {
        Item potatoStick = new Item("감자스틱", 2.0, "햇감자로 튀긴 짭조름한 스틱");
        Item coleslaw = new Item("코울슬로", 2.0, "잘게 채썬 양배추에 특제 드레싱이 곁들어진 샐러드");
        Item nachos = new Item("나쵸", 3.0, "바삭바삭함이 생명인 칩 과자");
        Item cheeseStick = new Item("치즈스틱", 3.0, "25cm로 길다란 치즈스틱");

        sideList.add(potatoStick);
        sideList.add(coleslaw);
        sideList.add(nachos);
        sideList.add(cheeseStick);

        // selectMeal.put("side", );

//        for (int i = 0; i < sideList.size(); i++) {
//            System.out.printf(name + " | W | " + price + " | " + explain);
//        }
    }

    public void Drink(String name, double price, String explain) {
        Item zeroCoke = new Item("제로콜라", 2.0, "당분이 없는 0칼로리 콜라");
        Item sprite = new Item("사이다", 2.0, "청량하고 시원한 사이다");
        Item coffee = new Item("아메리카노", 2.0, "에티오피아 원두로 로스팅한 커피");
        Item orangeJuice = new Item("오렌지주스", 2.5, "제주 한라봉으로 수제로 착즙한 주스");

        drinkList.add(zeroCoke);
        drinkList.add(sprite);
        drinkList.add(coffee);
        drinkList.add(orangeJuice);
    }



//        for (int i = 0; i < drinkList.size(); i++) {
//            System.out.printf(name + " | W | " + price + " | " + explain);
//        }
        // selectMeal.put("drink", );

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getExplain() {
//        return explain;
//    }
//
//    public void setExplain(String explain) {
//        this.explain = explain;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

}
