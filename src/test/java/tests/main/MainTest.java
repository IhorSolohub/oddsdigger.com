package tests.main;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.*;
import static constants.Constant.Reg.*;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("main");
        basePage.goToUrl(MAIN_PAGE_URL);
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
            basePage.back(MAIN_PAGE_URL);
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
            basePage.back(MAIN_PAGE_URL);
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

    @Test
    public void regButtonOnBannersTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_REG_BUTTONS_ON_BANNERS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.regButtonOnBannersClick(i);
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_REG_BUTTONS_ON_BANNERS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void regButtonsOnMiniBannersTest () {
        basePage.closePopup();
        basePage.closeSecondPopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_REG_BUTTONS_ON_MINI_BANNERS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.regButtonsOnMiniBannersClick(i);
            basePage.nextTab();
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_REG_BUTTONS_ON_MINI_BANNERS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void bettingTipsButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_BETTING_TIPS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.bettingTipsButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_BETTING_TIPS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void newsButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_NEWS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.newsButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_NEWS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void showMoreTipsAndNewsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_SHOW_MORE_TIPS_AND_NEWS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.showMoreTipsAndNewsClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_SHOW_MORE_TIPS_AND_NEWS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void regButtonsOnTextTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_REG_BUTTONS_ON_TEXT_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.regButtonsOnTextClick(i);
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_REG_BUTTONS_ON_TEXT_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void allOddsButtonTest () {
        basePage.closePopup();
        mainPage.allOddsButtonClick();
        basePage.waitOneSeconds();
        assertTrue(mainPage.allOddsCheck());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void inPlayBetButtonTest () {
        basePage.closePopup();
        mainPage.inPlayBetButtonClick();
        basePage.waitOneSeconds();
        assertTrue(mainPage.inPlayBetCheck());
    }

}
