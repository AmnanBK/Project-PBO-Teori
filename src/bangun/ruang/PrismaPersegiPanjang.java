package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang implements BangunRuang {
    private double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super("Prisma bangun.datar.Persegi Panjang", panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double kelilingAlas = hitungKeliling();
        double luasAlas = hitungLuas();
        double luasSelimut = kelilingAlas * tinggiPrisma;
        return 2 * luasAlas + luasSelimut;
    }
}