package baymax.project.product_management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeItems {
    public List<Menu> items = new ArrayList<>();

    public void add(Menu... listOfitem) {
        items.addAll(Arrays.asList(listOfitem));
    }

    public int getTheAmountOfItemsInMenu() {
        return items.size();
    }

    public List<Menu> getListOfItems() {

        return items;
    }

    public double getTotalCostOfItems() {
        return items.stream()
                .mapToDouble(Menu::getCost)
                .sum();
    }
    /*    public double getTotalCostOfItems() {
    double totalCost=0;
    for (Menu item:items){
        totalCost+=item.getCost();
    }
    return totalCost;
    }*/

    public int getTheAmountOfSeasonItems() {
        int countSeasonItem = 0;
        for(Menu item:items){
            if(item.getItemName().contains("Summer")){
                countSeasonItem++;
            }
        }
        return countSeasonItem;
    }
}
