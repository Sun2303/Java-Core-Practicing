package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuTest {
    CoffeeItems menu = new CoffeeItems();
    private Menu espresso, latte, cappuccino, blackCoffee, sigTea;
    private Menu coffeeBlended, summerTea, pinkyTea;

    @Before
    public void setUp() {
        espresso = new Menu("Espresso", 10.00);
        latte = new Menu("Latte", 12.00);
        cappuccino = new Menu("Cappuccino", 12.00);
        blackCoffee = new Menu("Black Coffee", 10.00);
        coffeeBlended = new Menu("Summer Coffee", 50.00);
        summerTea = new Menu("Summer Tea", 39.00);
        pinkyTea = new Menu("Pinky Tea", 39.00);
        sigTea = new Menu ("Signatural Drinks", 49.00);
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
