package baymax.project.product_management;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Setter
@Getter

public class ProviderManagement {
    public List<Providers> providersList = new ArrayList<>();

    public void add(Providers... listOfProviders){
        providersList.addAll(Arrays.asList(listOfProviders));
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

    public int totalQuatityByCategory(List<Providers> providers, String category) {
        int totalQuantity = 0;
        for(Providers provider : providers){
            if(provider.getCategory() == category ){
                totalQuantity+=provider.getQuantity();
            }
        }
    return totalQuantity;
    }

}
