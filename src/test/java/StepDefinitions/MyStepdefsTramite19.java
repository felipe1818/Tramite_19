package StepDefinitions;

import Functions.SeleniumFunctions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class MyStepdefsTramite19 {

    SeleniumFunctions functions = new SeleniumFunctions();


    @Dado("ingresar al ambiente")
    public void ingresarambiente() throws IOException {
        String URL = functions.ScenaryData.get("URLTramite19");
        //functions.navigateTo(URL);
        functions.switchToNewTab(URL, "Tramite19");
        functions.attachScreenShot();
    }

    @Dado("ingresa las credenciales email y contrasena del {string}")
    public void ingresarusuariocontrasena(String rol) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSendClearToElement("usuario");
        functions.iSetElementWithKeyValue("usuario", "correo" + rol);
        functions.iSendClearToElement("contrasena");
        functions.iSetElementWithKeyValue("contrasena", "contrasena" + rol);
        functions.iClicInElement("iniciarsesion");
        functions.attachScreenShot();
    }



}
