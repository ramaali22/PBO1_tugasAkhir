public class Pengguna {
    private int id;
    private String username;
    private String password;

    public void login() {
        System.out.println("Ini method untuk login");
    }

    public void login(String tokenGoogle){
        System.out.println("Ini Login menggunakan Google");
    }

    public void lupaPassword() {
        System.out.println("Ini method Lupa Password");
    }

    public void daftar() {
        System.out.println("Ini method Daftar user baru");
    }

    public int getid(){
        return this.id;
    }
        
    public void setid(int id){
        this.id = id;
    }

    public String getusername(){
        return this.username;
    }

    public void setusername(String username){
        this.username = username;
    }

    /* Latihan 1 Buat method getter untuk atribut password */
    public String getpassword(){
        return this.password;
    }    
    
    /* Latihan 2 Buat method setter untuk atribut password */
    public void setpassword(String password){
        this.password = password;
    }

    public Pengguna(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
    
    public void hapus(){
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(int id){
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
    }

    public void hapus(String username){
        System.out.println("DELETE FROM pengguna WHERE username=" + username);
    }
}