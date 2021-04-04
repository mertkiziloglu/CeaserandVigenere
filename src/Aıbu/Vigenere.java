package Aıbu;

import java.security.Key;

public class Vigenere extends Cipher{
    @Override
    String encrypt(String orijinalMetin, String anahtar) {
        String EMessage = "";
        orijinalMetin = orijinalMetin.toUpperCase();
        anahtar = anahtar.toUpperCase();
        for (int i = 0, j = 0; i < orijinalMetin.length(); i++) {
            char letter = orijinalMetin.charAt(i);
            EMessage += (char)(((letter - 65) + (anahtar.charAt(j)-65)) % 26 + 65);
            j = ++j % anahtar.length();
        }
        System.out.println("SIFRELI METIN: "+ EMessage);
        return EMessage;
    }

    @Override
    String decrypt(String anahtar, String sifreliMetin) {
        String res = "";
        sifreliMetin = sifreliMetin.toUpperCase();
        anahtar = anahtar.toUpperCase();

        for (int i = 0, j = 0; i < sifreliMetin.length(); i++) {
            char letter = sifreliMetin.charAt(i);
            res += (char) ((((letter - anahtar.charAt(j)) + 26) % 26 )+ 'A');
            j = ++j % anahtar.length();
        }
        System.out.println("Orijinal Metin: "+res);
        return res;
}
}
