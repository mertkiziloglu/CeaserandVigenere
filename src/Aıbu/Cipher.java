package Aıbu;

abstract class Cipher {
    abstract String encrypt(String orijinalMetin, String anahtar);
    abstract String decrypt(String anahtar, String sifrelimetin);
}
