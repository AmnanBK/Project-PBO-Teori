public class TemberengBola extends Bola {
    private double tinggi; // tinggi tembereng dari potongan ke dasar bola

    public TemberengBola(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus volume tembereng bola: (1/3) * π * h^2 * (3r - h)
        return (1.0 / 3.0) * Math.PI * Math.pow(tinggi, 2) * (3 * jariJari - tinggi);
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan tembereng bola (tanpa alas): 2 * π * r * h
        // Bisa ditambah luas lingkaran alas jika dibutuhkan
        return 2 * Math.PI * jariJari * tinggi;
    }
}