package com.youtube.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaVideoPage extends PageObject {

    private final By LnkNombreVideo = By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']");

    public By getLnkNombreVideo() {
        return LnkNombreVideo;
    }
}
