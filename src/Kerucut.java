public class Kerucut extends Lingkaran implements BangunRuang {
    private double tinggiKerucut;
    private double garisPelukis;  // biasanya l = sqrt(r^2 + t^2)

    public Kerucut(double jariJari, double tinggiKerucut) {
        super("Kerucut", jariJari);
        this.tinggiKerucut = tinggiKerucut;
        this.garisPelukis = Math.sqrt(jariJari * jariJari + tinggiKerucut * tinggiKerucut);
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiKerucut;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double luasSelimut = Math.PI * jariJari * garisPelukis;
        return luasAlas + luasSelimut;
    }
}