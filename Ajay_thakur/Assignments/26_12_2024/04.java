class LibraryItem{

    String title;
    String author;
    int yearPublished;

}

class Book extends LibraryItem{

    String genre;

    Book(String title, String author, int yearPublished, String genre){

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
    }

    void displayDetails(){

        System.out.println("\tBook details\n\nTitle : " + title + "\nAuthor : " + author + "\nPublished in : " + yearPublished + "\nGenre : " + genre);
    }

}

class Magazine extends LibraryItem{

    int volume;

    Magazine(String title, String author, int yearPublished, int volume){

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.volume = volume;
    }

    void displayDetails(){

        System.out.println("\tMagazine details\n\nTitle : " + title + "\nAuthor : " + author + "\nPublished in : " + yearPublished + "\nVolume : " + volume);
    }
}

class DVD extends LibraryItem{

    int runtime;

    DVD(String title, String author, int yearPublished,int runtime){

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.runtime = runtime;
    }

    void displayDetails(){
        
        System.out.println("\tDVD details\n\nTitle : " + title + "\nAuthor : " + author + "\nPublished in : " + yearPublished + "\nRuntime : " + runtime);
    }
}

class Beta{

    public static void main(String[] args) {
        
        Book book1 = new Book("To kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        book1.displayDetails();

        Magazine magazine1 = new Magazine("National Geographic", "Susan Goldberg", 2022, 241);
        magazine1.displayDetails();

        DVD dvd1 = new DVD("The Shawshank Redemption", "Frank Darabont", 1994, 142);
        dvd1.displayDetails();
    }
}
