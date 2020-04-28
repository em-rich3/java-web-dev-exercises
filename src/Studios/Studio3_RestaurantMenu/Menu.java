package Studios.Studio3_RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<Object> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<Object> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<Object> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Object> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
