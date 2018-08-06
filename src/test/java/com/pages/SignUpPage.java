package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtCompany\"]")
    public static WebElement companyNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_ddlState\"]")
    public static WebElement stateDDown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtAddress\"]")
    public static WebElement addressField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtZip\"]")
    public static WebElement zipCodeField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtCity\"]")
    public static WebElement cityField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtConName\"]")
    public static WebElement contactNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtCustomer\"]")
    public static WebElement accountNumberField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtConEmail\"]")
    public static WebElement emailAddressField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtConPhone\"]")
    public static WebElement phoneNumberField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_txtComments\"]")
    public static WebElement commentsField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_chkSignEmail\"]")
    public static WebElement unsubscribeCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"myrlc-signup-submit\"]")
    public static WebElement submitBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_cphBody_pnlResults\"]/p/span")
    public static WebElement messageLabel;

}
