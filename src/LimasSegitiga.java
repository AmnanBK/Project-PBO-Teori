public class LimasSegitiga extends Segitiga implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakA;
    private double tinggiSisiTegakB;
    private double tinggiSisiTegakC;

    public LimasSegitiga(double sisiA, double sisiB, double sisiC, double tinggiLimas, double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC) {
        super("Limas Segitiga", sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakA = tinggiSisiTegakA;
        this.tinggiSisiTegakB = tinggiSisiTegakB;
        this.tinggiSisiTegakC = tinggiSisiTegakC;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas alas + luas 3 sisi tegak (segitiga)
        double luasSisiA = 0.5 * super.sisiA * tinggiSisiTegakA;
        double luasSisiB = 0.5 * super.sisiB * tinggiSisiTegakB;
        double luasSisiC = 0.5 * super.sisiC * tinggiSisiTegakC;

        return hitungLuas() + luasSisiA + luasSisiB + luasSisiC;
    }
}