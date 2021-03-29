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
public class MitsuhikoTsuburaya extends TokohUtama {

    public MitsuhikoTsuburaya() {
        this.nama  = "Mitsuhiko Tsuburaya";
        this.sifat = "Dewasa, suka bekerja sama, dan pandai";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah anggota grup detektif cilik. " +
                "\nCara bicaranya yang sopan adalah karena kedua orang tuanya adalah guru." +
                "\nDiam-diam, ia cemburu terhadap kedekatan Conan dan Ai. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Wawasan Tinggi ");
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
