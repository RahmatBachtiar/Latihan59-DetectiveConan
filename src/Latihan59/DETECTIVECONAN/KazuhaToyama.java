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
public class KazuhaToyama extends TokohUtama {

    public KazuhaToyama() {
        this.nama  = "Kazuha Toyama";
        this.sifat = "Baik hati dan suka menolong";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" Anak dariDetektif Toyama ini adalah teman sejak " +
                "\nkecilHeiji Hattori. Ia tinggal di Osaka dan ayahnya adalah seorang Polisi di Osaka. " +
                "\n Ia pernah secara tidak sengaja memborgol tangannya bersama dengan Heiji. " +
                "\nSehingga kemana-mana mereka terus bersama. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Aikido.");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : Hantu");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
