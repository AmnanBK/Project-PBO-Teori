package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class JajarGenjang extends BentukGeometri implements BangunDatar {
    protected double sisiDatar;
    protected double sisiMiring;
    protected double tinggi;
    public double luas;
    public double keliling;

    public JajarGenjang(String nama, double sisiDatar, double sisiMiring, double tinggi) {
        super(nama);
        this.sisiDatar = sisiDatar;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return sisiDatar * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiDatar + sisiMiring);
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setSisiDatar(double sisiDatar) {
        this.sisiDatar = sisiDatar;
        updatePerhitungan();
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
        updatePerhitungan();
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        updatePerhitungan();
    }
}