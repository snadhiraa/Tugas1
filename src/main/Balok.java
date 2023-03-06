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
public class Balok extends PersegiPanjang implements MenghitungBidang, MenghitungRuang {
    private int tinggi;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    @Override
    public double luas() {
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }
   
    @Override
    public double volume() {
        return panjang*lebar*getTinggi();
    }

    @Override
    public double luaspermukaan() {
        return 2*((panjang*lebar)+(lebar*getTinggi())+(panjang*getTinggi()));
    }

    //try{
    //    System.out.println("Input Panjang : ");
    //    hitung.panjang = input.nextInt();
    //    System.out.println("Input Lebar : ");
    //    hitung.lebar = input.nextInt();
    //}catch (Exception error){
    //    System.out.println("Errornya adalah " + error.getMessage());
    //}finally {
    //    System.out.println("selesai");
    //}


    
    
}