import java.util.ArrayList;

public class Penumpang {
    private String namaDepan, namaBelakang, email, noTelp, password;
    private ArrayList<Tiket> tiketPengguna = new ArrayList<>();


    public Penumpang(String namaDepan, String namaBelakang, String email,String noTelp,String password){
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.email = email;
        this.noTelp = noTelp;
        this.password = password;
    }

    public String getNamaDepan(){
        return this.namaDepan;
    }

    public String getNamaBelakang(){
        return this.namaBelakang;
    }

    public String getEmail(){
        return this.email;
    }

    public String getNoTelp(){
        return this.noTelp;
    }

    public String getPassword(){
        return this.password;
    }

    //=====================================================================//

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public void setNomor(String newNomor){
        this.noTelp = newNomor;
    }

    //=====================================================================//
    public void addTiket(Tiket newTiket){
        tiketPengguna.add(newTiket);
    }
}
