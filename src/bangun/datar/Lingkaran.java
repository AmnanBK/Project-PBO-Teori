package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class Lingkaran extends BentukGeometri implements BangunDatar {
    protected double jariJari;
    public  double luas;
    public double keliling;

    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
        updatePerhitungan();
    }
}