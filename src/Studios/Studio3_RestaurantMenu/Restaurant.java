package Studios.Studio3_RestaurantMenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();

        MenuItem chickenPiccata = new MenuItem("Chicken Piccata", 13.99, "chicken in white wine sauce with capers and pasta", "entree");
        MenuItem tiramisu = new MenuItem("Tiramisu", 5.99, "espresso ladyfingers with mascarpone layers topped with cocoa", "dessert");
        MenuItem caesarSalad = new MenuItem("Caesar Salad", 3.99, "romaine lettuce with Caesar dressing and croutons", "appetizer");

        restaurantMenu.addItem(chickenPiccata);
        restaurantMenu.addItem(tiramisu);
        restaurantMenu.addItem(caesarSalad);
        restaurantMenu.removeItem(caesarSalad);
        System.out.println(restaurantMenu);


    }
}
