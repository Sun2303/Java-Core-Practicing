package baymax.project.product_management;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
public class Menu {
    private String itemName;
    private double cost;
    List<Menu> items = new ArrayList<>();

    public Menu(String itemName, double cost) {
        this.itemName = itemName;
        this.cost = cost;
    }
/*    public void add(Menu item) {
        items.add(item);
    }

    public int getTheAmountOfItemsInMenu() {
        return items.size();
    }

    public List<Menu> getListOfItems() {
        return items;
    }

*//*    public double getTotalCostOfItems() {
    double totalCost=0;
    for (Menu item:items){
        totalCost+=item.getCost();
    }
    return totalCost;
    }*//*

    public double getTotalCostOfItems() {
        return items.stream()
                .mapToDouble(Menu::getCost)
                .sum();
    }*/
}
