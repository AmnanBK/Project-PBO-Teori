public class LimasPersegiPanjang extends PersegiPanjang implements BangunRuang {
    private double tinggiLimas;
    private double tinggiSisiTegakPanjang;
    private double tinggiSisiTegakLebar;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas, double tinggiSisiTegakPanjang, double tinggiSisiTegakLebar) {
        super("Limas Persegi Panjang", panjang, lebar);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakPanjang = tinggiSisiTegakPanjang;
        this.tinggiSisiTegakLebar = tinggiSisiTegakLebar;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double sisiPanjang = super.panjang;
        double sisiLebar = super.lebar;

        double luasSisiTegakPanjang = 2 * (0.5 * sisiLebar * tinggiSisiTegakPanjang); // 2 sisi panjang (alas segitiga = sisi lebar)
        double luasSisiTegakLebar = 2 * (0.5 * sisiPanjang * tinggiSisiTegakLebar);     // 2 sisi lebar (alas segitiga = sisi panjang)

        return luasAlas + luasSisiTegakPanjang + luasSisiTegakLebar;
    }
}