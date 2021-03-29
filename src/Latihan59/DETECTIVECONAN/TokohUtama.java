/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan59.DETECTIVECONAN;

/**
 *
 * @author 
 * NAMA     : Rahmat Bachtiar
 * KELAS    : FS112B-PBO
 * NIK      : 2022431598
 * Deskripsi Program	: Program ini berisi program untuk
 * mendeskripsikan tokoh yang ada pada gambar :
 * 1. Nama
 * 2. Sifat
 * 3. Kemampuan
 * 4. Kelemahan
 */
public class TokohUtama extends TokohDetectiveConan {
    private final String[] daftarTokoh = {"Shinichi Kudo","Ran Mouri","Kogoro Mouri"};

    public void daftarTokohUtama() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+1 + ". " + daftarTokoh[i]);
        }
    }

}
