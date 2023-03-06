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
public class Tabung extends Lingkaran implements MenghitungBidang, MenghitungRuang{
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jari;
    }
   
    @Override
    public double volume() {
        return Math.PI*jari*jari*getTinggi();
    }

    @Override
    public double luaspermukaan() {
        return 2*Math.PI*jari*(jari+getTinggi());
    }
    
}
