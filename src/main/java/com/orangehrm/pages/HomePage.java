package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By contactSalesButton = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By companyNameField = By.name("company");
    By numberOfEmployees = By.name("numemployees");
    By phoneNumberField = By.name("phone");
    By jobTitleField = By.name("jobtitle");
    By emailField = By.name("email");
    By countryField = By.name("country");
    By commentField = By.name("message");
    By submitButton = By.xpath("//input[@class='hs-button primary large']");

    public void clickOnContactSalesButton(){ clickOnElement(contactSalesButton);}
    public void enterFirstName(String firstName){ sendTextToElement(firstNameField, firstName);}
    public void enterLastName(String lastName){ sendTextToElement(lastNameField, lastName);}
    public void enterCompanyName(String companyName){sendTextToElement(companyNameField, companyName);}
    public void selectNumberOfEmployeesFromDropDown(String numberofEmployees){selectByValueFromDropDown(numberOfEmployees,numberofEmployees);}
    public void enterPhoneNumber(String phoneNumber){sendTextToElement(phoneNumberField,phoneNumber);}
    public void enterJobTitle(String jobTitle){ sendTextToElement(jobTitleField, jobTitle);}
    public void enterEmail(String email){ sendTextToElement(emailField, email);}
    public void selectCountryNameFromDropDown(String countryName){ selectByValueFromDropDown(countryField, countryName);}
    public void enterComment(String comment){ sendTextToElement(commentField, comment);}
    public void clickOnSubmitButton(){ waitUntilElementToBeClickable(submitButton,20);}



}
