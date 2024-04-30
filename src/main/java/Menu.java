import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    // 이름, 설명 필드를 가지는 클래스로 만들어주세요.
    public String name;
    public String explain;

    public Menu (String name, String explain) {
        this.name = name;
        this.explain = explain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }




}
