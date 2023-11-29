package annotations_reflection.annotations.annotations_1;

public class Library {
    @MyAnno(author = "Bradbury", year = 1949, description = "fantasy")
    private String book;
    private int ID;

    public Library(String book, int ID) {
        this.book = book;
        this.ID = ID;
    }
    @MyAnno(author = "Bradbury", year = 1949, description = "fantasy")
    public String getBook() {
        return book;
    }
}
