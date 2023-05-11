package starter.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://alta-shop.vercel.app/auth/login")
public class AltaLoginPage  extends PageObject {
    public static Target USERNAME_FIELD = Target.the("username field").locatedBy("//*[@ID=\"input-12\"]");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("//*[@ID=\"input-18\"]");
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("//*[@ID=\"input-24\"]");
    public static Target ERROR_EMAIL_LABEL = Target.the("error invalid email").locatedBy("//div[contains(@class, 'v-alert__content')]");
}
