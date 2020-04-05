package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractBasePage {
    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
protected WebDriver driver=Driver.getDriver();
protected WebDriverWait wait=new WebDriverWait(driver,20);

}
