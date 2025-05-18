public class PrismaBelahKetupat extends BelahKetupat implements BangunRuang {
    private double tinggiPrisma;

    public PrismaBelahKetupat(double sisi, double diagonal1, double diagonal2, double tinggiPrisma) {
        super("Prisma Belah Ketupat", sisi, diagonal1, diagonal2);
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