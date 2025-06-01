package bangun.datar;

import bangun.dasar.BangunDatar;
import bangun.dasar.BentukGeometri;

public class LayangLayang extends BentukGeometri implements BangunDatar {
    protected double diagonalPanjang;
    protected double diagonalPendek;
    protected double sisiPanjang;
    protected double sisiPendek;
    public double luas;
    public double keliling;


    public LayangLayang(String nama, double diagonalPanjang, double diagonalPendek, double sisiPanjang, double sisiPendek) {
        super(nama);
        this.diagonalPanjang = diagonalPanjang;
        this.diagonalPendek = diagonalPendek;
        this.sisiPanjang = sisiPanjang;
        this.sisiPendek = sisiPendek;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonalPanjang * diagonalPendek;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiPanjang + sisiPendek);
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setdiagonalPanjang(double diagonalPanjang) {
        this.diagonalPanjang = diagonalPanjang;
        updatePerhitungan();
    }

    public void setDiagonalPendek(double diagonalPendek) {
        this.diagonalPendek = diagonalPendek;
        updatePerhitungan();
    }

    public void setSisiPanjang(double sisiPanjang) {
        this.sisiPanjang = sisiPanjang;
        updatePerhitungan();
    }

    public void setSisiPendek(double sisiPendek) {
        this.sisiPendek = sisiPendek;
        updatePerhitungan();
    }
}