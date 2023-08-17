package baymax.project.product_management;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data

public class Providers {
    private String brandName;
    private String location;
    private int quantity;

    private String category;


    public Providers(String brandName, String location, String category, int quantity) {
        this.brandName = brandName;
        this.location = location;
        this.category = category;
        this.quantity = quantity;
    }


}
