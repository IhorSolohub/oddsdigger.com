package tests.tips;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reg.*;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static constants.Constant.Urls.TIPS_PAGE_URL;
import static org.testng.Assert.assertEquals;

public class TipsTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("tips");
        basePage.goToUrl(TIPS_PAGE_URL);
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
            basePage.back(TIPS_PAGE_URL);
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
            basePage.back(TIPS_PAGE_URL);
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
    public void regButtonInSidebarTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_REG_BUTTONS_IN_SIDEBAR_TIPS_PAGE; i++) {
            basePage.waitOneSeconds();
            if (i == 2) {basePage.closeSecondPopup();}
            tipsPage.regButtonInSidebarClick(i);
            basePage.nextTab();
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_REG_BUTTONS_IN_SIDEBAR_TIPS_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mostPopularOddsButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_MOST_POPULAR_ODDS_TIPS_PAGE; i++) {
            basePage.waitOneSeconds();
            tipsPage.mostPopularOddsButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(TIPS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_MOST_POPULAR_ODDS_TIPS_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void otherTipsButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_OTHER_TIPS_TIPS_PAGE; i++) {
            basePage.waitOneSeconds();
            tipsPage.otherTipsButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(TIPS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_OTHER_TIPS_TIPS_PAGE, goodTitlesCount);
    }

}
