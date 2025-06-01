package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class BelahKetupat extends BentukGeometri implements BangunDatar {
    protected double sisi;
    protected double diagonal1;
    protected double diagonal2;
    public double luas;
    public double keliling;

    public BelahKetupat(String nama, double sisi, double diagonal1, double diagonal2) {
        super(nama);
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
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
    public void setsisi(double sisi) {
        this.sisi = sisi;
        updatePerhitungan();
    }

    public void setdiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
        updatePerhitungan();
    }

    public void setdiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
        updatePerhitungan();
    }
}
