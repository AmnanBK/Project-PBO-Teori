public class Segitiga extends BentukGeometri implements BangunDatar {
    private double sisiA;
    private double sisiB;
    private double sisiC;
    private double tinggi;
    private double luas;
    private double keliling;

    public Segitiga(String nama, double sisiA, double sisiB, double sisiC) {
        super(nama);
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        double p = hitungKeliling() / 2;
        return Math.sqrt(p * (p - sisiA) * (p - sisiB) * (p - sisiC));
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    public double hitungTinggi() {
        return 2 * luas / sisiA;
    }

    private void updatePerhitungan() {
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
        this.tinggi = hitungTinggi();
    }

    // getter
    public double getSisiA() {
        return sisiA;
    }
    public double getSisiB() {
        return sisiB;
    }
    public double getSisiC() {
        return sisiC;
    }
    public double getLuas() {
        return luas;
    }
    public double getKeliling() {
        return keliling;
    }

    // setter
    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
        updatePerhitungan();
    }
    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
        updatePerhitungan();
    }
    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
        updatePerhitungan();
    }
}
