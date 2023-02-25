package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}
    private final By allOddsButton = By.xpath("(//a[@class='c-btn c-btn--secondary c-common-table__btn '])[1]");
    private final By inPlayBetButton = By.xpath("(//a[@class='c-btn c-btn--secondary c-common-table__btn c-btn--primary'])[1]");
    private final By allOddsChecker = By.xpath("//div[@class='c-event-board__cell']");

    private final By inPlayBetChecker = By.xpath("//div[@class='c-accordion-item__headline']");

    public MainPage regButtonOnBannersClick (int numButton) {
        By regButtonOnBanners = By.xpath("(//a[@class='c-btn c-btn--main c-banner__btn'])[" + numButton + "]");
        driver.findElement(regButtonOnBanners).click();
        return this;
    }

    public MainPage regButtonsOnMiniBannersClick (int numButton) {
        By regButtonsOnMiniBanners = By.xpath("(//a[@class='c-btn c-btn--secondary c-bookmaker__btn'])[" + numButton + "]");
        driver.findElement(regButtonsOnMiniBanners).click();
        return this;
    }

    public MainPage bettingTipsButtonClick (int numButton) {
        By bettingTipsButton = By.xpath("(//a[@class='c-tip__title'])[" + numButton + "]");
        driver.findElement(bettingTipsButton).click();
        return this;
    }

    public MainPage newsButtonClick (int numButton) {
        By newsButton = By.xpath("(//a[@class='c-news__title'])[" + numButton + "]");
        driver.findElement(newsButton).click();
        return this;
    }

    public MainPage showMoreTipsAndNewsClick (int numButton) {
        By newsButton = By.xpath("(//a[@class='c-btn c-btn--link c-btn--link-arrow u-fs-14'])[" + numButton + "]");
        driver.findElement(newsButton).click();
        return this;
    }

    public MainPage regButtonsOnTextClick (int numButton) {
        By regButtonsOnText = By.xpath("(//table[@class='c-table-list w-gap w-gap--X6']//a)[" + numButton + "]");
        driver.findElement(regButtonsOnText).click();
        return this;
    }

    public MainPage allOddsButtonClick () {
        driver.findElement(allOddsButton).click();
        return this;
    }

    public MainPage inPlayBetButtonClick () {
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
