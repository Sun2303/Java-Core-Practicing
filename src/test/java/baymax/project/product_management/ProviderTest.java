package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProviderTest {
    ProviderManagement provider = new ProviderManagement();

    @Before
    public void setUp() {
        Providers providers01 = new Providers("Sun SCD", "HCMC", "Coffee Bean", 50);
        Providers providers02 = new Providers("Sun Syrup", "HCMC", "Syrup", 40);
        Providers providers03 = new Providers("SunMilk", "Da Lat", "Fresh Milk", 10);
        Providers providers04 = new Providers("Vinamilk", "HCMC", "Fresh Milk", 30);
        Providers providers05 = new Providers("Mornin", "HCMC", "Syrup", 25);
        Providers providers06 = new Providers("Bitter Coffee", "Dak Lak", "Coffee Bean", 10);
        provider.add(providers01, providers02, providers03, providers04, providers05, providers06);
    }

    @Test
    public void shouldCountProviderByAddressSuccessfully() {
        Assert.assertEquals(2, ProviderManagement.getTheAmoutOfProviderInHCM(provider.getProvidersList()));
        Assert.assertEquals(1, provider.getProvidersList().stream().filter(as -> "Da Lat".equals(as.getLocation())).count());
    }

    @Test
    public void shouldCalculateQuantityByCategoryCorrectly() {
        Assert.assertEquals(65, provider.totalQuatityByCategory(provider.getProvidersList(), "Syrup"));
        Assert.assertEquals(40, provider.totalQuatityByCategory(provider.getProvidersList(), "Fresh Milk"));
        Assert.assertEquals(60, provider.totalQuatityByCategory(provider.getProvidersList(), "Coffee Bean"));
    }

}
