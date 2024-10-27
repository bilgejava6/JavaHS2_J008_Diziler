package com.muhammet;

import java.util.Scanner;

public class Runner_Soru2 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan kaç adet sayı girmesi gerektiğini alıp
         * girdiği sayıları bir diziye atıyoruz. sonra bu dizinin
         * içerisindeki sayıların;
         * 1- En büyük olanını
         * 2- En küçük olanını
         * 3- tüm sayıların ortalamasını bulup
         * ekrana yazdırıyoruz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen girmek istediğiniz sayı adediniz giriniz....: ");
        int adet = sc.nextInt();
        int[] sayilar = new int[adet];
        for(int i=0;i<adet;i++){
            System.out.print(i+1+". sayıyı giriniz....: ");
            sayilar[i] = sc.nextInt();
        }
        // en büyük sayı : {3,33,4,9,0,22}
        int enb = sayilar[0]; // 3
        int enk = sayilar[0]; // 3
        int ort, toplam=0;
        for(int i=0;i<adet;i++){
            if(enb<sayilar[i]) enb = sayilar[i];
            if(enk>sayilar[i]) enk = sayilar[i];
            toplam += sayilar[i];
        }
        System.out.println("En büyük sayı...: "+ enb);
        System.out.println("En küçük sayı...: "+ enk);
        ort = toplam / adet;
        System.out.println("ortalama.......: "+ ort);

    }
}
