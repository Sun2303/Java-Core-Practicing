package baymax.project.product_management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryManagement {
    public List<Product> items = new ArrayList<>();

    public void add(Product... listOfitem) {
        items.addAll(Arrays.asList(listOfitem));
    }

    public int getTheAmountOfItemsInMenu() {
        return items.size();
    }

    public List<Product> getListOfItems() {

        return items;
    }

    public double getTotalCostOfItems() {
        return items.stream()
                .mapToDouble(Product::getCost)
                .sum();
    }

    public int getTheAmountOfSeasonItems() {
        int countSeasonItem = 0;
        for(Product item:items){
            if(item.getItemName().contains("Summer")){
                countSeasonItem++;
            }
        }
        return countSeasonItem;
    }
}
