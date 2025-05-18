public class Tabung extends Lingkaran implements BangunRuang {
    private double tinggiTabung;

    public Tabung(double jariJari, double tinggiTabung) {
        super("Tabung", jariJari);
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggiTabung; // π*r² * t
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double kelilingAlas = hitungKeliling();
        double luasSelimut = kelilingAlas * tinggiTabung;
        return 2 * luasAlas + luasSelimut;
    }
}
