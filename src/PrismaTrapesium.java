public class PrismaTrapesium extends Trapesium implements BangunRuang {
    private double tinggiPrisma;

    public PrismaTrapesium(double sisiA, double sisiB, double sisiC, double sisiD, double tinggiAlas, double tinggiPrisma) {
        super("Prisma Trapesium", sisiA, sisiB, sisiC, sisiD, tinggiAlas);
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