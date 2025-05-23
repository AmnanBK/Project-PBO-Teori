public class Persegi extends BentukGeometri implements BangunDatar {
    protected double sisi;
    protected double luas;
    protected double keliling;

    public Persegi(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
        updatePerhitungan();
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    private void updatePerhitungan() {
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    // Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
        updatePerhitungan();
    }
}