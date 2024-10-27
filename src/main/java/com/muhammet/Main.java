package com.muhammet;

public class Main {
    public static void main(String[] args) {
        /**
         * Arrays - Diziler
         * Syntax: DataType[] DataName = new DataType[LENGTH];
         * örn:
         * String[] ifadeDizisi = new String[20];
         * int[] sayiDizisi = new int[5];
         * boolean[] durumlar = new boolean[3];
         * Diziden değer okumak,
         *  DataName[INDEX]
         * Dizinin elemanlarına değer atamak,
         * DataName[INDEX] = VALUE;
         * Dizinin sınırları içinde olmayan değerlere atma yapmak ya da okumak mümkünmü?
         * beklenmeyen hata oluşur örn;
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
         *
         *  Diziler oluşturulurken sabit genişlikle oluşturulur, bu nedenle sınrları genişlemez
         *  tekrardan boyutlandırılmaları gereklidir. Ancak, yeniden boyutlama dizinin
         *  sıfırlanmasına neden olur.
         *
         */
        // dizi tanımlama ve initialize(başlatmak - değer atamak) etmek.
        int[] sayiDizisi = new int[4];// {0,0,0,0} // {int,int,int,int}
        // dizi değişkeni tanımlamak
        int[] dizi;
        // değişkeni başlatmak. değer atamak
        dizi = new int[4];
        sayiDizisi[0] = 5; // sayı dizisi içindeki 0. indexli elemanın değerini 5 yap.
        System.out.println("Dizinin 1. Elamanı....: "+ sayiDizisi[0]);

        // System.out.println("4 elamanlı Dizinin 4. index ine erişmek....: "+ sayiDizisi[4]);
        // sayiDizisi[40] = 5;
        int sayi; // tanımlama
        sayi = 7; // initialize
        int toplam = sayi + 5;

        String[] isimler = new String[3]; // {String,String,String} - {null,null,null}
        isimler[0] = "Deniz";
        isimler[1] = "Demet";
        isimler[2] = "Derya";
        System.out.println("2. elaman...: "+ isimler[1]); // Demet
        String[] geciciDizi = isimler;
        isimler = new String[4]; // dizi sıfırlanır.
        isimler[0] = geciciDizi[0];
        isimler[1] = geciciDizi[1];
        isimler[2] = geciciDizi[2];
        System.out.println("2. elaman...: "+ isimler[1]); // null
        System.out.println(isimler);



    }
}