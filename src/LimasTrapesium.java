public class LimasTrapesium extends Trapesium implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakA;
    private double tinggiSisiTegakB;
    private double tinggiSisiTegakC;
    private double tinggiSisiTegakD;

    public LimasTrapesium(double sisiA, double sisiB, double sisiC, double sisiD, double tinggiAlas, double tinggiLimas, double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC, double tinggiSisiTegakD) {
        super("Limas Trapesium", sisiA, sisiB, sisiC, sisiD, tinggiAlas);
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
        double luasSisiTegakC = 0.5 * sisiC * tinggiSisiTegakC;
        double luasSisiTegakD = 0.5 * sisiD * tinggiSisiTegakD;

        double luasSisiTegakTotal = luasSisiTegakA + luasSisiTegakB + luasSisiTegakC + luasSisiTegakD;

        return luasAlas + luasSisiTegakTotal;
    }
}