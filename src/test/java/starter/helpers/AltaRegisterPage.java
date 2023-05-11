package starter.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.SearchContext;

import java.util.List;
import java.util.function.Function;

@DefaultUrl("https://alta-shop.vercel.app/auth/register")
public class AltaRegisterPage extends PageObject {

    public static Target USERNAME_FIELD = Target.the("username field").locatedBy("//*[@ID=\"input-29\"]");
    public static Target EMAIL_FIELD = Target.the( "email field" ).locatedBy("//*[@ID=\"input-35\"]");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("//*[@ID=\"input-41\"]");
    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("//button[contains(.,'Register')]");
    public static Target ERROR_REGISTER = Target.the("error key").locatedBy("//div[contains(@class, 'v-alert__content')]");

}
