package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Fields
    private WebDriver driver;
    private By addBtn = By.cssSelector("body > div.container.px-2 > div.row.border-bottom > div.col-12.col-md-4.py-5.text-end > a");
    private By titleName = By.id("staticEmail");
    private By discriptionName = By.name("description");
    private By submitBtn = By.cssSelector("#myModal > div > div > div.modal-body > form > div.row.py-3 > div > div > div:nth-child(1) > input");

    private By addedTitleName = By.cssSelector("body > div.container.px-2 > div:nth-child(2) > div > div > div > div:nth-child(8) > div.col-12.col-md-4.mb-1");


    private By viewAddedTitle = By.cssSelector("body > div.container.px-2 > div:nth-child(2) > div > div > div > div:nth-child(8) > div:nth-child(2) > a");

    private By viewAddedTitleTxt = By.cssSelector("#myModal > div > div > div.modal-body > div:nth-child(1)");



    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddBtn(){
        driver.findElement(addBtn).click();
    }

    public void enterTitle(){
        driver.findElement(titleName).sendKeys("In God we trust");
    }
    public void enterDescription(){
        driver.findElement(discriptionName).sendKeys("All things are possible through Him");
    }

    public void clickSubmitBtn(){
        driver.findElement(submitBtn).click();
    }

    public String addedTitleTxt(){
        return driver.findElement(addedTitleName).getText();
    }

    public void clickView(){
        driver.findElement(viewAddedTitle).click();
    }

    public String viewTitleTxt(){
        return driver.findElement(viewAddedTitleTxt).getText();
    }


}
