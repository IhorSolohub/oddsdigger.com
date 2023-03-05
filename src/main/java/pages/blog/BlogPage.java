package pages.blog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {super(driver);}

    public BlogPage latestArticlesButtonsClick (int numButton) {
        By latestArticlesButtons = By.xpath("(//div[@class='c-card__headline'])[" + numButton + "]");
        driver.findElement(latestArticlesButtons).click();
        return this;
    }

}
