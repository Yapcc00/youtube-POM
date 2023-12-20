package com.youtube.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {

    public By getBarraBusqueda() {
        return barraBusqueda;
    }

    private final By barraBusqueda = By.xpath("//input[@id='search']");

    public By getBtn_busqueda() {
        return btn_busqueda;
    }

    private final By btn_busqueda = By.xpath("//button[@id='search-icon-legacy']");
}
