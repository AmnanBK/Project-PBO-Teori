public class LimasPersegi extends Persegi implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegak;

    public LimasPersegi(double sisi, double tinggiLimas, double tinggiSisiTegak) {
        super("Limas Persegi", sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak = tinggiSisiTegak;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double luasSisiTegak = 4 * (0.5 * super.sisi * tinggiSisiTegak);
        return luasAlas + luasSisiTegak;
    }
}