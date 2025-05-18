public class Trapesium extends BentukGeometri implements BangunDatar {
    protected double sisiA; // salah satu sisi sejajar
    protected double sisiB; // sisi sejajar lainnya
    protected double sisiC;
    protected double sisiD;
    protected double tinggi;

    public Trapesium(String nama, double sisiA, double sisiB, double sisiC, double sisiD, double tinggi) {
        super(nama);
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return ((sisiA + sisiB) / 2) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC + sisiD;
    }
}