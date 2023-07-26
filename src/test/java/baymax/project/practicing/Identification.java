package baymax.project.practicing;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class Identification {
    private String fullName, placeOfOrigin, placeOfResidence, dateOfBirth, dateOfExpiry, gender;
    private Number idNumber;


    public Identification(String fullName, String gender){
        this.fullName = fullName;
        this.gender = gender;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
