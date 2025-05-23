//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hitung Bangun Geometri ===");
        System.out.println();

        LimasSegitiga geometri = new LimasSegitiga(5, 5, 5, 10, 10, 10, 10);
        System.out.println("Hitung Geometri");
        System.out.println("Luas: " + geometri.luas);
        System.out.println("Keliling: " + geometri.keliling);
        System.out.println("Volume: " + geometri.volume);
        System.out.println("Luas Permukaan: " + geometri.luasPermukaan);

        geometri.setTinggiLimas(4);
        System.out.println("\nSetelah diubah");
        System.out.println("Luas: " + geometri.luas);
        System.out.println("Keliling: " + geometri.keliling);
        System.out.println("Volume: " + geometri.volume);
        System.out.println("Luas Permukaan: " + geometri.luasPermukaan);

    }
}