public class LimasJajarGenjang extends JajarGenjang implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakSisiA;
    private double tinggiSisiTegakSisiB;

    public LimasJajarGenjang(double sisiA, double sisiB, double tinggiAlas, double tinggiLimas, double tinggiSisiTegakSisiA, double tinggiSisiTegakSisiB) {
        super("Limas Jajar Genjang", sisiA, sisiB, tinggiAlas);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakSisiA = tinggiSisiTegakSisiA;
        this.tinggiSisiTegakSisiB = tinggiSisiTegakSisiB;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();

        // Luas sisi tegak berupa 4 segitiga (2 sisi panjang, 2 sisi pendek)
        double luasSisiTegakSisiA = 2 * (0.5 * sisiB * tinggiSisiTegakSisiA);
        double luasSisiTegakSisiB = 2 * (0.5 * sisiA * tinggiSisiTegakSisiB);

        return luasAlas + luasSisiTegakSisiA + luasSisiTegakSisiB;
    }
}