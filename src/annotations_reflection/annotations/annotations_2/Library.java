package annotations_reflection.annotations.annotations_2;

public class Library {
    @MyAnno(author = "Bradbury", year = 1949, description = "fantasy")
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

