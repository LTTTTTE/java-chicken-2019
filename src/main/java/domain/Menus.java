package domain;

import java.util.List;

public class Menus {
    private List<Menu> menus;

    public Menus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public boolean isMenuExist(int number) {
        return menus.stream().anyMatch(x -> x.isMenuNumberSame(number));
    }
}
