public class BelahKetupat extends BentukGeometri implements BangunDatar {
    protected double sisi;
    protected double diagonal1;
    protected double diagonal2;

    public BelahKetupat(String nama, double sisi, double diagonal1, double diagonal2) {
        super(nama);
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
