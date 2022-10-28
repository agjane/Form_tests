package com.toolsQA;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.nio.file.Files.delete;

public class Form_tests {
    @BeforeAll
    static void setUP() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("#firstName").setValue("Jane");
        $("#lastName").setValue("Ag");
        $("#userEmail").setValue("ag.jane@pochta.ru");
        $("#gender-radio-2").doubleClick();
        $("#userNumber").setValue("9056346899");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__year-select").selectOption("1998");
        $(".react-datepicker__day--011:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").sendKeys("Arts");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").sendKeys("History");
        $("#subjectsInput").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/photo/2810595319.jpg"));


    }
}