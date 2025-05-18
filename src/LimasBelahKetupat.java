public class LimasBelahKetupat extends BelahKetupat implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakA;
    private double tinggiSisiTegakB;
    private double tinggiSisiTegakC;
    private double tinggiSisiTegakD;

    public LimasBelahKetupat(double sisi, double diagonal1, double diagonal2, double tinggiLimas, double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC, double tinggiSisiTegakD) {
        super("Limas Belah Ketupat", sisi, diagonal1, diagonal2);
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

        double luasSisiTegakA = 0.5 * sisi * tinggiSisiTegakA;
        double luasSisiTegakB = 0.5 * sisi * tinggiSisiTegakB;
        double luasSisiTegakC = 0.5 * sisi * tinggiSisiTegakC;
        double luasSisiTegakD = 0.5 * sisi * tinggiSisiTegakD;

        double luasSisiTegakTotal = luasSisiTegakA + luasSisiTegakB + luasSisiTegakC + luasSisiTegakD;

        return luasAlas + luasSisiTegakTotal;
    }
}