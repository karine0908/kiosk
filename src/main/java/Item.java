import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item extends Menu{

    private final String name, explain;
    private final double price;

    public Item(String name, double price, String explain) {
        super(name, explain);
        this.name = name;
        this.price = price;
        this.explain = explain;
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

    Map<String, List<Item>> chooseMenu = new HashMap<>();

    ArrayList<Item> burgerList = new ArrayList<>();
    ArrayList<Item> sideList = new ArrayList<>();
    ArrayList<Item> drinkList = new ArrayList<>();

    public void itemList(String name, double price, String explain) {

        burgerList.add(new Item("치킨버거",  9.0, "닭고기가 들어있습니다."));
        burgerList.add(new Item("쇠고기버거", 5.0, "소고기가 들어있습니다."));
        burgerList.add(new Item("새우버거",4.0,"새우가 들어있습니다."));
        burgerList.add(new Item("오징어버거", 4.0, "오징어가 들어있습니다."));
        burgerList.add(new Item("치즈버거", 4.5, "치즈가 들어있습니다."));
        burgerList.add(new Item("더블치즈버거", 8.0, "치즈가 2장 들어있습니다."));

        chooseMenu.put("burger", burgerList);

        sideList.add(new Item("감자스틱", 2.0, "햇감자로 튀긴 짭조름한 스틱"));
        sideList.add(new Item("코울슬로", 2.0, "잘게 채썬 양배추에 특제 드레싱이 곁들어진 샐러드"));
        sideList.add(new Item("나쵸", 3.0, "바삭바삭함이 생명인 칩 과자"));
        sideList.add(new Item("치즈스틱", 3.0, "25cm로 길다란 치즈스틱"));

        chooseMenu.put("side", sideList);

        drinkList.add(new Item("제로콜라", 2.0, "당분이 없는 0칼로리 콜라"));
        drinkList.add(new Item("사이다", 2.0, "청량하고 시원한 사이다"));
        drinkList.add(new Item("아메리카노", 2.0, "에티오피아 원두로 로스팅한 커피"));
        drinkList.add(new Item("오렌지주스", 2.5, "제주 한라봉으로 수제로 착즙한 주스"));

        chooseMenu.put("drink", drinkList);

    }

}
