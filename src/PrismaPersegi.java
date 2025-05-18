public class PrismaPersegi extends Persegi implements BangunRuang {
    private double tinggiPrisma;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super("Prisma Persegi", sisi);
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
