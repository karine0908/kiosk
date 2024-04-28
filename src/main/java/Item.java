

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

}
