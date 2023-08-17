package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductTest {
    InventoryManagement menu = new InventoryManagement();
    private Product espresso, latte, cappuccino, blackCoffee, sigTea;
    private Product coffeeBlended, summerTea, pinkyTea;

    @Before
    public void setUp() {
        espresso = new Product("Espresso", 10.00);
        latte = new Product("Latte", 12.00);
        cappuccino = new Product("Cappuccino", 12.00);
        blackCoffee = new Product("Black Coffee", 10.00);
        coffeeBlended = new Product("Summer Coffee", 50.00);
        summerTea = new Product("Summer Tea", 39.00);
        pinkyTea = new Product("Pinky Tea", 39.00);
        sigTea = new Product("Signatural Drinks", 49.00);
        menu.add(espresso,latte,cappuccino,blackCoffee,coffeeBlended,summerTea,pinkyTea);
    }

    @Test
    public void shouldAddAnItemSuccessfully() {
        Assert.assertEquals(7, menu.getTheAmountOfItemsInMenu());
        assertThat(menu.getListOfItems(), hasItems(latte));
        assertThat(menu.getListOfItems(), not(hasItems(sigTea)));
    }

    @Test
    public void shouldSeeSeasonMenuIsDisplayedCorrectly() {
        Assert.assertEquals(2, menu.getTheAmountOfSeasonItems(), 0.00);
    }

}
