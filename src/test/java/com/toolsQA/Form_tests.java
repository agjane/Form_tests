package com.toolsQA;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class Form_tests {
    @BeforeAll
    static void setUP() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        Selenide.open("/automation-practice-form");
        $("[id=firstName]").setValue("Jane");
        $("[id=lastName]").setValue("Ag");
        $("[id=userEmail]").setValue("ag.jane@pochta.ru");
        $("[id=gender-radio-2]").doubleClick();
        $("[id=userNumber]").setValue("9056346899");




    }
}
