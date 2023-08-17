package baymax.project.product_management;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Product {
    private String itemName;
    private double cost;

    public Product(String itemName, double cost) {
        this.itemName = itemName;
        this.cost = cost;
    }
}
