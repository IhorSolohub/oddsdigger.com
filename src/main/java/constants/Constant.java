package constants;

import java.util.Arrays;
import java.util.List;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls {
        public static final String MAIN_PAGE_URL = "https://oddsdigger.com/";
    }

    public static class Header {
        public static final List<String> HEADER_TITLES = Arrays.asList(
                "Free Sports Betting Tips and Daily Expert Predictions",
                "Sports News",
                "Sports Betting"
        );
        public static final int NUMBER_OF_GOOD_HEADER_BUTTONS = 3;

        public static final List<String> LANGUAGE_URLS = Arrays.asList(
                "/fr/",
                "/de/",
                "/it/",
                "/es/",
                "/pl/",
                "/cs/",
                "/nl/",
                "/tr/",
                "/ro/",
                "/no/"
        );
        public static final int MAX_AMOUNT_LANGUAGE_CHANGE_BUTTONS = 7;
    }

    public static class Footer {
        public static final List<String> FOOTER_TITLES = Arrays.asList(
                "Football Betting Odds",
                "Basketball Betting Odds Comparison",
                "American Football Betting Odds Comparison",
                "Tennis Betting Odds Comparison",
                "Rugby Union Betting Odds Comparison",
                "E-Sports Betting Odds Comparison",
                "Cricket Betting Odds Comparison",
                "FA Cup - Football Betting Odds",
                "Six Nations Championship Betting Odds Comparison",
                "UEFA Europa Conference League - Football Betting Odds",
                "UEFA Champions League - Football Betting Odds",
                "Betting Tips For the Cheltenham Festival",
                "World Baseball Classic Betting Odds Comparison",
                "Betfred Sports",
                "DrBet Casino",
                "Unibet - Online Betting and Live Betting",
                "Claim your Sports Welcome Bonus!",
                "Betway",
                "Best Online Casino",
                "resources.ttrpartners.com",
                "Free Football Tips, Predictions and Betting Advice",
                "Free Basketball Betting Tips and Hot Daily Predictions",
                "Free American Football Betting Tips and Hot Daily Predictions Online",
                "Tennis Betting Tips & Predictions",
                "Free Rugby Union Betting Tips and Hot Daily Predictions Online",
                "Free E-Sports Betting Tips and Hot Daily Predictions Online",
                "Free Cricket Betting Tips and Hot Daily Predictions Online",
                "OddsDigger's Betting Guidelines",
                "OddsDigger's Betting Terminology",
                "OddsDigger - Privacy Policy",
                "OddsDigger's Terms & Conditions",
                "OddsDigger - Cookies",
                "Responsible Betting at OddsDigger",
                "OddsDigger - About Us"
        );
        public static final int NUMBER_OF_GOOD_FOOTER_BUTTONS = 34;
    }

    public static class Reg {
        public static final List<String> REG_TITLES = Arrays.asList(
                "Betsson",
                "Claim your Sports Welcome Bonus!",
                "Betfred Sports",
                "Unibet",
                "Entain Partners",
                "Start Your Mr Green Journey, Play LIVE Monopoly with a 100% Deposit Match",
                "Online Betting Site"
        );
        public static final int NUMBER_OF_REG_BUTTONS_ON_BANNERS_MAIN_PAGE = 2;
        public static final int NUMBER_OF_REG_BUTTONS_ON_MINI_BANNERS_MAIN_PAGE = 3;
        public static final int NUMBER_OF_REG_BUTTONS_ON_TEXT_MAIN_PAGE = 8;
    }

    public static class Reviews {

        public static final List<String> REVIEW_TITLES = Arrays.asList(
                "Review",
                "Betting Tips For The US OPEN",
                "Austrian Darts Open Betting Tips",
                "Betting Tips For the Cheltenham Festival",
                "Cheltenham Festival",
                "Rugby assessment",
                "Djokovic's return to the Australian Open",
                "Free Sports Betting Tips and Daily Expert Predictions",
                "Sports News"
        );
        public static final List<String> AUTHORS_TITLES = Arrays.asList(
                "Samantha"
        );
        public static final List<String> CITIES_TITLES = Arrays.asList(
                "Tanner"
        );
        public static final int NUMBER_OF_BETTING_TIPS_MAIN_PAGE = 3;
        public static final int NUMBER_OF_NEWS_MAIN_PAGE = 3;
        public static final int NUMBER_OF_SHOW_MORE_TIPS_AND_NEWS_MAIN_PAGE = 2;
    }

    public static class Common {
        public static final int NUMBER_OF_FAQ_COLLAPSE_BUTTONS = 4;
    }

    public static class CommentForm {
        public static final String NAME = "TestTest123";
        public static final String EMAIL = "testtest123@gmail.com";
        public static final String SUBJECT = "TestTest123";
        public static final String COMMENT = "TesttestTesttest123";
        public static final String EMPTY = "";
        public static final int NUMBER_OF_ERROR_MESSAGE = 3;
    }
}
