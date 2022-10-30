import java.util.ArrayList;
import java.util.Scanner;

public class reservasi{

    static ArrayList<Penumpang> kumpulanPenumpang = new ArrayList<>();

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        intro();
        scan.close();
    }

    public static void intro(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat datang!");
        System.out.println("Silahkan masuk ke akun anda: ");
        System.out.println("=====================================");
        System.out.println("1. Belum punya akun?, Daftar Sekarang");
        System.out.println("2. Sudah punya akun?, masuk sekarang!");

        int answer = scan.nextInt();

        switch (answer) {
            case 1:
                register();
                break;
            case 2:
                login();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                intro();
                break;
        }

        
    }

    public static void register(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan nama depan anda: ");
        String namaDepan = scan.nextLine();

        System.out.println("Masukkan nama belakang anda: ");
        String namaBelakang = scan.nextLine();

        System.out.println("Masukkan E-Mail anda: ");
        String email = scan.nextLine();

        System.out.println("Masukkan nomor telepon anda: ");
        String nomor = scan.nextLine();

        System.out.println("Masukkan password anda: ");
        String password = scan.nextLine();

        Penumpang newUser = new Penumpang(namaDepan, namaBelakang, email, nomor, password);

        kumpulanPenumpang.add(newUser);

        login();
    }


    public static void login(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan email anda");
        String email = scan.nextLine();

        System.out.println("Masukkan password anda");
        String password = scan.nextLine();
        
        for(int i = 0; i < kumpulanPenumpang.size(); i++){
            if(kumpulanPenumpang.get(i).getEmail().equals(email)){
                if(kumpulanPenumpang.get(i).getPassword().equals(password)){
                    mainMenu();
                    break;
                } else {
                    System.out.println("Password salah!");
                    login();
                    break;
                }
            } else {
                System.out.println("Akun belum terdaftar, silahkan mendaftar terlebih dahulu");
                register();
            }
        }
    }

    public static void mainMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Apa yang ingin anda lakukan hari ini? ");
        System.out.println("======================================");
        System.out.println("1.Memesan Tiket");
        System.out.println("2.Membatalkan Tiket");
        System.out.println("3.Menampilkan daftar tiket");
        System.out.println("4.Exit");

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                pesanTiket();
                break;
            case 2:
                batalTiket();
                break;
            case 3:
                riwayatTiket();
                break;
            case 4:
                System.out.println("Selamat tinggal!");
                System.exit(0);

        }
        
        
    }

    private static void riwayatTiket() {
        System.out.println("Menampilkan riwayat tiket");
    }

    private static void batalTiket() {
        System.out.println("Menampilkan batal tiket");
    }

    private static void pesanTiket() {
        System.out.println("Menampilkan pesan tiket");
    }


}