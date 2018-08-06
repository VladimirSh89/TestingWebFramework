package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"sign-up\"]/a")
    public static WebElement signUpLabel;

}
