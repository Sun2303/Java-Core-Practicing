package baymax.project.product_management;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
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
    public void shouldAddNewEmployeeSuccessfully(){
        Assert.assertEquals(5, employeeList.stream().count());
        Assert.assertEquals(1, employeeList.stream().filter(as -> "Supervisor".equals(as.getPosition())).count());
    }

    @Test
    public void shouldSeeDifferentSalaryForEachLevel(){
        Assert.assertEquals(5,employeeList.stream().count());
        Assert.assertEquals(35,employee01.getSalaryOnPosition(),0.00);
        Assert.assertEquals(35,employeeList.get(3).getSalaryOnPosition(),0.00);
        Assert.assertEquals("Sun Beo", employeeList.get(0).getFullName());
    }
}
