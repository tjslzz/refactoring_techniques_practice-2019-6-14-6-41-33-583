package com.tws.refactoring.extract_variable;

public class BannerRender {
    private static final String MAC = "MAC";
    private static final String IE = "IE";
    String renderBanner(String platform, String browser) {
        return checkBannerValid(platform,browser)?"IE on Mac?":"banner";
    }

    private boolean checkBannerValid(String platform, String browser) {

        return (platform.toUpperCase().indexOf(MAC) > -1) &&
                (browser.toUpperCase().indexOf(IE) > -1);
    }
}
