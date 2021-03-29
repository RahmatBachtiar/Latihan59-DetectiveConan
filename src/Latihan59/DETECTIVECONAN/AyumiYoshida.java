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
public class AyumiYoshida extends TokohUtama {

    public AyumiYoshida() {
        this.nama  = "Ayumi Yoshida";
        this.sifat = "Baik hati dan murah senyum";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah teman Conan yang ceria dan selalu menggunakan kata " +
                "\nyang membuat suasana tenang. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : - ");
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
