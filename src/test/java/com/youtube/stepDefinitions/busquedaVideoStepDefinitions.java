package com.youtube.stepDefinitions;

import com.youtube.steps.InicioSteps;
import com.youtube.steps.ListaVideoSteps;
import com.youtube.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class busquedaVideoStepDefinitions {

    @Steps
    InicioSteps busquedaSteps;

    @Steps
    ListaVideoSteps lista;

    @Steps
    ValidacionSteps validacion;

    @Dado("que el usuario abre la pagina de youtube")
    public void queElUsuarioAbreLaPaginaDeYoutube() {
    busquedaSteps.abrirNavegador();
    }

    @Cuando("le da clic a un video")
    public void leDaClicAUnVideo() {
        busquedaSteps.buscarVideo();
        lista.selecionarVideo();
    }
    @Entonces("podra visualizar el titulo del video")
    public void podraVisualizarElTituloDelVideo() {
        validacion.validarNombre();
    }

}
