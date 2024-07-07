/* Latihan 5
Buat subclass Komik dari superclass Buku, tambahkan atribut volume, dan 
method getVolume() */

public class Komik extends Buku {
    private int volume;

    /* Latihan 7 Buat subclass Komik dari superclass Buku, buat overriding dari method naikkanHarga() */
    public void naikkanHarga() {
        double hargaSekarang = getharga();
        double kenaikan = hargaSekarang * 0.10; // Kenaikan harga 10%
        setharga(hargaSekarang + kenaikan);
        System.out.println("Harga komik telah dinaikkan sebesar 10%. Harga baru: " + getharga());
    }

    public int getvolume(){
        return this.volume;
    }

    public void setvolume(int volume){
        this.volume = volume;
    }

}
