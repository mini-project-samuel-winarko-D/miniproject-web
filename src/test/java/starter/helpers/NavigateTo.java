package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theAltaShopLoginPage(){
        return Task.where( "{0} opens Alta shop login page", Open.browserOn().the(AltaLoginPage.class ) );
    }
    public static Performable theAltaShopRegisterPage(){
        return Task.where( "{0} opens Alta shop register page", Open.browserOn().the(AltaRegisterPage.class ) );
    }


}
