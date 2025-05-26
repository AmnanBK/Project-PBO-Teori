package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.Trapesium;

public class LimasTrapesium extends Trapesium implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasiA;
    private double tinggiSisiElevasiB;
    private double tinggiSisiElavasiC;
    private double tinggiSisiElevasiD;
    public double volume;
    public double luasPermukaan;

    public LimasTrapesium(double sisiA, double sisiB, double sisiC, double sisiD, double tinggiAlas, double tinggiLimas, double tinggiSisiElevasiA, double tinggiSisiElevasiB, double tinggiSisiElevasiC, double tinggiSisiElevasiD) {
        super("Limas bangun.datar.Trapesium", sisiA, sisiB, sisiC, sisiD, tinggiAlas);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasiA = tinggiSisiElevasiA;
        this.tinggiSisiElevasiB = tinggiSisiElevasiB;
        this.tinggiSisiElavasiC = tinggiSisiElevasiC;
        this.tinggiSisiElevasiD = tinggiSisiElevasiD;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();

        double luasSisiTegakA = 0.5 * sisiA * tinggiSisiElevasiA;
        double luasSisiTegakB = 0.5 * sisiB * tinggiSisiElevasiB;
        double luasSisiTegakC = 0.5 * sisiC * tinggiSisiElavasiC;
        double luasSisiTegakD = 0.5 * sisiD * tinggiSisiElevasiD;

        double luasSisiTegakTotal = luasSisiTegakA + luasSisiTegakB + luasSisiTegakC + luasSisiTegakD;

        return luasAlas + luasSisiTegakTotal;
    }
}