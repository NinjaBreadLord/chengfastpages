import java.util.Random;
public class Book {
    public final Date creationDate;
    public String bookTitle;
    public static int bookCount;
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
        this.creationDate = new Date();
    }
    public int randomID(){
        Random rand = new Random();
        int Id = rand.nextInt(10000);
        bookCount++;
        return Id;
    }
    public int getBookCount(){
        return bookCount;
    }
    public String toString(){
        return this.bookTitle;
    }

    public long shelfLife(){
        Date currentDate = new Date();
        long timeDiff = Math.abs(this.creationDate.getTime() - currentDate.getTime());
        return timeDiff;
    }

    public static void main(String[] args){
        Book book1 = new Book("book1");
        Book book2 = new Book("book2");
        System.out.println(book1.toString() + " id: " + book1.randomID());
        System.out.println(book2.toString() + " id: " + book2.randomID());
        System.out.println("book1 shelf life: " + book1.shelfLife() + " nanoseconds");
        System.out.println("bookcount: " + bookCount);    
        System.out.println(Book.bookCount);
        // System.out.println(book1.bookCount);
    }
    }
// Book.main(null);