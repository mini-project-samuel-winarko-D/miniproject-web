package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.AltaLoginPage;
import starter.helpers.AltaRegisterPage;
import starter.helpers.DoAction;
import starter.helpers.NavigateTo;

public class AltaShopStepDefinitions extends UIInteractions {
    @Given("{actor} menuju halaman Login AltaShop")
    public void userMenujuHalamanLoginAltaShop(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopLoginPage());
    }

    @And("{actor} memasukkan email yang salah {string}")
    public void userMemasukkanEmailYangSalah(Actor actor, String string) {
        actor.attemptsTo(DoAction.fillUsernameField(string));
    }

    @And("{actor} memasukkan password yang salah {string}")
    public void userMemasukkanPasswordYangSalah(Actor actor, String string) {
        actor.attemptsTo(DoAction.fillPasswordField(string));
    }
    @And("{actor} menekan tombol Login")
    public void userMenekanTombolLogin(Actor actor) {
        actor.attemptsTo(DoAction.clickLoginButton());
    }

    @Then("{actor} gagal melakukan login dan masih dalam halaman login")
    public void userGagalMelakukanLoginDanMasihDalamHalamanLogin(Actor actor) {
        actor.attemptsTo(Ensure.that(AltaLoginPage.ERROR_EMAIL_LABEL).hasText("record not found"));
    }

    @Given("{actor} menuju halaman registrasi AltaShop")
    public void userMenujuHalamanRegistrasiAltaShop(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopRegisterPage());
    }

    @And("{actor} memasukkan nama lengkap {string}")
    public void userMemasukkanNamaLengkap(Actor actor, String string) {
        actor.attemptsTo(DoAction.fillUsernameFieldRegister(string));
    }

    @And("{actor} memasukkan email {string}")
    public void userMemasukkanEmail(Actor actor, String string) {
        actor.attemptsTo(DoAction.fillEmailFieldRegister(string));
    }

    @And("{actor} memasukkan password {string}")
    public void userMemasukkanPassword(Actor actor, String string) {
        actor.attemptsTo(DoAction.fillPasswordFieldRegister(string));
    }

    @And("{actor} menekan tombol register")
    public void userMenekanTombolRegister(Actor actor) {
        actor.attemptsTo(DoAction.clickRegisterButton());
    }

    @Then("{actor} menuju halaman login")
    public void userMenujuHalamanLogin(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopLoginPage());
    }

    @Then("{actor} menuju halaman utama dari AltaShop")
    public void userMenujuHalamanUtamaDariAltaShop(Actor actor) {
    }

    @Then("user gagal melakukan registrasi dan masih pada halaman registrasi")
    public void userGagalMelakukanRegistrasiDanMasihPadaHalamanRegistrasi(Actor actor) {
        actor.attemptsTo(Ensure.that(AltaRegisterPage.ERROR_REGISTER).hasText("ERROR"));
    }

    @Given("{actor} is on alta shop page")
    public void userIsOnAltaShopPage(Actor actor) {
    }

    @And("{actor} memilih produk dan menekan tombol beli")
    public void userMemilihProdukDanMenekanTombolBeli(Actor actor) {
        actor.attemptsTo(DoAction.clickBeliButton());
    }

    @And("{actor} menekan tombol keranjang")
    public void userMenekanTombolKeranjang(Actor actor) {
        actor.attemptsTo(DoAction.clickKeranjangButton());
    }

    @Then("{actor} menuju halaman berisi produk yang telah ditambahkan ke keranjang")
    public void userMenujuHalamanBerisiProdukYangTelahDitambahkanKeKeranjang(Actor actor) {
    }

    @And("{actor} menekan tombol bayar")
    public void userMenekanTombolBayar(Actor actor) {
        actor.attemptsTo(DoAction.clickBayarButton());
    }

    @Then("{actor} menuju halaman berisi total transaksi dari produk yang ingin dibeli")
    public void userMenujuHalamanBerisiTotalTransaksiDariProdukYangInginDibeli(Actor actor) {
    }

}
