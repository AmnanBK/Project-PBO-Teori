package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.Lingkaran;

public class Bola extends Lingkaran implements BangunRuang {
    public double volume;
    public double luasPermukaan;

    public Bola(double jariJari) {
        super("Bola", jariJari);
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}