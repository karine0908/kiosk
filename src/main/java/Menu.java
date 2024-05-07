import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    // 이름, 설명 필드를 가지는 클래스로 만들어주세요.
    private String name;
    private String explain;

    public Menu(String name, String explain) {
        this.name = name;
        this.explain = explain;
    }

    ArrayList<Menu> mainMenuList = new ArrayList<>();

    public void mainMenu(String name, String explain) {

        System.out.println("[ SHACKSHACK MENU ]");
        mainMenuList.add(new Menu("Burgers","앵거스 비프 통살을 다져만든 버거"));
        mainMenuList.add(new Menu("Side", "버거와 곁들여 먹을 수 있는 메뉴"));
        mainMenuList.add(new Menu("Drink", "매장에서 직접 만드는 음료"));

        System.out.println("[ ORDER MENU ]");
        mainMenuList.add(new Menu("Order" , "장바구니를 확인 후 주문합니다."));
        mainMenuList.add(new Menu("Cancel", "진행 중인 주문을 취소합니다."));
    }

}
