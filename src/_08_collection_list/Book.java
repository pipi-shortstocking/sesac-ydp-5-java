package _08_collection_list;

public class Book {
  private String titile;
  private String author;

  public Book(String titile, String author) {
    this.titile = titile;
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book{" +
        "titile='" + titile + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}
