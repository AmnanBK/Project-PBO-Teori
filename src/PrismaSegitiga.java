public class PrismaSegitiga extends Segitiga implements BangunRuang {
    private double tinggiPrisma;

    public PrismaSegitiga(double sisiA, double sisiB, double sisiC, double tinggiPrisma) {
        super("Prisma Segitiga", sisiA, sisiB, sisiC);
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
