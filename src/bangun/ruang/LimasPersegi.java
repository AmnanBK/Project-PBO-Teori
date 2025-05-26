package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.Persegi;

public class LimasPersegi extends Persegi implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasi;
    public double volume;
    public double luasPermukaan;

    public LimasPersegi(double sisi, double tinggiLimas, double tinggiSisiElevasi) {
        super("Limas Persegi", sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasi = tinggiSisiElevasi;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * super.luas * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * (0.5 * super.sisi * tinggiSisiElevasi) + super.luas;
    }

    private void updatePerhitungan() {
        this.luasPermukaan = hitungLuasPermukaan();
        this.volume = hitungVolume();
    }

    // Setters
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
        updatePerhitungan();
    }

    public void setTinggiSisiTegak(double tinggiSisiElevasi) {
        this.tinggiSisiElevasi = tinggiSisiElevasi;
        updatePerhitungan();
    }

    @Override
    public void setSisi(double sisi) {
        super.setSisi(sisi);
        updatePerhitungan();
    }
}