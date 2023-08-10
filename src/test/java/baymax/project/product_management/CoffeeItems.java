package baymax.project.product_management;

import java.util.ArrayList;
import java.util.List;

public class CoffeeItems {
    List<Items> items = new ArrayList<>();

    public void add(Items item) {
        items.add(item);
    }

    public int getTheAmountOfItemsInMenu() {
        return items.size();
    }

    public List<Items> getListOfItems() {
        return items;
    }

/*    public double getTotalCostOfItems() {
    double totalCost=0;
    for (Items item:items){
        totalCost+=item.getCost();
    }
    return totalCost;
    }*/

    public double getTotalCostOfItems() {
        return items.stream()
                .mapToDouble(Items::getCost)
                .sum();
    }
}
