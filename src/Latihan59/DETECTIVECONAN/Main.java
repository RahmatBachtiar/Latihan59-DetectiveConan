/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan59.DETECTIVECONAN;

import java.util.Scanner;

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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        int pilihKategori;
        int pilihTokoh;
        char lagi;

            TokohDetectiveConan tokohDC = new TokohDetectiveConan();
            TokohUtama tokohUtama = new TokohUtama();
            TokohPendukung tokohPendukung = new TokohPendukung();


        do {
            tokohDC.daftarKategoriTokoh();
            System.out.println("Pilih nomor kategori : ");
            pilihKategori = scn1.nextInt();

                pilihTokoh = 0;
                if (pilihKategori == 1){
                    tokohUtama.daftarTokohUtama();
                    System.out.println("Pilih nomor tokoh : ");
                    pilihTokoh = scn2.nextInt();
                }
                else if (pilihKategori == 2) {
                    tokohPendukung.daftarTokohPendukung();
                    System.out.println("Pilih nomor tokoh : ");
                    pilihTokoh = scn3.nextInt();
                }
                else {
                    System.out.println(" ");
                }

            switch (pilihTokoh) {
                case 1:
                    ShinichiKudo shiKud = new ShinichiKudo();
                    shiKud.tampilDataTokoh();
                    break;
                case 2:
                    RanMouri ranMou = new RanMouri();
                    ranMou.tampilDataTokoh();
                    break;
                case 3:
                    KogoroMouri kogMou = new KogoroMouri();
                    kogMou.tampilDataTokoh();
                    break;
                case 4:
                    AyumiYoshida ayuYos = new AyumiYoshida();
                    ayuYos.tampilDataTokoh();
                    break;
                case 5:
                    MitsuhikoTsuburaya mitTsu = new MitsuhikoTsuburaya();
                    mitTsu.tampilDataTokoh();
                    break;
                case 6:
                    GentaKojima genKoj = new GentaKojima();
                    genKoj.tampilDataTokoh();
                    break;
                case 7:
                    AiHaibara aiHai = new AiHaibara();
                    aiHai.tampilDataTokoh();
                    break;
                case 8:
                    SumikoKobayashi sumKob = new SumikoKobayashi();
                    sumKob.tampilDataTokoh();
                    break;
                case 9:
                    SonokoSuzuki sonSuz = new SonokoSuzuki();
                    sonSuz.tampilDataTokoh();
                    break;
                case 10:
                    HeijiHattori heiHat = new HeijiHattori();
                    heiHat.tampilDataTokoh();
                    break;
                case 11:
                    KazuhaToyama kazToy = new KazuhaToyama();
                    kazToy.tampilDataTokoh();
                    break;
                default:
                    System.out.println("Nomor yang Anda pilih belum tersedia");
                    break;
            }

            System.out.println("Lagi (y/n)? : ");
            lagi = scn4.next().charAt(0);
            System.out.println(" ");

        }while (lagi != 'n');
    }
}
