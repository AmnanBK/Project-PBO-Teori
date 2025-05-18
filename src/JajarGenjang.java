public class JajarGenjang extends BentukGeometri implements BangunDatar {
    protected double sisiA;
    protected double sisiB;
    protected double tinggi;

    public JajarGenjang(String nama, double sisiA, double sisiB, double tinggi) {
        super(nama);
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return sisiA * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiA + sisiB);
    }
}