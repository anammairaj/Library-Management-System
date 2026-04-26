public interface LibraryOperations {
    void addBook(String title, String author);
    void viewBooks();
    void issueBook(int id);
    void returnBook(int id);
}