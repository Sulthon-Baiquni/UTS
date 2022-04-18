package model;
public class Fb {
    public String user;
    public int likes;
    public String komentar;
    public int banyakkomentar;

    public String getUserFb(){
        return user;
    }

    public void setUsernameFb(String user){
        this.user = user;
    }

    public int getlikes(){
        return likes;
    }

    public void setlikes(int likes){
        this.likes = likes;
    }

    public int getBykkomentar(){
        return banyakkomentar;
    }

    public void setBykkomen(int Bykkomentar){
        this.banyakkomentar = banyakkomentar;
    }

    public String getkomen(){
        return komentar;
    }

    public void setkomen(String komentar){
        this.komentar = komentar;
    }

    public postingan_fb (String userfb, int likes, int banyakkomentar){
        this.userfb = userfb;
        this.likes = likes;
        this.banyakkomentar = banyakkomentar;
    }

    public postingan_Facebook(String userfb, String komentar){
        this.userfb = userfb;
        this.komentar = komentar;
    }

    public int BanyakLikesPadaPostingan(int likes){
        likes = likes+1;
        return likes;
    }

    public int BanyakKomentarPadaPostingan(int komentar){
        komentar = komentar+1;
        return komentar;
    }
}
