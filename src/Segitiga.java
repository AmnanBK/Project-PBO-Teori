public class Segitiga extends BentukGeometri implements BangunDatar {
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(String nama, double sisiA, double sisiB, double sisiC) {
        super(nama);
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    @Override
    public double hitungLuas() {
        double p = hitungKeliling() / 2;
        return Math.sqrt(p * (p - sisiA) * (p - sisiB) * (p - sisiC));
    }
}
