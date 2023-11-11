import java.util.List;

abstract class Pengguna {
  protected String nama;

  public Pengguna(String nama) {
    this.nama = nama;
  }

  public abstract void LihatBuku(List<Buku> bukuList);
}
