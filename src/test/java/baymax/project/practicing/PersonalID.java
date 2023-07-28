package baymax.project.practicing;

public class PersonalID {
    public static void main(String[] args) {
        Identification student = new Identification("Sun", "Le");
        student.setDateOfBirth("11/11/1995");
        student.setPlaceOfOrigin("Vung Tau");
        student.setDateOfExpiry("11/11/2028");
        student.setPlaceOfResidence("HCM");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getDateOfBirth());
        System.out.println(student.getPlaceOfOrigin());
        System.out.println(student.getDateOfExpiry());
        System.out.println(student.getPlaceOfResidence());
    }
}
