package annotations_reflection.annotations.annotations_3;

public class Library {
    @MyAnno(author = "Bradbury", year = {1949, 1950, 1951}, description = "fantasy")
    private String book;
    private int ID;

    public Library(String book, int ID) {
        this.book = book;
        this.ID = ID;
    }

    public String getBook() {
        return book;
    }
}
