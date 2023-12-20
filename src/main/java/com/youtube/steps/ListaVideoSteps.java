package com.youtube.steps;

import com.youtube.page.ListaVideoPage;
import com.youtube.utils.Espera;
import com.youtube.utils.SeleccionRandom;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class ListaVideoSteps {

    @Page
    ListaVideoPage lista;
    @Page
    Espera espera;

    @Step("Seleccion de video Aleatorio")
    public void selecionarVideo(){

        WebElement video= SeleccionRandom.seleccion(lista.getDriver(),
                lista.getLnkNombreVideo());
        video.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
