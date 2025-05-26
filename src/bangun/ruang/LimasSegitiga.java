package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.Segitiga;

public class LimasSegitiga extends Segitiga implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasiA;
    private double tinggiSisiElevasiB;
    private double tinggiSisiElevasiC;
    public double volume;
    public double luasPermukaan;

    public LimasSegitiga(double sisiA, double sisiB, double sisiC, double tinggiLimas, double tinggiSisiElevasiA, double tinggiSisiElevasiB, double tinggiSisiElevasiC) {
        super("Limas Segitiga", sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasiA = tinggiSisiElevasiA;
        this.tinggiSisiElevasiB = tinggiSisiElevasiB;
        this.tinggiSisiElevasiC = tinggiSisiElevasiC;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * super.luas * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasSisiElevasiA = 0.5 * super.sisiA * tinggiSisiElevasiA;
        double luasSisiElevasiB = 0.5 * super.sisiB * tinggiSisiElevasiB;
        double luasSisiElevasiC = 0.5 * super.sisiC * tinggiSisiElevasiC;
        return super.luas + luasSisiElevasiA + luasSisiElevasiB + luasSisiElevasiC;
    }

    private void updatePerhitungan() {
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    // Setters
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
        updatePerhitungan();
    }

    public void setTinggiSisiTegakA(double tinggiSisiElevasiA) {
        this.tinggiSisiElevasiA = tinggiSisiElevasiA;
        updatePerhitungan();
    }

    public void setTinggiSisiTegakB(double tinggiSisiElevasiB) {
        this.tinggiSisiElevasiB = tinggiSisiElevasiB;
        updatePerhitungan();
    }

    public void setTinggiSisiTegakC(double tinggiSisiElevasiC) {
        this.tinggiSisiElevasiC = tinggiSisiElevasiC;
        updatePerhitungan();
    }

    @Override
    public void setSisiA(double sisiA) {
        super.setSisiA(sisiA);
        updatePerhitungan();
    }

    @Override
    public void setSisiB(double sisiB) {
        super.setSisiB(sisiB);
        updatePerhitungan();
    }

    @Override
    public void setSisiC(double sisiC) {
        super.setSisiC(sisiC);
        updatePerhitungan();
    }
}