package baymax.project.product_management;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data

public class Providers {
    private String brandName;
    private String location;

    private String businessType;

    private boolean isDoorToDoor;

    public Providers(String brandName, String location, String businessType, boolean isDoorToDoor) {
        this.brandName = brandName;
        this.location = location;
        this.businessType = businessType;
        this.isDoorToDoor = isDoorToDoor;
    }


    public static int getTheAmoutOfProviderInHCM(List<Providers> providers) {
        int countProvider = 0;
        for (Providers provider : providers) {
            if ("HCMC".equals(provider.getLocation())) {
                countProvider++;
            }
        }
        return countProvider;
    }

}
