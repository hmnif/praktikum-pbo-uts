import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PerpustakaanMain {
  public static void main(String[] args) {
    List<Buku> daftarBuku = new ArrayList<>();
    daftarBuku.add(new Buku("OOP Java", "Programming"));
    daftarBuku.add(new Buku("Aljabar Linear", "Academic"));
    daftarBuku.add(new Buku("My Heart", "Love"));

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan peran (User/Admin): ");
    String peran = scanner.nextLine();

    Pengguna pengguna;

    if (peran.equalsIgnoreCase("User") || peran.equalsIgnoreCase("user")) {
      System.out.print("Masukkan nama pengguna: ");
      String nama = scanner.nextLine();
      pengguna = new User(nama);
    } else if (peran.equalsIgnoreCase("Admin") || peran.equalsIgnoreCase("admin")) {
      System.out.print("Masukkan nama admin: ");
      String nama = scanner.nextLine();
      pengguna = new Admin(nama);
    } else {
      System.out.println("Peran tidak valid.");
      return;
    }

    pengguna.LihatBuku(daftarBuku);

    if (pengguna instanceof Admin) {
      Admin admin = (Admin) pengguna;
      admin.TambahBuku(daftarBuku, new Buku("Roadmap Front End", "Programming"));
      pengguna.LihatBuku(daftarBuku);

      admin.HapusBuku(daftarBuku, daftarBuku.get(0));
      pengguna.LihatBuku(daftarBuku);
    }
  }
}
