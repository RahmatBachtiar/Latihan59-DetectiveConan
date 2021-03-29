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
public class TokohPendukung extends TokohDetectiveConan {
    private final String[] daftarTokoh = {"Ayumi Yoshida","Mitsuhiko Tsuburaya","Genta Kojima",
            "Ai Haibara","Sumiko Kobayashi","Sonoko Suzuki","Heiji Hattori","Kazuha Toyama"};

    public void daftarTokohPendukung() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+4 + ". " + daftarTokoh[i]);
        }
    }

}
