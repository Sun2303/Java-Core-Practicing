package baymax.project.practicing;

import org.apache.commons.lang3.RandomStringUtils;

public class ArrayAndList {
    public static void main(String[] args) {
        /*List listdanhsach = new ArrayList();
        ArrayList arrayList = new ArrayList();
        listdanhsach.iterator().remove();
        arrayList.ensureCapacity(1);*/
/*        List<String> dataTypeList = List.of("String", "Number", "Integer", "Double");
        System.out.println(dataTypeList);
        dataTypeList.set(0,"Name");
        System.out.println(dataTypeList);*/
        String text = "Hello Well Done";
        System.out.println(text.indexOf("e", 5));
    }

    public static class Phone{
        private String number;
        public Phone(String number){
            this.number = number + "-" + RandomStringUtils.randomNumeric(3);
        }

        /*public void  setNumber(String number){
            this.number = number;
        }*/

        public String  getNumber(){
            return number;
        }
    }
}
