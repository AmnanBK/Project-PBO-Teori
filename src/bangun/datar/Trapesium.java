package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class Trapesium extends BentukGeometri implements BangunDatar {
    protected double sisiA; // salah satu sisi sejajar
    protected double sisiB; // sisi sejajar lainnya
    protected double sisiC;
    protected double sisiD;
    protected double tinggi;
    public double luas;
    public double keliling;

    public Trapesium(String nama, double sisiA, double sisiB, double sisiC, double sisiD, double tinggi) {
        super(nama);
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
        this.tinggi = tinggi;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return ((sisiA + sisiB) / 2) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC + sisiD;
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
        updatePerhitungan();
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
        updatePerhitungan();
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
        updatePerhitungan();
    }

    public void setSisiD(double sisiD) {
        this.sisiD = sisiD;
        updatePerhitungan();
    }
}