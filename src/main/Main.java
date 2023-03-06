/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilih=0, ulang=0;
        
        do{
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.println("0. Exit");
        System.out.println("Pilih : ");
        pilih = input.nextInt();
            switch(pilih){
                case 1 : {
                    Balok balok = new Balok();
                    System.out.println("Input Panjang : ");
                    balok.panjang = input.nextInt();
                    System.out.println("Input Lebar : ");
                    balok.lebar = input.nextInt();
                    System.out.println("Input Tinggi : ");
                    balok.setTinggi(input.nextInt());
                    balok.luas();
                    System.out.println("Luas Persegi Panjang : " + balok.luas());
                    balok.keliling();
                    System.out.println("Keliling Persegi Panjang : " + balok.keliling());
                    balok.volume();
                    System.out.println("Volume Balok : " + balok.volume());
                    balok.luaspermukaan();
                    System.out.println("Luas Permukaan Balok : " + balok.luaspermukaan());
                    break;
                }
                case 2 : {
                    Tabung tabung = new Tabung();
                    System.out.println("Input Jari - jari : ");
                    tabung.jari = input.nextInt();
                    System.out.println("Input Tinggi : ");
                    tabung.setTinggi(input.nextInt());
                    tabung.luas();
                    System.out.println("Luas Lingkaran : " + tabung.luas());
                    tabung.keliling();
                    System.out.println("Keliling Lingkaran : " + tabung.keliling());
                    tabung.volume();
                    System.out.println("Volume Tabung : " + tabung.volume());
                    tabung.luaspermukaan();
                    System.out.println("Luas Permukaan Tabung : " + tabung.luaspermukaan());        
                    break;
                }
                default : {
                    System.out.println("== Exit ==");
                    break;
                }
            }
            System.out.println("Ulang? (ya: 1 || tidak: 0) : ");
            ulang = input.nextInt();
        }while(ulang==1);
    }
    
}
