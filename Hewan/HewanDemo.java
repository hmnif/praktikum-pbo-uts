import java.util.Scanner;

public class HewanDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Hewan hewan = new Hewan();
    System.out.print("Masukan jenis hewan : ");
    String jenisHewan = input.nextLine();

    if (jenisHewan.equalsIgnoreCase("Kucing") || jenisHewan.equalsIgnoreCase("kucing")) {
      hewan = new Kucing();
    } else if (jenisHewan.equalsIgnoreCase("Anjing") || jenisHewan.equalsIgnoreCase("anjing")) {
      hewan = new Anjing();
    } else {
      System.out.println("Hewan tidak tersedia");
    }

    hewan.bersuara();

    if (hewan.Mamalia()) {
      System.out.println(jenisHewan + " termasuk hewan mamalia");
    } else {
      System.out.println(jenisHewan + " bukan termasuk hewan mamalia");
    }
  }
}
