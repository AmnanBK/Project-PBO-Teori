public class Persegi extends BentukGeometri implements BangunDatar {
    private double sisi;
    private double luas;
    private double keliling;

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

    // Getter
    public double getSisi() {
        return sisi;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    // Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
        updatePerhitungan();
    }
}