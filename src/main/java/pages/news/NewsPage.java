package pages.news;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

import static constants.Constant.Urls.NEWS_CATEGORY_URL;

public class NewsPage extends BasePage {

    public NewsPage(WebDriver driver) {super(driver);}

    private final By moreNewsButton = By.xpath("//a[@class='c-btn c-btn--link c-btn--sm u-fs-14']");
    private final By mostPopularEventsButton = By.xpath("//a[@class='c-btn c-btn--sm c-btn--warning-invert']");
    private final By mostPopularEventsChecker = By.xpath("//div[@class='c-accordion-item__headline']");

    public NewsPage otherNewsClick (int numButton) {
        By otherNews = By.xpath("(//div[@class='c-card__headline'])[" + numButton + "]");
        driver.findElement(otherNews).click();
        return this;
    }

    public NewsPage moreNewsButtonClick () {
        driver.findElement(moreNewsButton).click();
        return this;
    }

    public NewsPage mostPopularEventsButtonClick () {
        driver.findElement(mostPopularEventsButton).click();
        return this;
    }

    public boolean mostPopularEventsCheck () {
        return elementVisibleCheck(mostPopularEventsChecker);
    }

    public boolean moreNewsButtonCheck () {
        return getCurrentUrl().contains(NEWS_CATEGORY_URL);
    }
}
