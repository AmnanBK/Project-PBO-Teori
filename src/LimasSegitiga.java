public class LimasSegitiga extends Segitiga implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakA;
    private double tinggiSisiTegakB;
    private double tinggiSisiTegakC;
    private double volume;
    private double luasPermukaan;

    public LimasSegitiga(double sisiA, double sisiB, double sisiC, double tinggiLimas, double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC) {
        super("Limas Segitiga", sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakA = tinggiSisiTegakA;
        this.tinggiSisiTegakB = tinggiSisiTegakB;
        this.tinggiSisiTegakC = tinggiSisiTegakC;
        updatePerhitungan();
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * getLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasSisiA = 0.5 * getSisiA() * tinggiSisiTegakA;
        double luasSisiB = 0.5 * getSisiB() * tinggiSisiTegakB;
        double luasSisiC = 0.5 * getSisiC() * tinggiSisiTegakC;
        return getLuas() + luasSisiA + luasSisiB + luasSisiC;
    }

    private void updatePerhitungan() {
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    // Getters
    public double getTinggiLimas() {
        return tinggiLimas;
    }

    public double getTinggiSisiTegakA() {
        return tinggiSisiTegakA;
    }

    public double getTinggiSisiTegakB() {
        return tinggiSisiTegakB;
    }

    public double getTinggiSisiTegakC() {
        return tinggiSisiTegakC;
    }

    // Setters
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
        updatePerhitungan();
    }

    public void setTinggiSisiTegakA(double tinggiSisiTegakA) {
        this.tinggiSisiTegakA = tinggiSisiTegakA;
        updatePerhitungan();
    }

    public void setTinggiSisiTegakB(double tinggiSisiTegakB) {
        this.tinggiSisiTegakB = tinggiSisiTegakB;
        updatePerhitungan();
    }

    public void setTinggiSisiTegakC(double tinggiSisiTegakC) {
        this.tinggiSisiTegakC = tinggiSisiTegakC;
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