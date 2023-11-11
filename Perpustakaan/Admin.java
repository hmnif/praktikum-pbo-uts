import java.util.List;
import java.util.ArrayList;

public class Admin extends Pengguna {
  public Admin(String nama) {
    super(nama);
  }

  public void TambahBuku(List<Buku> bukuList, Buku buku) {
    bukuList.add(buku);
    System.out.println("Buku");
    System.out.println("Judul : " + buku.getJudul());
    System.out.println("Genre : " + buku.getGenre());
    System.out.println("-- Telah ditambahkan --");
  }

  public void LihatBuku(List<Buku> bukuList) {
    System.out.println("Daftar Buku");
    for (Buku buku : bukuList) {
      System.out.println("- " + buku.getJudul() + " (" + buku.getGenre() + ")");
    }
  }

  public void HapusBuku(List<Buku> bukuList, Buku buku) {
    if (bukuList.contains(buku)) {
      bukuList.remove(buku);
      System.out.println("Buku dihapus: " + buku.getJudul() + " (" + buku.getGenre() + ")");
    } else {
      System.out.println("Buku tidak ditemukan.");
    }
  }
}
