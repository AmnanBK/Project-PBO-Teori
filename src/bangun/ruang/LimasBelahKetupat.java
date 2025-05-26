package bangun.ruang;

import bangun.dasar.BangunRuang;
import bangun.datar.BelahKetupat;

public class LimasBelahKetupat extends BelahKetupat implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiElevasi;
    public double volume;
    public double luasPermukaan;

    public LimasBelahKetupat(double sisi, double diagonal1, double diagonal2, double tinggiLimas, double tinggiSisiElevasi) {
        super("Limas Belah Ketupat", sisi, diagonal1, diagonal2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiElevasi = tinggiSisiElevasi;

    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double luasSisiElevasi = 0.5 * sisi * tinggiSisiElevasi * 4;

        return luasAlas + luasSisiElevasi;
    }
}