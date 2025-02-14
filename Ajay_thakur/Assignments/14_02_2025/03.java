/*
 *  Problem Statement:
A movie database needs to sort movies based on their release year (oldest to newest).

Class Attributes:
title (String)
rating (double)
releaseYear (int)
Implementation Details:
Implement Comparable<Movie> and override compareTo() to sort movies in ascending order of releaseYear.
Expected Output:
Movies should be sorted by releaseYear (earliest release first).

 */


import java.util.TreeSet;

class MovieDatabase implements Comparable<MovieDatabase>{

    private String title;
    private double rating;
    private int releaseYear;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public MovieDatabase(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public int compareTo(MovieDatabase o){

        return this.getReleaseYear() - o.getReleaseYear();
    }
    @Override
    public String toString() {
        return "MovieDatabase [title=" + title + ", rating=" + rating + ", releaseYear=" + releaseYear + "]";
    }

    

}

class Main{

    public static void main(String[] args) {
        
        TreeSet<MovieDatabase> t = new TreeSet<>();

        MovieDatabase m1 = new MovieDatabase("sanam teri kasam", 8.8, 2016);
        MovieDatabase m2 = new MovieDatabase("KGF", 9.9, 2022);
        MovieDatabase m3 = new MovieDatabase("Animal", 7.4, 2023);
        MovieDatabase m4 = new MovieDatabase("Raja Babu", 8.7, 2005);

        t.add(m1);
        t.add(m2);
        t.add(m3);
        t.add(m4);

        System.out.println(t);

        

    }
}