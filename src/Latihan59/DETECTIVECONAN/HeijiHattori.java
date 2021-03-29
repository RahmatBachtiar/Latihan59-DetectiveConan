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
public class HeijiHattori extends TokohUtama {

    public HeijiHattori() {
        this.nama  = "Heiji Hattori";
        this.sifat = "Pandai menganalisis";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah seorang detektif SMU dari Osaka. Ayahnya, " +
                "\n Heizo Hattoriadalah Inspektur kepolisian Osaka. Ia bercita-cita " +
                "\nmenjadi Detektif.  Heiji sering disebut Detektif Besar dari Barat, " +
                "\nsedangkan Shinichi disebut Detektif Agung dari Timur.");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : mengusut kasus-kasus yang rumit dan sulit.");
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
