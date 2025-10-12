class Book {
   String book;
   String author;
   int code;

   public Book(String book, String author, int code) {
     this.book = book;
     this.author = author;
     this.code = code;
   }

   void display() {
     System.out.println("Book name : " + book);
     System.out.println("Author name : " + author);
     System.out.println("Book code : " + code);
   }
}

public class Lab1 {
  public static void main(String[] args) {
     Book b1 = new Book("Atomic Habits", "James Clear", 23);
     Book b2 = new Book("The Alchemist", "Paulo Coelho", 35);
     b1.display();
     b2.display();
  }
}
