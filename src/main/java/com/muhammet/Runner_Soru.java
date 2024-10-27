package com.muhammet;

import java.util.Scanner;

public class Runner_Soru {
    public static void main(String[] args) {
        /**
         * 4 adet değer alan int dizisi oluşturun ve 4 sayıyı
         * kullanıcıdan isteyip diziye atayan kodu yazınız.
         */
        // String ifade = "";
        int[] sayilar = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<sayilar.length;i++){
            System.out.print(i+1+" . sayıyı gir...: ");
            sayilar[i] = sc.nextInt();
        }
    }
}
