package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.JajarGenjang;

public class LimasJajarGenjang extends JajarGenjang implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasiA;
    private double tinggiSisiElevasiB;

    public LimasJajarGenjang(double sisiA, double sisiB, double tinggiAlas, double tinggiLimas, double tinggiSisiElevasiA, double tinggiSisiElevasiB) {
        super("Limas Jajar Genjang", sisiA, sisiB, tinggiAlas);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasiA = tinggiSisiElevasiA;
        this.tinggiSisiElevasiB = tinggiSisiElevasiB;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();

        double luasSisiTegakSisiA = 2 * (0.5 * sisiDatar * tinggiSisiElevasiA);
        double luasSisiTegakSisiB = 2 * (0.5 * sisiMiring * tinggiSisiElevasiB);

        return luasAlas + luasSisiTegakSisiA + luasSisiTegakSisiB;
    }
}