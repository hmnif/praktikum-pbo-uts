import java.util.List;
import java.util.ArrayList;

public class User extends Pengguna {
  public User(String nama) {
    super(nama);
  }

  public void LihatBuku(List<Buku> bukuList) {
    System.out.println("Daftar Buku");
    for (Buku buku : bukuList) {
      System.out.println("- " + buku.getJudul() + " (" + buku.getGenre() + ")");
    }
  }
}
