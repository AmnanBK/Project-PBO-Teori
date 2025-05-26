package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasiPanjang;
    private double tinggiSisiElevasiLebar;
    public double volume;
    public double luasPermukaan;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas, double tinggiSisiElevasiPanjang, double tinggiSisiElevasiLebar) {
        super("Limas bangun.datar.Persegi Panjang", panjang, lebar);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasiPanjang = tinggiSisiElevasiPanjang;
        this.tinggiSisiElevasiLebar = tinggiSisiElevasiLebar;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double sisiPanjang = super.panjang;
        double sisiLebar = super.lebar;

        double luasSisiTegakPanjang = 2 * (0.5 * sisiLebar * tinggiSisiElevasiLebar);
        double luasSisiTegakLebar = 2 * (0.5 * sisiPanjang * tinggiSisiElevasiPanjang);

        return luasAlas + luasSisiTegakPanjang + luasSisiTegakLebar;
    }

    private void updatePerhitungan() {
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    // Setter
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
        updatePerhitungan();
    }

    public void setTinggiSisiElevasiPanjang(double tinggiSisiElevasiPanjang) {
        this.tinggiSisiElevasiPanjang = tinggiSisiElevasiPanjang;
        updatePerhitungan();
    }

    public void setTinggiSisiElevasiLebar(double tinggiSisiElevasiLebar) {
        this.tinggiSisiElevasiLebar = tinggiSisiElevasiLebar;
        updatePerhitungan();
    }

    @Override
    public void setPanjang(double panjang) {
        super.setPanjang(panjang);
        updatePerhitungan();
    }

    @Override
    public void setLebar(double lebar) {
        super.setLebar(lebar);
        updatePerhitungan();
    }
}
