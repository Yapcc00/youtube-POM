package com.youtube.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionPage extends PageObject {
    public By getTxt_titulo() {
        return txt_titulo;
    }

    private final By txt_titulo = By.xpath("//h1[@class='style-scope ytd-watch-metadata']");
}
