package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoffeeShopManagementTest {
    private Employees employee01, employee02, employee03, employee04, employee05;
    private List<Employees> employeeList;
    @Before
    public void setUp() {
        employee01 = new Employees("Sun Beo", "Supervisor", 02, 35);
        employee02 = new Employees("Tran Tuan", "Waiter", 01, 20);
        employee03 = new Employees("Nguyen Minh", "Waiter", 01, 20);
        employee04 = new Employees("Le Hieu", "Cashier", 03, 35);
        employee05 = new Employees("Le Hoang", "Warehouse Manager", 03, 40);
        employeeList = Arrays.asList(employee01, employee02, employee03, employee04, employee05);
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
    public void shouldCountProviderByAddressSuccessfully(){
        Providers providersA = new Providers("Sun SCD", "HCMC", "Coffee Bean", true);
        Providers providersB = new Providers("Sun Syrup", "HCMC", "Syrup", true);
        Providers providersC = new Providers("SunMilk", "Da Lat", "Fresh Milk", true);
        List<Providers> providersList = List.of(providersA, providersB, providersC);
        Assert.assertEquals(2, Providers.getTheAmoutOfProviderInHCM(providersList));
        Assert.assertEquals(1, providersList.stream().filter(as -> "Da Lat".equals(as.getLocation())).count());
    }

    @Test
    public void shouldAddNewEmployeeSuccessfully(){
        Assert.assertEquals(5, employeeList.stream().count());
        Assert.assertEquals(1, employeeList.stream().filter(as -> "Supervisor".equals(as.getPosition())).count());
    }

    @Test
    public void shouldSeeDifferentSalaryForEachLevel(){
        Assert.assertEquals(5,employeeList.stream().count());
        Assert.assertEquals(35,employee01.getSalaryOnPosition(),0.00);
        Assert.assertEquals(35,employeeList.get(3).getSalaryOnPosition(),0.00);
    }

}
