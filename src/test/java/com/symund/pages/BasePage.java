package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

@FindBy (xpath ="//*[@src='/index.php/avatar/Employee71/32?v=0']")
public WebElement userNameicon;

@FindBy (xpath ="//*[@href='/index.php/logout?requesttoken=9boh6h52Oo0ySrS6aFeo7OLE%2FH9XxGhZrJEFmddGdNQ%3D%3AwONLr25dfdlrPeD5EjbQnNuyky0R8CwB%2Brpy7LEpDJA%3D']")
public WebElement logOutLink;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userNameicon);
        BrowserUtils.clickWithJS(logOutLink);
    }


}
