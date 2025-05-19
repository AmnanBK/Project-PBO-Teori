public class LimasPersegi extends Persegi implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegak;
    private double volume;
    private double luasPermukaan;

    public LimasPersegi(double sisi, double tinggiLimas, double tinggiSisiTegak) {
        super("Limas Persegi", sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak = tinggiSisiTegak;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * getLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * (0.5 * getSisi() * tinggiSisiTegak) + getLuas();
    }

    private void updatePerhitungan() {

        this.luasPermukaan = hitungLuasPermukaan();
        this.volume = hitungVolume();
    }

    // Getters
    public double getTinggiLimas() {
        return tinggiLimas;
    }

    public double getTinggiSisiTegak() {
        return tinggiSisiTegak;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    // Setters
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
        updatePerhitungan();
    }

    public void setTinggiSisiTegak(double tinggiSisiTegak) {
        this.tinggiSisiTegak = tinggiSisiTegak;
        updatePerhitungan();
    }

    @Override
    public void setSisi(double sisi) {
        super.setSisi(sisi);
        updatePerhitungan();
    }
}