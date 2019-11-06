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
public class NilaiMhs {
    private double NA, quiz, UTS, UAS;
    private String ket;
    private char index;

    public double getNA() {
        return NA;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUTS() {
        return UTS;
    }

    public double getUAS() {
        return UAS;
    }

    public String getKet() {
        return ket;
    }

    public char getIndex() {
        return index;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public void setUTS(double UTS) {
        this.UTS = UTS;
    }

    public void setUAS(double UAS) {
        this.UAS = UAS;
    }
    
    public double hitungNA() {
        NA = 0.2*quiz+0.3*UTS+0.5*UAS;
        return NA;
    }
    
    public double indeksNilai() {
        if((80<NA)&&(NA<=100)){
            index = 'A';
        } else if((68<NA)&&(NA<=80)){
            index = 'B';
        } else if((56<NA)&&(NA<=68)){
            index = 'C';
        } else if((45<NA)&&(NA<=56)){
            index = 'D';
        } else if((0<NA)&&(NA<=45)){
            index = 'E';
        }
        return index;
    }
    
    public String ketNilai() {
        switch(index) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            case 'E':
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    }
    
    public void tampilHasil() {
        System.out.println("Quiz\t= " + quiz);
        System.out.println("UTS\t= " + UTS);
        System.out.println("UAS\t= " + UAS);
        System.out.println("\nNilai Akhir\t= " + NA);
        System.out.println("\nIndex = " + index);
        System.out.println("Keterangan = " + ket);
    }
}
