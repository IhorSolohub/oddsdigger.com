package pages.tips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class TipsPage extends BasePage {

    public TipsPage(WebDriver driver) {super(driver);}

    public TipsPage regButtonInSidebarClick (int numButton) {
        By regButtonInSidebar = By.xpath("(//a[@class='c-btn c-btn--warning c-btn--lg'])[" + numButton + "]");
        driver.findElement(regButtonInSidebar).click();
        return this;
    }

    public TipsPage mostPopularOddsButtonClick (int numButton) {
        By mostPopularOddsButton = By.xpath("(//a[@class='c-border-list__link'])[" + numButton + "]");
        driver.findElement(mostPopularOddsButton).click();
        return this;
    }

    public TipsPage otherTipsButtonClick (int numButton) {
        By otherTipsButton = By.xpath("(//a[@class='c-card-sm__title'])[" + numButton + "]");
        driver.findElement(otherTipsButton).click();
        return this;
    }

}
