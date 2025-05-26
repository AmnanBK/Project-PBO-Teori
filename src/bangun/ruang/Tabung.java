package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.Lingkaran;

public class Tabung extends Lingkaran implements BangunRuang {
    private double tinggiTabung;
    public double volume;
    public double luasPermukaan;

    public Tabung(double jariJari, double tinggiTabung) {
        super("bangun.ruang.Tabung", jariJari);
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
