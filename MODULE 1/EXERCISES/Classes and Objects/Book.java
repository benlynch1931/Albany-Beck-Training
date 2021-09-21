class Book {

  private String name;
  private String author;
  private double price;

  public Book (String name, String author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public static void main(String[] args) {

  }


  public String getName () {
    return this.name;
  }

  public String getAuthor () {
    return this.author;
  }

  public double getPrice () {
    return this.price;
  }

  public void setName (String newName) {
    this.name = newName;
  }

  public void setAuthor (String newAuthor) {
    this.author = newAuthor;
  }

  public void setPrice (double newPrice) {
    this.price = newPrice;
  }

  public String toString () {
    String stringToReturn = this.name + " by " + this.author + ". Price: £" + this.price;
    return stringToReturn;
  }

}

class Main {

  public static void main(String[] args) {

    Book book1 = new Book("Book 1", "Ben", 468.53);
    Book book2 = new Book("Book 2", "Kevin", 5.40);
    Book book3 = new Book("Book 3", "Phoebe", 10.99);

    Book[] books = { book1, book2, book3 };

    for (Book book : books) {
      System.out.println(book.toString());
    }

    // System.out.println(book1.toString());
    // System.out.println(book2.toString());
    // System.out.println(book3.toString());
  }
}
