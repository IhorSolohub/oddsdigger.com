package tests.footballCategory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.FOOTBALL_CATEGORY_URL;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FootballCategoryTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("footballCategory");
        basePage.goToUrl(FOOTBALL_CATEGORY_URL);
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
            basePage.back(FOOTBALL_CATEGORY_URL);
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
            basePage.back(FOOTBALL_CATEGORY_URL);
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
    public void bettingTipsButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_BETTING_TIPS_FOOTBALL_CATEGORY; i++) {
            basePage.waitOneSeconds();
            footballCategoryPage.bettingTipsButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_BETTING_TIPS_FOOTBALL_CATEGORY, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void allOddsButtonTest () {
        basePage.closePopup();
        footballCategoryPage.allOddsButtonClick();
        basePage.waitOneSeconds();
        assertTrue(footballCategoryPage.allOddsCheck());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void inPlayBetButtonTest () {
        basePage.closePopup();
        footballCategoryPage.inPlayBetButtonClick();
        basePage.waitOneSeconds();
        assertTrue(footballCategoryPage.inPlayBetCheck());
    }

}
