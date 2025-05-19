public class PrismaSegitiga extends Segitiga implements BangunRuang {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaSegitiga(double sisiA, double sisiB, double sisiC, double tinggiPrisma) {
        super("Prisma Segitiga", sisiA, sisiB, sisiC);
        this.tinggiPrisma = tinggiPrisma;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return getLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double kelilingAlas = getKeliling();
        double luasAlas = getLuas();
        double luasSelimut = kelilingAlas * tinggiPrisma;
        return 2 * luasAlas + luasSelimut;
    }

    private void updatePerhitungan() {
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    // Getter
    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
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