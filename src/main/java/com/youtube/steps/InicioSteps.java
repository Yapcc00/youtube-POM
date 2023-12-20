package com.youtube.steps;

import com.youtube.page.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSteps {
    @Page
    InicioPage inicioPage;
    @Step("Abrir Navegador")
    public void abrirNavegador(){
        inicioPage.openUrl("https://www.youtube.com/");
    }

    @Step("Busqueda Video")
    public void buscarVideo(){
        inicioPage.getDriver().findElement(inicioPage.getBarraBusqueda())
                .sendKeys( "despacito");
        inicioPage.getDriver().findElement(inicioPage.getBtn_busqueda()).click();
        //no es recomendable utilizar este try catch para tomar una espera
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
