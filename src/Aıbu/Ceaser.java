package Aıbu;

public class Ceaser extends Cipher {
    String orijinalMetin, sonmetin = "",decryptedMessage = "";

    @Override
    String encrypt(String orijinalMetin, String anahtar) {
        String encrypMsj = "";
        orijinalMetin = orijinalMetin.toUpperCase();
        anahtar = anahtar.toUpperCase();

       int key=anahtar.length();

        for (int i = 0; i < orijinalMetin.length(); i++) {
            if ((int)orijinalMetin.charAt(i) == 32){
                encrypMsj += (char)32;

            } else if ((int)orijinalMetin.charAt(i) + key > 122){
                int temp = ((int)orijinalMetin.charAt(i) + key) - 122;
                encrypMsj += (char)(96 + temp);

            } else if ((int)orijinalMetin.charAt(i) + key > 90 && (int)orijinalMetin.charAt(i) < 96){
                int temp = ((int)orijinalMetin.charAt(i) + key) - 90;
                encrypMsj += (char)(64+temp);

            } else {
                encrypMsj += (char)((int)orijinalMetin.charAt(i) + key);

            }
        }

        System.out.println("SIFRELI METIN: "+ encrypMsj);
        System.out.println("**********************");
        String sifrelimetin=encrypMsj;

        return encrypMsj;

    }
    private static int length(String anahtar) {
        return anahtar.length();
    }

    @Override
     String decrypt(String anahtar, String sifrelimetin) {
        String decrypMsg = "";
        int key=length(anahtar);
        for (int i = 0; i < sifrelimetin.length(); i++) {

            if((int) sifrelimetin.charAt(i) == 32){
                decrypMsg += (char)32;
            } else if (((int) sifrelimetin.charAt(i) - key) < 97 && ((int) sifrelimetin.charAt(i) - key) > 90) {
                int temp = ((int) sifrelimetin.charAt(i) - key) + 26;
                decrypMsg += (char)temp;
            } else if ((sifrelimetin.charAt(i) - key) < 65) {
                int temp = ((int) sifrelimetin.charAt(i) - key) + 26;
                decrypMsg += (char)temp;
            } else {
                decrypMsg += (char)((int) sifrelimetin.charAt(i) - key);
            }

        }
        String orijinalMetin=decrypMsg;
        System.out.println("Orijinal METIN : "+ decrypMsg);
        return decrypMsg;

    }
}