public class PrismaJajarGenjang extends JajarGenjang implements BangunRuang {
    private double tinggiPrisma;

    public PrismaJajarGenjang(double sisiA, double sisiB, double tinggiAlas, double tinggiPrisma) {
        super("Prisma Jajar Genjang", sisiA, sisiB, tinggiAlas);
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