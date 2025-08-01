package lab3;


public class Movie {
    private final String movieId;
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;
    private static int moviesCount = 0;

    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are required fields.");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        int updtd = moviesCount++;
        this.movieId = movieName + "_" + updtd;
    }

    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public void setInfo(String directedBy, int duration, int year, String category) {
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }
    public void displayInfo() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Produced By: " + producedBy);
        System.out.println("Directed By: " + (directedBy != null ? directedBy : "N/A"));
        System.out.println("Duration: " + (duration > 0 ? duration + " minutes" : "N/A"));
        System.out.println("Year: " + (year > 0 ? year : "N/A"));
        System.out.println("Category: " + (category != null ? category : "N/A"));

    }
    public static int getMoviesCount() {
        return moviesCount;
    }
    public String getMovieId() {
        return movieId;
    }
    public class SpecialMovie extends Movie {
        private String soundEffectsTechnology;
        private String visualEffectsTechnology;

        // Constructor calling super
        public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                            String soundEffectsTechnology, String visualEffectsTechnology) {
            super(movieName, producedBy, directedBy, duration, year, category);
            this.soundEffectsTechnology = soundEffectsTechnology;
            this.visualEffectsTechnology = visualEffectsTechnology;
        }

        // Additional display method
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Sound Effects: " + (soundEffectsTechnology != null ? soundEffectsTechnology : "N/A"));
            System.out.println("Visual Effects: " + (visualEffectsTechnology != null ? visualEffectsTechnology : "N/A"));
        }
    }
    public class InternationalMovie extends Movie {
        private String country;
        private String language;

        // Constructor calling super
        public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                                  String country, String language) {
            super(movieName, producedBy, directedBy, duration, year, category);
            this.country = country;
            this.language = language;
        }

        // Additional display method
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Country: " + (country != null ? country : "N/A"));
            System.out.println("Language: " + (language != null ? language : "N/A"));
        }
    }


    public static void main(String[] args) {

        Movie movie1 = new Movie("toilet", "yash");
        movie1.setInfo("kattapn", 148, 2010, "funny");
        movie1.displayInfo();

        System.out.println();

        Movie movie2 = new Movie("besharam", "rohit shetty", "ronaldo", 152, 2008, "Action");
        movie2.displayInfo();
        System.out.println("Total Movies Created: " + Movie.getMoviesCount());
        System.out.println("movie id= "+ moviesCount);


    }

}



