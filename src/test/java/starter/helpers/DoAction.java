package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class DoAction {
    public static Performable fillUsernameField(String username) {
        return Task.where( "{0} fill username field with " + username,
                Enter.theValue( username ).into(AltaLoginPage.USERNAME_FIELD )
        );
    }

    public static Performable fillPasswordField(String password) {
        return Task.where( "{0} fill password field with" + password,
                Enter.theValue( password ).into(AltaLoginPage.PASSWORD_FIELD )
        );
    }

    public static Performable clickLoginButton() {
        return Task.where( "{0} click login button",
                Click.on(AltaLoginPage.LOGIN_BUTTON ) );
    }

    public static Performable fillUsernameFieldRegister(String username) {
        return Task.where( "{0} fill full name field register with " + username,
                Enter.theValue( username ).into(AltaRegisterPage.USERNAME_FIELD )
        );
    }

    public static Performable fillEmailFieldRegister(String email) {
        return Task.where( "{0} fill email field register with " + email,
                Enter.theValue( email ).into(AltaRegisterPage.EMAIL_FIELD )
        );
    }

    public static Performable fillPasswordFieldRegister(String password) {
        return Task.where( "{0} fill password field register with" + password,
                Enter.theValue( password ).into(AltaRegisterPage.PASSWORD_FIELD )
        );
    }

    public static Performable clickRegisterButton() {
        return Task.where( "{0} click register button",
                Click.on(AltaRegisterPage.REGISTER_BUTTON ) );
    }

    public static Performable clickBeliButton() {
        return Task.where( "{0} click beli button",
                Click.on( AltaProductPage.BELI_BUTTON ) );
    }
    public static Performable clickKeranjangButton() {
        return Task.where( "{0} click keranjang button",
                Click.on( AltaProductPage.KERANJANG_BUTTON ) );
    }
    public static Performable clickBayarButton() {
        return Task.where("{0} click bayar button",
                Click.on(AltaProductPage.BAYAR_BUTTON));
    }

}
