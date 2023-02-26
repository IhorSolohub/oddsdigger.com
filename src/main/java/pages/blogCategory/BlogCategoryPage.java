package pages.blogCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.newsCategory.NewsCategoryPage;

public class BlogCategoryPage extends BasePage {

    public BlogCategoryPage(WebDriver driver) {super(driver);}

    public BlogCategoryPage blogsButtonClick (int numButton) {
        By blogsButton = By.xpath("(//a[@class='c-card__headline'])[" + numButton + "]");
        driver.findElement(blogsButton).click();
        return this;
    }
}
