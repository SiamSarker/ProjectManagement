class Movie{
    public String name;
    public int year;
    public String time;

    Movie(String name, int year, String time){
        this.name=name;
        this.year=year;
        this.time=time;
    }
    void play(){
        System.out.println("Playing: "+name+" ["+year+"]");
    }
    static void movieInfo(Movie name){
        System.out.println("Movie name: "+name.name+", year: "+name.year+", Duration: "+name.time);
    }
}


    class MovieTheater {
            public static void main(String[] args) {
                Movie m_Debi = new Movie("Debi", 2018, "1hr 30min");
                Movie m_Venom = new Movie ("Venom", 2018, "1hr");
                m_Debi.play();
                m_Venom.play();
              Movie.movieInfo(m_Debi);
            }
        }