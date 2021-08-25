package movies;

public class Titanic {
    public String directorName;
    public String featuredSong;

    public Titanic(String directorName, String featuredSong) {
        this.directorName = directorName;
        this.featuredSong = featuredSong;
    }

    static {
        System.out.println("Titanic sank in the North Atlantic Ocean on 15th April 1912 after striking an iceberg");
    }

    public void showDetails(){
        System.out.println("Director Name :"+ directorName);
        System.out.println("Featured Song :"+ featuredSong);
    }

    public static void main(String[] args) {
        Titanic t1 = new Titanic("James Cameron", "My Heart Will Go On");
        t1.showDetails();
    }
}
