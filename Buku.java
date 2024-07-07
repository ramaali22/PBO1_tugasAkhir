/* Latihan 3 Jalankan langkah 2-7 untuk tabel Buku berikut */
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;

    public void printDetails(){
        System.out.println("Ini method untuk menampilkan data buku");
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlah_halaman);
        System.out.println("Harga: " + harga);
    }

    public void gantiJudul(){
        System.out.println("Ini method untuk mengganti judul buku");
    }

    public void deleteBuku(){
        System.out.println("Ini method untuk mengapus buku");
    }

    /* Getters dan setters untuk setiap atribut  */
    public int getid() {
        return this.id;
    }
    
    public void setid(int id) {
        this.id = id;
    }

    public String getjudul() {
        return this.judul;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String getpenulis() {
        return this.penulis;
    }
    
    public void setpenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getjumlah_halaman() {
        return this.jumlah_halaman;
    }

    public void setjumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public double getharga() {
        return this.harga;
    }
    
    public void setharga(double harga) {
        this.harga = harga;
    }

    /* method constructor */
    public Buku(){
        System.out.println("Object telah diciptakan, constructor buku berjalan");
    }

    /* Latihan 6 Pada class Buku, buat method naikkanHarga() dan overloadingnya naikkanHarga(double kenaikan) */

    public void naikkanHarga(){
        this.harga += 10000;
        System.out.println("Harga buku telah dinaikkan sebesar 10000. Harga baru: " + this.harga);
    }

    public void naikkanHarga(double kenaikan){
        System.out.println("Ini method untuk menaikan harga buku dengan atribut baru");
    }
}
