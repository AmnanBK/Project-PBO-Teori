public class PrismaSegitiga extends Segitiga implements BangunRuang {
    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaan;

    public PrismaSegitiga(double sisiA, double sisiB, double sisiC, double tinggiPrisma) {
        super("Prisma Segitiga", sisiA, sisiB, sisiC);
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

    // Setter
    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
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