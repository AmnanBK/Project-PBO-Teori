public class PrismaPersegi extends Persegi implements BangunRuang {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super("Prisma Persegi", sisi);
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

    // Getters
    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    // Setters
    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
        updatePerhitungan();
    }

    @Override
    public void setSisi(double sisi) {
        super.setSisi(sisi);
        updatePerhitungan();
    }
}