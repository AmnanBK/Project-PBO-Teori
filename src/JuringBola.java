public class JuringBola extends Bola {
    private double tinggi; // tinggi juring dari pusat bola ke permukaan potongan

    public JuringBola(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus volume juring bola: (2/3) * π * r^2 * t
        return (2.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan juring bola = 2πrh (selimut) + luas alas (juring lingkaran)
        // Anggap saja yang dimaksud hanya luas selimutnya untuk penyederhanaan
        return 2 * Math.PI * jariJari * tinggi;
    }
}