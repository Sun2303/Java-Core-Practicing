package baymax.project.practicing;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class Identification {
    private String firstName, lastName, placeOfOrigin, placeOfResidence, dateOfBirth, dateOfExpiry;
    private Number idNumber;


    public Identification(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }
    public String getLastName() {

        return lastName;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public Number getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Number idNumber) {
        this.idNumber = idNumber;
    }
}
