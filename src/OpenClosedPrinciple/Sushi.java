package OpenClosedPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Sushi extends Menu {

    public void sushi(String food) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Калифорния"));
        menuList.add(new Menu("Филадельфия"));
        menuList.add(new Menu("Роллы"));
        menuList.add(new Menu("Тобико"));
    }
}
