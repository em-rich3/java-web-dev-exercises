package Studios.Studio3_RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static int nextMenuID = 1;

    private ArrayList<MenuItem> menu;
    private Date lastUpdated;
    private int menuID;

    public Menu() {
        menu = new ArrayList<>();
        lastUpdated = new Date();
        menuID = nextMenuID;
        nextMenuID++;
    }

    public void addItem(MenuItem item) {
        if (menu.contains(item)) {
            return;
        }
        menu.add(item);
        lastUpdated = new Date();
    }

    public boolean removeItem(MenuItem item) {
        boolean removed = menu.remove(item);
        if (removed) {
            lastUpdated = new Date();
        }
        return removed;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String toString() {
        String menuStr = "==== Menu ====\n";
        for (MenuItem item : menu) {
            menuStr += item+"\n";
        }
        return menuStr;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }
        Menu menu = (Menu) object;
        return menuID == menu.menuID;
    }
    @Override
    public int hashCode() {
        return menuID;
    }
}
