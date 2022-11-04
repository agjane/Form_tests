package com.toolsQA;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFrmPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Form_tests {

    RegistrationFrmPage registrationFrmPage = new RegistrationFrmPage();

    @BeforeAll
    static void setUP() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    //Тест на форму регистрации студента
    @Test
    void fillFormTest() {
        String firstName ="Jane";
        String lastName = "Ag";
        String email = "ag.jane@pochta.ru";
        String gender = "Female";
        String phone = "9056346899";
        String subject1 = "Arts";
        String subject2 = "History";
        String hobby1 = "Reading";
        String hobby2 = "Music";
        String Picture = "src/photo/2810595319.jpg";
        String address = "Some country, some street 1, some house";
        String State = "NCR";
        String City = "Noida";

        registrationFrmPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phone)
                .setDateOfBirth("11", "October", "1998")
                .setSubjects(subject1)
                .setAnotherSubject(subject2)
                .setHobbies(hobby1)
                .setHobby(hobby2)
                .setPicture(Picture)
                .setAddress(address)
                .setState(State)
                .setCity(City);
        $("#submit").click();
    }

    //Проверка формы
    @Test
    void checktest() {

        $("[#example-modal-sizes-title-lg]").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Jane Ag"), text("ag.jane@pochta.ru"));

    }
}