package pages.tipsCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class TipsCategoryPage extends BasePage  {

    public TipsCategoryPage(WebDriver driver) {super(driver);}

    public TipsCategoryPage tipsButtonClick (int numButton) {
        By tipsButton = By.xpath("(//a[@class='c-card__headline'])[" + numButton + "]");
        driver.findElement(tipsButton).click();
        return this;
    }
}
