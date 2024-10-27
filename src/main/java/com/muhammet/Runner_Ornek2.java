package com.muhammet;

public class Runner_Ornek2 {
    public static void main(String[] args) {
        int adet = 5;
        int[] sayilar2 = new int[adet]; // {0,0,0,0,0}
        sayilar2[0] = 5;
        sayilar2[1] = 9;
        sayilar2[2] = 12;
        sayilar2[3] = 0;
        sayilar2[4] = 3;
        /**
         * int toplam = 10;
         * int sayi = 6;
         * toplam = sayi; // sayi değerini toplama ata
         * toplam = toplam + sayi; //
         * toplam += sayi;
         */
        // bir dizi içindeki değerlerin toplamını bulalım
        // bir dizi new int[3] ya da {34,23,1} şeklinde tanımlanır.
        int[] sayilar = {5,9,12,0,3,98};
        int toplam=0;
        for(int i=0;i<sayilar.length;i++){
            toplam += sayilar[i];
        }
        System.out.println("toplam....: "+ toplam);
    }
}
