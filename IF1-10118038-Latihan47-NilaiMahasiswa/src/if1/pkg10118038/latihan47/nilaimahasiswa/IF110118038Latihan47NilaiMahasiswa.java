/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan47.nilaimahasiswa;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Nilai Mahasiswa
 */
public class IF110118038Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMhs nilai = new NilaiMhs();
        nilai.setQuiz(75);
        nilai.setUTS(45);
        nilai.setUAS(34);
        nilai.hitungNA();
        nilai.indeksNilai();
        nilai.ketNilai();
        nilai.tampilHasil();
        
    }
    
}
