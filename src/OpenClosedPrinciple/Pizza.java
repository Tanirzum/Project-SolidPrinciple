package OpenClosedPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Menu {

    public void pizza(String food) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Мексиканская"));
        menuList.add(new Menu("Гавайская"));
        menuList.add(new Menu("Моцарелла"));
        menuList.add(new Menu("Маргарита"));
    }
}
