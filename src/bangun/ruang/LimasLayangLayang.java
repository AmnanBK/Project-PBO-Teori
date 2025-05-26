package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.LayangLayang;

public class LimasLayangLayang extends LayangLayang implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasiPanjang;
    private double tinggiSisiElevasiPendek;
    public double volume;
    public double luasPermukaan;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisiA, double sisiB, double tinggiLimas, double tinggiSisiElevasiPanjang, double tinggiSisiElevasiPendek) {
        super("Limas Layang-Layang", diagonal1, diagonal2, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasiPanjang = tinggiSisiElevasiPanjang;
        this.tinggiSisiElevasiPendek = tinggiSisiElevasiPendek;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();

        double luasSisiElevasiPanjang = 0.5 * sisiPanjang * tinggiSisiElevasiPanjang * 2;
        double luasSisiElevasiPendek = 0.5 * sisiPendek * tinggiSisiElevasiPendek * 2;

        double luasSisiElevasiTotal = luasSisiElevasiPanjang + luasSisiElevasiPendek;

        return luasAlas + luasSisiElevasiTotal;
    }
}