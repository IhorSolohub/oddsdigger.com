package tests.news;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static constants.Constant.Urls.NEWS_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NewsTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("news");
        basePage.goToUrl(NEWS_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void headerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(NEWS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void footerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(NEWS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mainLogoLinkTest () {
        basePage.closePopup();
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void otherNewsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_OTHER_NEWS_NEWS_PAGE; i++) {
            basePage.waitOneSeconds();
            newsPage.otherNewsClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(NEWS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_OTHER_NEWS_NEWS_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void moreNewsButtonTest () {
        basePage.closePopup();
        newsPage.moreNewsButtonClick();
        basePage.waitOneSeconds();
        assertTrue(newsPage.moreNewsButtonCheck());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mostPopularEventsButtonTest () {
        basePage.closePopup();
        newsPage.mostPopularEventsButtonClick();
        basePage.waitOneSeconds();
        assertTrue(newsPage.mostPopularEventsCheck());
    }

}
