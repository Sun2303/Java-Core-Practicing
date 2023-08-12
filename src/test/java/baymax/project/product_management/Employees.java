package baymax.project.product_management;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor

public class Employees {
    private String fullName, position;
    private int birthOfYear;
    private double salaryOnPosition;

    public double getSalaryOnPosition(double salaryOnPosition){
        if(position.equals("Supervisor") || position.equals("Cashier")){
            salaryOnPosition = 35;
        }if(position.equals("Waiter")){
            salaryOnPosition = 20;
        }if(position.equals("Warehouse Manager")){
            salaryOnPosition = 40;
        }
        return salaryOnPosition;
    }
}
