package baymax.project.practicing;
import baymax.project.practicing.ArrayAndList.Phone;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;


public class CodeJava01 {
    /*public static void main(String[] args) {
*//*        int x = 10;
        int y = 20;
        swap(x, y);//Chỉ work trong hàm swap. Ngoài hàm swap là không ảnh hưởng tới giá trị ban đầu
        System.out.print(x + " " + y);
    }

    static void swap(int p, int q) {
        int temp = p;
        p = q;
        q = temp;
        System.out.print(p + " " + q);
    }*//*

    final Phone phone = new Phone();
    phone.setPhone("321");
        System.out.println("number: " + phone.getPhone());
        System.out.println("number: " + phone.getPhone());
        System.out.println("number: " + phone.getPhone());
    }*/

    final static Phone phone = new Phone("123");
    @Test
    @WithTag("001")
    public void ShouldSeePhoneNumber() {
        System.out.println("================================number: " + phone.getNumber());
    }

    @Test
    @WithTag("002")
    public void CheckIfPhoneNumberIsCreated() {
        System.out.println("================================number: " + phone.getNumber());
    }
}

