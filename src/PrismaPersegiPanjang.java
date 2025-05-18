public class PrismaPersegiPanjang extends PersegiPanjang implements BangunRuang {
    private double tinggiPrisma;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super("Prisma Persegi Panjang", panjang, lebar);
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