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
    public RegistrationFrmPage setEmail (String value) {
        $("#userEmail").setValue("ag.jane@pochta.ru");

        return this;
    }
    public RegistrationFrmPage setGender (String value) {
        $("#gender-radio-2").doubleClick();

        return this;
    }

    public RegistrationFrmPage setPhone (String value) {
        $("#userNumber").setValue("9056346899");

        return this;
    }

    public RegistrationFrmPage setDateOfBirth (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        datepicker.setDate(day, month, year);

        return this;
    }

    public RegistrationFrmPage setSubjects (String value) {
        $("#subjectsInput").sendKeys("Arts");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").sendKeys("History");
        $("#subjectsInput").pressEnter();

        return this;
    }

    public RegistrationFrmPage setHobbies (String value) {
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        return this;
    }

    public RegistrationFrmPage setPicture (String value) {
        $("#uploadPicture").uploadFile(new File("src/photo/2810595319.jpg"));

        return this;
    }

    public RegistrationFrmPage setAddress (String value) {
        $("#currentAddress").setValue("Some country, some street 1, some house");

        return this;
    }

    public RegistrationFrmPage setState (String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();

        return this;
    }

    public RegistrationFrmPage setCity (String value) {
        $("#city").click();
        $("#city").$(byText("Noida")).click();

        return this;
    }

}
