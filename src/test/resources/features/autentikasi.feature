Feature: Autentikasi berupa register dan login pada web AltaShop

  @Registrasi @NormalPositive
    Scenario: User melakukan registrasi dengan mengisi nama lengkap, email, serta password
    Given user menuju halaman registrasi AltaShop
    And user memasukkan nama lengkap "someone"
    And user memasukkan email "someone@mail.com"
    And user memasukkan password "samuel123"
    And user menekan tombol register
    Then user menuju halaman login

  @Registrasi @NormalNegative @RegistrasiGagal
  Scenario: User melakukan registrasi dengan mengisi nama lengkap, email, serta password dengan angka "0"
    Given user menuju halaman registrasi AltaShop
    And user memasukkan nama lengkap "0"
    And user memasukkan email "0"
    And user memasukkan password "0"
    And user menekan tombol register
    Then user gagal melakukan registrasi dan masih pada halaman registrasi

  @Login @NormalPositive
  Scenario: User melakukan login dengan mengisi email dan password sesuai registrasi
    Given user menuju halaman Login AltaShop
    And user memasukkan email "samuelwnrko@gmail.com"
    And user memasukkan password "samuel123"
    And user menekan tombol Login
    Then user menuju halaman utama dari AltaShop

  @Login @NormalNegative @LoginGagal
  Scenario: User melakukan login dengan mengisi email dan password yang tidak sesuai registrasi
    Given user menuju halaman Login AltaShop
    And user memasukkan email yang salah "test@gmail.com"
    And user memasukkan password yang salah "test123"
    And user menekan tombol Login
    Then user gagal melakukan login dan masih dalam halaman login