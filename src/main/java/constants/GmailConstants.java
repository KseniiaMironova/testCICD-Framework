package constants;

public class GmailConstants {

    private static final String LOGIN_PAGE_URL = "https://accounts.google.com/ServiceLogin";
    private static final String MYACCOUNT_PAGE_URL = "https://myaccount.google.com/?utm_source=sign_in_no_continue&pli=1";

    public static String getMAIN_PAGE_URL() {
        return LOGIN_PAGE_URL;
    }

    public static String getMYACCOUNT_PAGE_URL() {
        return MYACCOUNT_PAGE_URL;
    }
}
