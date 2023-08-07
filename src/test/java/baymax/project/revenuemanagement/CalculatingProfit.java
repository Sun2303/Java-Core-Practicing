package baymax.project.revenuemanagement;

import org.junit.Assert;
import org.junit.Test;

public class CalculatingProfit {
    Coffee saltCoffee = new Coffee();
    public double cost, price, profit, profitAWeek, profitAMonth;

    @Test
    public void Calculate_profit_a_day_correctly() {
        saltCoffee.setCost(12.5);
        saltCoffee.setPrice(18.5);
        cost = saltCoffee.getCost();
        price = saltCoffee.getPrice();
        profit = saltCoffee.getProfit();
        System.out.println("The cost per one cup of salt coffee: " + cost);
        System.out.println("The price per one cup of salt coffee: " + price);
        System.out.println("The profit per one cup of salt coffee: " + profit);
        Assert.assertEquals(6.0, profit, 0.0);
    }

    @Test
    public void Calculate_profit_a_week_correctly() {
        saltCoffee.setCost(12.5);
        saltCoffee.setPrice(18.5);
        cost = saltCoffee.getCost();
        price = saltCoffee.getPrice();
        profitAWeek = saltCoffee.getProfitAWeek();
        System.out.println("The cost per one cup of salt coffee: " + cost);
        System.out.println("The price per one cup of salt coffee: " + price);
        System.out.println("The profit per one cup of salt coffee in a week: " + profitAWeek);
        Assert.assertEquals(42.0, profitAWeek, 0.0);
    }

    @Test
    public void Calculate_profit_a_month_correctly() {
        saltCoffee.setCost(12.5);
        saltCoffee.setPrice(18.5);
        cost = saltCoffee.getCost();
        price = saltCoffee.getPrice();
        profitAMonth = saltCoffee.getProfitAMonth();
        System.out.println("The cost per one cup of salt coffee: " + cost);
        System.out.println("The price per one cup of salt coffee: " + price);
        System.out.println("The profit per one cup of salt coffee in a week: " + profitAMonth);
        Assert.assertEquals(180.0, profitAMonth, 0.0);
    }

}
