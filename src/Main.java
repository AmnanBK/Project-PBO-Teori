//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hitung Bangun Geometri ===");
        System.out.println();

        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(3, 4, 5, 10);
        System.out.println("Prisma Segitiga");
        System.out.println("Luas: " + prismaSegitiga.getLuas());
        System.out.println("Keliling: " + prismaSegitiga.getKeliling());
        System.out.println("Volume: " + prismaSegitiga.getVolume());
        System.out.println("Luas Permukaan: " + prismaSegitiga.getLuasPermukaan());

        prismaSegitiga.setSisiA(4);
        System.out.println("Prisma Segitiga setelah diubah");
        System.out.println("Luas: " + prismaSegitiga.getLuas());
        System.out.println("Keliling: " + prismaSegitiga.getKeliling());
        System.out.println("Volume: " + prismaSegitiga.getVolume());
        System.out.println("Luas Permukaan: " + prismaSegitiga.getLuasPermukaan());

    }
}