package Aıbu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //kullancı islemleri
        Scanner scanner=new Scanner(System.in);
        System.out.println("Orijinal Metni giriniz: ");
        String orijinalMetin = scanner.nextLine();
        System.out.println("Lütfen anahtari giriniz: ");
        String anahtar=scanner.nextLine();

        //Ceaser islemleri
        Ceaser ceaser=new Ceaser();
        System.out.println("CEASER ");
        System.out.println("**********************");
        System.out.println("Orijinal Metin : " +orijinalMetin);
        System.out.println("Anahtar  : " +anahtar);
        //encrypt
        String sifrelimetin=ceaser.encrypt(orijinalMetin,anahtar);
        System.out.println("Anahtar  : " +anahtar);
        System.out.println("Sifreli Metin: " +sifrelimetin);
        //decrypt
        ceaser.decrypt(anahtar,sifrelimetin);
        System.out.println("**********************");


        //Vigenere islemleri
        Vigenere vigenere=new Vigenere();
        System.out.println("VIGENERE ");
        System.out.println("**********************");
        System.out.println("Orijinal Metin : " +orijinalMetin);
        System.out.println("Anahtar  : " +anahtar);
        //encrypt
        String sifreliMetin=vigenere.encrypt(orijinalMetin,anahtar);
        System.out.println("**********************");
        System.out.println("Sifreli Metin: " +sifreliMetin);
       //decrypt
        vigenere.decrypt(anahtar,sifreliMetin);
        System.out.println("Anahtar  : " +anahtar);


    }
}
