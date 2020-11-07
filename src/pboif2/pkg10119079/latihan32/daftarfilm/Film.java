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
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int duration; 
    
public void nowPlaying (){
    System.out.println("Judul Film : " +filmName);
    System.out.println("Genre Film : " +filmGenre);
    System.out.println("Rating Film : " +filmRating);
    System.out.println("Duration Film : " +duration+ " Menit"+ "\n");
    
}
    
}
