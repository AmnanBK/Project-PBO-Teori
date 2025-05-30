package bangun.datar;

public class JuringLingkaran extends Lingkaran {
    private double sudutDerajat;
    public double luas;
    public double keliling;

    public JuringLingkaran(double jariJari, double sudutDerajat) {
        super("Juring Lingkaran", jariJari);
        this.sudutDerajat = sudutDerajat;
    }

    @Override
    public double hitungLuas() {
        return (sudutDerajat / 360.0) * super.hitungLuas();
    }

    @Override
    public double hitungKeliling() {
        double busur = (sudutDerajat / 360.0) * 2 * Math.PI * jariJari;
        return busur + 2 * jariJari;
    }
}