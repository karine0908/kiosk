import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cart{
    private final Item item;

    Cart(Item item) {
        this.item = item;
    }

    public void addCart() {
        System.out.println("[ 장비구니 목록 ]");
        System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getExplain());

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
            if(num == 1) {
                System.out.println(item.getName() + "가 카트에 추가되었습니다.");
            } else if(num == 2) {
                System.out.println("메인화면으로 돌아갑니다.");
            }
        scanner.reset();
    }

}
