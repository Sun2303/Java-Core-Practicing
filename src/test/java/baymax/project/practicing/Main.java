package baymax.project.practicing;

public class Main {
    public static void main(String[] args){
        Identification person = new Identification("Sun CD", "Male");
        /*person.setFullName("Sun CD");*/
        person.setDateOfBirth("11/11/1995");
        person.setPlaceOfOrigin("Vung Tau");
        person.setDateOfExpiry("11/11/2028");
        person.setPlaceOfResidence("HCM");
        /*System.out.println(person.getFullName());*/
        System.out.println(person.getDateOfBirth());
        System.out.println(person.getPlaceOfOrigin());
        System.out.println(person.getDateOfExpiry());
        System.out.println(person.getPlaceOfResidence());
    }
}
