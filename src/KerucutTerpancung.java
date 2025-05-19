public class KerucutTerpancung extends Lingkaran implements BangunRuang {
    private double jariJariAtas;
    private double tinggi;
    private double garisPelukis;
    private double volume;
    private double luasPermukaan;

    public KerucutTerpancung(double jariJariBawah, double jariJariAtas, double tinggi, double garisPelukis) {
        super("Kerucut Terpancung", jariJariBawah);
        this.jariJariAtas = jariJariAtas;
        this.tinggi = tinggi;
        this.garisPelukis = garisPelukis;
    }

    @Override
    public double hitungVolume() {
        double r1 = super.jariJari;
        double r2 = jariJariAtas;
        return (1.0 / 3.0) * Math.PI * tinggi * (r1 * r1 + r1 * r2 + r2 * r2);
    }

    @Override
    public double hitungLuasPermukaan() {
        double r1 = super.jariJari;
        double r2 = jariJariAtas;
        return Math.PI * (r1 + r2) * garisPelukis + Math.PI * (r1 * r1 + r2 * r2);
    }
}
