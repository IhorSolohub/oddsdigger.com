package pages.newsCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.tipsCategory.TipsCategoryPage;

public class NewsCategoryPage extends BasePage {

    public NewsCategoryPage(WebDriver driver) {super(driver);}

    public NewsCategoryPage newsButtonClick (int numButton) {
        By newsButton = By.xpath("(//a[@class='c-card__headline'])[" + numButton + "]");
        driver.findElement(newsButton).click();
        return this;
    }
}
