package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.Persegi;

public class PrismaPersegi extends Persegi implements BangunRuang {
    private double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super("Prisma bangun.datar.Persegi", sisi);
        this.tinggiPrisma = tinggiPrisma;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return super.luas * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double kelilingAlas = super.keliling;
        double luasAlas = super.luas;
        double luasSelimut = kelilingAlas * tinggiPrisma;
        return 2 * luasAlas + luasSelimut;
    }

    private void updatePerhitungan() {
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    // Setters
    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
        updatePerhitungan();
    }

    @Override
    public void setSisi(double sisi) {
        super.setSisi(sisi);
        updatePerhitungan();
    }
}