package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class Persegi extends BentukGeometri implements BangunDatar {
    protected double sisi;
    public double luas;
    public double keliling;

    public Persegi(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
        updatePerhitungan();
    }
}