package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek {
    public static void main(String[] args) {
        /**
         * Dizi Tanımlama
         */
        int[] sayilar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı oluşturmak istersiniz...: ");
        int adet = sc.nextInt();
        sayilar = new int[adet];
        int sayi;

        for(int i=0;i<adet;i++){
            System.out.print((i+1)+". sayıyı gir....: ");
            sayi = sc.nextInt();
            sayilar[i] = sayi;
        }



        System.out.println("UYGULAMA BİTTİ.");
    }
}
