Feature: Memilih dan memasukkan produk kedalam keranjang, serta melihat total transaksi

  @MemilihProduk @NormalPositive
  Scenario: User memilih produk dan menekan tombol beli agar produk masuk kedalam keranjang
    Given user menuju halaman Login AltaShop
    And user memasukkan email "samuelwnrko@gmail.com"
    And user memasukkan password "samuel123"
    And user menekan tombol Login
    Then user menuju halaman utama dari AltaShop
    And user memilih produk dan menekan tombol beli
    And user menekan tombol keranjang
    Then user menuju halaman berisi produk yang telah ditambahkan ke keranjang

  @TotalTransaksi @NormalPositive
  Scenario: User melihat total transaksi
    Given user menuju halaman Login AltaShop
    And user memasukkan email "samuelwnrko@gmail.com"
    And user memasukkan password "samuel123"
    And user menekan tombol Login
    Then user menuju halaman utama dari AltaShop
    And user memilih produk dan menekan tombol beli
    And user menekan tombol keranjang
    Then user menuju halaman berisi produk yang telah ditambahkan ke keranjang
    And user menekan tombol bayar
    Then user menuju halaman berisi total transaksi dari produk yang ingin dibeli