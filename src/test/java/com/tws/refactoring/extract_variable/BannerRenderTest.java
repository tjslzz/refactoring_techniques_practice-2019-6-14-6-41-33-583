package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_banner_when_call_renderBanner_given_ABC_EFD() {
        BannerRender bannerRender = new BannerRender();
        String result = bannerRender.renderBanner("ABC", "EFD");
        assertEquals("banner", result);
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_ABC_IE() {
        BannerRender bannerRender = new BannerRender();
        String result = bannerRender.renderBanner("ABC", "IE");
        assertEquals("banner", result);
    }

    @Test
    public void should_return_IE_on_Mac_when_call_renderBanner_given_MAC_IE() {
        BannerRender bannerRender = new BannerRender();
        String result = bannerRender.renderBanner("MAC", "IE");
        assertEquals("IE on Mac?", result);
    }
}