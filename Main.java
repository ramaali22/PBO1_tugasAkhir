public class Main {
    public static void main(String[] args) {
       /* String variabelString; */

        Pengguna pengguna = new Pengguna();
        pengguna.login();
        pengguna.lupaPassword();
        pengguna.daftar();

        /* Latihan 4 Buat object Buku pada class Main, sebagaimana object Pengguna */
        Buku buku = new Buku();
        buku.setid(1);
        buku.setjudul("Melangkah");
        buku.setpenulis("J.S. Khairen");
        buku.setjumlah_halaman(200);
        buku.setharga(150000);
        buku.printDetails();
        buku.gantiJudul();
        buku.deleteBuku();
        buku.naikkanHarga();
        buku.naikkanHarga(15000);

        Komik komik = new Komik();
        komik.naikkanHarga();
        System.out.println("Volume Komik: " + komik.getvolume());
        
        Film film = new Film();
        film.setid(1);
        film.setjudul("Inception");
        film.setsurtadara("Christoper Nolan");
        film.setdurasi(148);
        film.setharga(75000);
        film.printDetails();
        film.naikkanHarga();
        film.naikkanHarga(20000);

    }
}
