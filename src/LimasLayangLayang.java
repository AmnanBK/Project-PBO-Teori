public class LimasLayangLayang extends LayangLayang implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakA;
    private double tinggiSisiTegakB;
    private double tinggiSisiTegakC;
    private double tinggiSisiTegakD;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisiA, double sisiB, double tinggiLimas, double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC, double tinggiSisiTegakD) {
        super("Limas Layang-Layang", diagonal1, diagonal2, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakA = tinggiSisiTegakA;
        this.tinggiSisiTegakB = tinggiSisiTegakB;
        this.tinggiSisiTegakC = tinggiSisiTegakC;
        this.tinggiSisiTegakD = tinggiSisiTegakD;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();

        double luasSisiTegakA = 0.5 * sisiA * tinggiSisiTegakA;
        double luasSisiTegakB = 0.5 * sisiB * tinggiSisiTegakB;
        double luasSisiTegakC = 0.5 * sisiA * tinggiSisiTegakC;
        double luasSisiTegakD = 0.5 * sisiB * tinggiSisiTegakD;

        double luasSisiTegakTotal = luasSisiTegakA + luasSisiTegakB + luasSisiTegakC + luasSisiTegakD;

        return luasAlas + luasSisiTegakTotal;
    }
}