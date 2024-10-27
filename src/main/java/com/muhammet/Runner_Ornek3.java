package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek3 {
    public static void main(String[] args) {
        int secim;
        String[] ogrenciler = new String[3];
        do {
            System.out.println("""
                    1- Öğrenci Ekleme(3 kişi)
                    2- Öğrenci Listeleme
                    0- ÇIKIŞ
                    """);
            System.out.print("lütfen seçiniz....: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1:
                    for(int i=0;i<ogrenciler.length;i++){
                        System.out.print(i+1+". öğrencinin adı soyadı....: ");
                        ogrenciler[i] = new Scanner(System.in).nextLine();
                    }
                    break;
                case 2:
                    System.out.println("""
                            **** Öğrenci Listesi ****
                            
                            """);
                    for(int i=0;i<ogrenciler.length;i++){
                        System.out.println(i+1+". Öğrenci...: "+ogrenciler[i]);
                    }
                    break;
                case 0:
                    System.out.println("Çıkış yapıldı.");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız"); break;
            }
        }while(secim!=0);

        System.out.println("UYGULAMA BİTTİİİİİ");
    }
}
