package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import pages.base.BasePage;
import pages.blogCategory.BlogCategoryPage;
import pages.main.MainPage;
import pages.newsCategory.NewsCategoryPage;
import pages.tipsCategory.TipsCategoryPage;
import tests.newsCategory.NewsCategoryTest;

public class BaseTest {

    public BasePage basePage;
    public MainPage mainPage;
    public TipsCategoryPage tipsCategoryPage;
    public NewsCategoryPage newsCategoryPage;
    public BlogCategoryPage blogCategoryPage;

    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
            case "tipsCategory" :
            case "newsCategory" :
            case "blogCategory" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "reviewCategory" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
            case "review" :
                driver = CommonActions.createDriver("CHROME", 640, 360);
                break;
            case "escort" :
                driver = CommonActions.createDriver("CHROME", 768, 1024);
                break;
            case "blog" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "sugarDaddies" :
                driver = CommonActions.createDriver("CHROME", 1024, 768);
                break;
            case "hookupApps" :
                driver = CommonActions.createDriver("CHROME", 375, 667);
                break;
            case "localHookup" :
                driver = CommonActions.createDriver("CHROME", 667, 375);
                break;
            case "contactUs" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
        }
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        tipsCategoryPage = new TipsCategoryPage(driver);
        newsCategoryPage = new NewsCategoryPage(driver);
        blogCategoryPage = new BlogCategoryPage(driver);
    }

    @AfterMethod
    public void clearCookiesAndExit () { basePage.clearCookiesAndLocalStorageAndClose(); }
}
