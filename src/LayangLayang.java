public class LayangLayang extends BentukGeometri implements BangunDatar {
    protected double diagonal1;
    protected double diagonal2;
    protected double sisiA;
    protected double sisiB;

    public LayangLayang(String nama, double diagonal1, double diagonal2, double sisiA, double sisiB) {
        super(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiA + sisiB);
    }
}