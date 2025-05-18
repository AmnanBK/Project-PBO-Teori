public class PrismaLayangLayang extends LayangLayang implements BangunRuang {
    private double tinggiPrisma;

    public PrismaLayangLayang(double diagonal1, double diagonal2, double sisiA, double sisiB, double tinggiPrisma) {
        super("Prisma Layang-Layang", diagonal1, diagonal2, sisiA, sisiB);
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