package pboif2.pkg10119079.latihan32.daftarfilm;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan32DaftarFilm {
    public static void main(String[] args) {
        Film filem1 =new Film();
        filem1.filmName = "Venom";
        filem1.filmGenre = "Action, Horror, Scifi";
        filem1.filmRating = 8.5;
        filem1.duration = 120;
        
        Film filem2 =new Film();
        filem2.filmName = "Small Foot";
        filem2.filmGenre = "Animation";
        filem2.filmRating = 9.0;
        filem2.duration = 96;
        
        Film filem3 =new Film();
        filem3.filmName = "Crazy Rich Asian";
        filem3.filmGenre = "Comedy";
        filem3.filmRating = 7.8;
        filem3.duration = 119;
        
        Film filem4 =new Film();
        filem4.filmName = "Asih";
        filem4.filmGenre = "Horror";
        filem4.filmRating = 6.0;
        filem4.duration = 100;
        
        
        System.out.println("===Daftar Film Sedamg Tayang==="+"\n");
        filem1.nowPlaying();
        filem2.nowPlaying();
        filem3.nowPlaying();
        filem4.nowPlaying();
        
        
        
    }
    
}
