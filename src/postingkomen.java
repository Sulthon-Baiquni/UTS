import java.util.ArrayList;
import java.util.Scanner;

public class postingkomen {
  private static void PrintKomentar(){

  }
  
  public static void komentar(){
      String userfb;
      String komentar;

      ArrayList<Fb>SemuaKomentarUser = new ArrayList<>();
      Scanner user_fb = new Scanner(System.in);

      System.out.println("Masukan User : ");
      userfb = user_fb.nextLine();
      System.out.println("Masukan Komentar : ");
      komentar = user_fb.nextLine();
    

      Fb postingankomentar =  new postingkomen(userfb, komentar);
      SemuaKomentarUser.add(komentar);
  }
  public static void main(String[] args) {
    ArrayList<Fb> postingan = new ArrayList<>();

    Fb Bagas = new Fb("Lulu",12,10);
    postingan.add(Bagas);

    System.out.println();
    System.out.println(Bagas.getuserFb());
    System.out.println("---------------------");
    System.out.println();
    System.out.println();
    System.out.println("Postingan Bagas");
    System.out.println();
    System.out.println();
    System.out.println("---------------------");
    System.out.println(Bagas.getLikes()+" likes");
    System.out.println(Bagas.getbanyakkomentar()+" komentar");
    System.out.println();

    char pilihMenu = 0;
        int loop = 0;
        while(pilihMenu != 4){
            int likeSekarang = Bagas.getLikes();
            int jumlahkomenSekarang = Bagas.getbanyakkomentar();

            Scanner pilihanmenu = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1. Like postingan Fb");
            System.out.println("2. Komentari postingan Fb");
            System.out.println("3. Lihat komentar Fb");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihMenu = pilihanmenu.next().charAt(0);

            switch (pilihMenu) {
                case '1' -> {  likeSekarang = Bagas.BanyakKomentarPadaPostingan(likeSekarang);
                    System.out.println();
                    System.out.println(Bagas.getuserFb());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Bagas");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(BanyakLikesPadaPostingan+" suka");
                    System.out.println(Bagas.getbanyakkomentar()+" komentar");
                    System.out.println();
                }
                case '2' -> {komentar();
                    jumlahkomenSekarang = Bagas.BanyakKomentarPadaPostingan(jumlahkomenSekarang);
                    System.out.println();
                    System.out.println(Bagas.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan fb Bagas");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(Banyaklikespostinganfb+" suka");
                    System.out.println(BanyakKomentarPadaPostingan+" komentar");
                    System.out.println();
                }

                case '3' -> {
                    System.out.println();
                    System.out.println(Bagas.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Bagas");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(Banyaklikespostinganfb+" suka");
                    System.out.println(BanyakKomentarPadaPostingan+" commen");
                    System.out.println();
                    PrintKomentar();
                }
}
