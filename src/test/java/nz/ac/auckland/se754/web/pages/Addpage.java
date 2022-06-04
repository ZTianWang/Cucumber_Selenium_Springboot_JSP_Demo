package nz.ac.auckland.se754.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addpage {

    public Addpage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "num1")
    private WebElement num1;
    @FindBy(id = "num2")
    private WebElement num2;
    @FindBy(id = "btnAdd")
    private WebElement btn;
    @FindBy(id = "result")
    private WebElement result;

    public void entryNum1(int num1){
        this.num1.sendKeys(num1+"");
    }

    public void entryNum2(int num2){
        this.num2.sendKeys(num2+"");
    }

    public void clickBtn(){
        btn.click();
    }

    public String getResult(){
        return result.getText();
    }

}
