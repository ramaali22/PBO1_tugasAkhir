public class Film {
    private int id;
    private String judul;
    private String sutradara;
    private int durasi;
    private double harga;

    /* constructor */
    public Film() {
        System.out.println("Object Film telah diciptakan, constructor berjalan");
    }
    
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Durasi: " + durasi);
        System.out.println("Harga: " + harga);
    }

    public void gantiJudul() {
        System.out.println("Ini method untuk mengganti judul film");
    }

    public void deleteFilm() {
        System.out.println("Ini method untuk menghapus film");
    }

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

    public String getsutradara() {
        return this.sutradara;
    }

    public void setsurtadara(String sutradara) {
        this.sutradara = sutradara;
    }

    public int getdurasi() {
        return this.durasi;
    }

    public void setdurasi(int durasi) {
        this.durasi = durasi;
    }
    public double getharga() {
        return this.harga;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }

    public void naikkanHarga() {
        this.harga += 50000;
        System.out.println("Harga Film telah dinaikkan sebesar 10000. Harga baru: " + this.harga);
    }

    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga film telah dinaikkan sebesar " + kenaikan);
    }
}
