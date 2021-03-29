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
public class RanMouri extends TokohUtama {

    public RanMouri() {
        this.nama  = "Ran Mouri";
        this.sifat = "Pengertian dan murah hati";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah teman Shinichi Kudo sejak kecil. Ran dan Shinichi tidak " +
                "\npernah berani mengungkapkan perasaannya. Ran adalah anak seorang detektif, Kogoro  " +
                "\nMouri, dan seorang pengacara handal, Eri Kisaki. Ran juga seorang yang mudah menangis. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Ahli Karate ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : takut hantu dan hewan tertentu");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
