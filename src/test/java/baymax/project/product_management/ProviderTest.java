package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProviderTest {
    @Test
    public void shouldCountProviderByAddressSuccessfully(){
        Providers providersA = new Providers("Sun SCD", "HCMC", "Coffee Bean", true);
        Providers providersB = new Providers("Sun Syrup", "HCMC", "Syrup", true);
        Providers providersC = new Providers("SunMilk", "Da Lat", "Fresh Milk", true);
        List<Providers> providersList = List.of(providersA, providersB, providersC);
        Assert.assertEquals(2, Providers.getTheAmoutOfProviderInHCM(providersList));
        Assert.assertEquals(1, providersList.stream().filter(as -> "Da Lat".equals(as.getLocation())).count());
    }
}
