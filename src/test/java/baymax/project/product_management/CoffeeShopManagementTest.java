package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;

public class CoffeeShopManagementTest {

    @Before
    public void setUp(){
    }
    @Test
    public void shouldAddAnItemSuccessfully(){
        Items espresso = new Items("Espresso", 10.00);
        Items latte = new Items("Latte", 12.00);
        Items cappuccino = new Items("Cappuccino", 12.00);
        Items blackCoffee = new Items("Black Coffee", 10.00);
        CoffeeItems menu = new CoffeeItems();
        menu.add(espresso);
        menu.add(latte);
        menu.add(cappuccino);
        System.out.println(menu.getListOfItems());
        Assert.assertEquals(menu.getTheAmountOfItemsInMenu(), 3);
        assertThat(menu.getListOfItems(), hasItems(latte));
        assertThat(menu.getListOfItems(), not(hasItems(blackCoffee)));
        Assert.assertEquals(34.00,menu.getTotalCostOfItems(),0.00);
    }

    @Test
    public void shouldAddAProviderSuccessfully(){
        Provider providerA = new Provider("Sun SCD", "HCMC", "Coffee Bean", true);
        Provider providerB = new Provider("Sun Syrup", "HCMC", "Syrup", true);
        Provider providerC = new Provider("SunMilk", "Da Lat", "Fresh Milk", true);
        List<Provider> providerList = List.of(providerA,providerB,providerC);
        Assert.assertEquals(2, Provider.getTheAmoutOfProviderInHCM(providerList));
    }
}
