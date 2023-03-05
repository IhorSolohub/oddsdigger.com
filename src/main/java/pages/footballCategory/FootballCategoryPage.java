package pages.footballCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class FootballCategoryPage extends BasePage {

    public FootballCategoryPage(WebDriver driver) {super(driver);}

    private final By allOddsButton = By.xpath("(//a[@class='c-btn c-btn--sm c-btn--warning-invert'])[1]");
    private final By inPlayBetButton = By.xpath("(//a[@class='c-btn c-btn--sm c-btn--primary'])[1]");
    private final By allOddsChecker = By.xpath("//div[@class='c-event-board__cell']");
    private final By inPlayBetChecker = By.xpath("//div[@class='c-accordion-item__headline']");

    public FootballCategoryPage bettingTipsButtonClick (int numButton) {
        By bettingTipsButton = By.xpath("(//a[@class='c-tip__title'])[" + numButton + "]");
        driver.findElement(bettingTipsButton).click();
        return this;
    }

    public FootballCategoryPage allOddsButtonClick () {
        driver.findElement(allOddsButton).click();
        return this;
    }

    public FootballCategoryPage inPlayBetButtonClick () {
        driver.findElement(inPlayBetButton).click();
        return this;
    }

    public boolean allOddsCheck () {
        return elementVisibleCheck(allOddsChecker);
    }

    public boolean inPlayBetCheck () {
        return elementVisibleCheck(inPlayBetChecker);
    }

}
