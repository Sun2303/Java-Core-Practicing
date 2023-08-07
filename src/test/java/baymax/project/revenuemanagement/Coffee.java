package baymax.project.revenuemanagement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coffee {
    double cost;
    double price;
    double profit;
    double profitAWeek;
    double profitAMonth;

    public double getProfit() {
        return profit = price - cost;
    }
    public double getProfitAWeek() {
        return getProfit()*7;
    }
    public double getProfitAMonth() {
        return getProfit()*30;
    }
}
