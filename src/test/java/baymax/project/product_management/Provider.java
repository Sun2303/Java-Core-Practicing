package baymax.project.product_management;

import com.google.inject.util.Providers;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

public class Provider {
    private String brandName;
    private String location;

    private String businessType;

    private boolean isDoorToDoor;

    public Provider(String brandName, String location, String businessType, boolean isDoorToDoor) {
        this.brandName = brandName;
        this.location = location;
        this.businessType = businessType;
        this.isDoorToDoor = isDoorToDoor;
    }


    public static int getTheAmoutOfProviderInHCM(List<Provider> providers) {
        int countProvider = 0;
        for (Provider provider : providers) {
            if ("HCMC".equals(provider.getLocation())) {
                countProvider++;
            }
        }
        return countProvider;
    }
}
