package com.youtube.steps;

import com.youtube.page.ValidacionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionSteps {
    @Page
    ValidacionPage validacionPage;

    @Step("Validar titulo video")
    public void validarNombre(){
        Assert.assertTrue(
                validacionPage.getDriver().findElement(
                        validacionPage.getTxt_titulo()
                ).isDisplayed()
        );
    }
}
