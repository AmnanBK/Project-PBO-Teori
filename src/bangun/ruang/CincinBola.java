package bangun.ruang;

import bangun.dasar.BangunRuang;

public class CincinBola extends Bola implements BangunRuang {
    private double tinggi;
    public double volume;
    public double luasPermukaan;

    public CincinBola(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus volume cincin bola: π * h^2 * (r - (1/3) * h)
        return Math.PI * Math.pow(tinggi, 2) * (jariJari - (tinggi / 3.0));
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus luas permukaan cincin bola (selimut): 2 * π * r * h
        return 2 * Math.PI * jariJari * tinggi;
    }
}