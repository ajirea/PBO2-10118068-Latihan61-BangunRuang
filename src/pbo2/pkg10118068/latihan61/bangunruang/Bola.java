/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan61.bangunruang;

/**
 *	
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Membuat program dengan konsep abstraksi untuk menghitung
 * volume bangun ruang
 */
public class Bola extends BangunRuang {

    @Override
    public double hitungVolume() {
        return 4.0/3.0 * 22.0/7.0 * Math.pow(jariJari, 3);
    }
    
}
