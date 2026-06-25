class BookAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Journey to Success",2024,"Rohan Sharma","An Indian writer who enjoys creating motivational stories");
        b1.displayInfo();
    }
}

class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
class Author extends Book {
    String name;
    String bio;
    
    Author(String title, int publicationYear, String name, String bio) {
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }
    
    void displayInfo() {
        System.out.println("===Book Detail===");
        System.out.println("Title: " + title + "\nPublication Year: " + publicationYear);
        System.out.println("===Author Detail===");
        System.out.println("Name: " + name + "\nBio: " + bio);
    }
}