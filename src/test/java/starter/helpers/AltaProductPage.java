package starter.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://alta-shop.vercel.app/")
public class AltaProductPage extends PageObject {

    public static Target BELI_BUTTON = Target.the("beli button").locatedBy("//button[contains(.,'Beli')]");
    public static Target KERANJANG_BUTTON = Target.the("keranjang button").locatedBy("//button[contains(.//i/@class,'fa-shopping-cart')]");
    public static Target BAYAR_BUTTON = Target.the("bayar button").locatedBy("//button[contains(.,'Bayar')]");

}
