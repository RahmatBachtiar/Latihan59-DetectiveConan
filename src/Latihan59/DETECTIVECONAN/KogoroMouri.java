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
public class KogoroMouri extends TokohUtama {

    public KogoroMouri() {
        this.nama  = "Kogoro Mouri";
        this.sifat = "Menyukai sake, judi, dan gadis";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah Detektif Swasta di Kota Beika. Ia dikenal sebagai Kogoro " +
                "\nTidur karena ia menundukan kepala seolah tidur ditengah analisisnya. Ia dikenal   " +
                "\nsebagai orang yang disegani banyak orang. Ia juga adalah mantan Perwira Polisi. " +
                "\nIa merupakan bapak dari Ran Mouri. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Ahli Judo ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : - ");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
