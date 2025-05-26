package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class PersegiPanjang extends BentukGeometri implements BangunDatar {
    protected double panjang;
    protected double lebar;
    public double luas;
    public double keliling;

    public PersegiPanjang(String nama, double panjang, double lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setPanjang(double panjang) {
        this.panjang = panjang;
        updatePerhitungan();
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
        updatePerhitungan();
    }
}