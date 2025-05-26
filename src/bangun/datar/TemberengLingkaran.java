package bangun.datar;

public class TemberengLingkaran extends Lingkaran {
    private double sudutDerajat;
    public double luas;
    public double keliling;

    public TemberengLingkaran(double jariJari, double sudutDerajat) {
        super("Tembereng Lingkaran", jariJari);
        this.sudutDerajat = sudutDerajat;
    }

    @Override
    public double hitungLuas() {
        double luasJuring = (sudutDerajat / 360.0) * Math.PI * jariJari * jariJari;
        double luasSegitiga = 0.5 * jariJari * jariJari * Math.sin(Math.toRadians(sudutDerajat));
        return luasJuring - luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        double panjangBusur = (sudutDerajat / 360.0) * 2 * Math.PI * jariJari;
        return panjangBusur + 2 * jariJari;
    }
}
