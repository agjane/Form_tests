package pages;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFrmPage {

    datepicker datepicker = new datepicker();
    public RegistrationFrmPage openPage () {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
    public RegistrationFrmPage setFirstName (String value) {
        $("#firstName").setValue(value);

        return this;
    }
    public RegistrationFrmPage setLastName (String value) {
        $("#lastName").setValue(value);

        return this;
    }
    public RegistrationFrmPage setEmail (String email) {
        $("#userEmail").setValue(email);

        return this;
    }
    public RegistrationFrmPage setGender (String value) {
        $("#gender-radio-2").doubleClick();

        return this;
    }

    public RegistrationFrmPage setPhone (String phone) {
        $("#userNumber").setValue(phone);

        return this;
    }

    public RegistrationFrmPage setDateOfBirth (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        datepicker.setDate(day, month, year);

        return this;
    }

    public RegistrationFrmPage setSubjects (String subject1) {
        $("#subjectsInput").sendKeys(subject1);
        $("#subjectsInput").pressEnter();

        return this;
    }
    public RegistrationFrmPage setAnotherSubject (String subject2) {
        $("#subjectsInput").sendKeys(subject2);
        $("#subjectsInput").pressEnter();

        return this;
    }

    public RegistrationFrmPage setHobbies (String hobby1) {
        $("#hobbiesWrapper").$(byText(hobby1)).click();

        return this;
    }
    public RegistrationFrmPage setHobby (String hobby2) {
        $("#hobbiesWrapper").$(byText(hobby2)).click();

        return this;
    }

    public RegistrationFrmPage setPicture (String Picture) {
        $("#uploadPicture").uploadFile(new File(Picture));

        return this;
    }

    public RegistrationFrmPage setAddress (String address) {
        $("#currentAddress").setValue(address);

        return this;
    }

    public RegistrationFrmPage setState (String State) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(State)).click();

        return this;
    }

    public RegistrationFrmPage setCity (String City) {
        $("#city").click();
        $("#city").$(byText(City)).click();

        return this;
    }

}
