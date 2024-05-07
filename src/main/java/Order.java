import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Order {
        // 카트에 있는 상품들을 주문 및 주문취소한다.
    private final Item item;
    private double totalPrice;
    private static int num;
    public int orderNum;

    public Order(Item item, double totalPrice, int orderNum) {
        this.item = item;
        this.totalPrice = totalPrice;
        this.orderNum = num++;
    }

    // 주문 화면
    public void CartOrder() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("[Orders]");
        for (int i = 0; i < item.chooseMenu.size(); i++) {
            System.out.printf((i + 1) + "." + item.getName() + " | W " + item.getPrice() + " | "
                + item.getExplain());
        }

        System.out.println("[Total]");
        totalPrice += item.getPrice();
        System.out.println(" W " + totalPrice);

    }

    // 주문 완료
    public void OrderSuccess() {
        int orderNumber = 1;
        System.out.println("대기번호는 [ " + orderNumber + "} 입니다.");
        System.out.println("3초 후 메뉴판으로 돌아갑니다.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인메뉴로 돌아갑니다.");

    }

    // 주문 취소
    public void OrderCancel() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 1) {
            System.out.println("주문이 취소되었습니다.");
        } else if (num == 2) {
            System.out.println("메인화면으로 돌아갑니다.");
        }
    }

}
