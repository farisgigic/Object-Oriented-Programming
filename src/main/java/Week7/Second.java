package Week7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

record Book(String title, String author, int publicationYear, boolean available) {}
class LibraryCatalog {
    private List<Book> bookList = new ArrayList<>();

    public LibraryCatalog(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Optional<Book> checkAvailability(String title) {
        return bookList.stream().filter(book -> book.title().equals(title)).findFirst();
    }
    public boolean checkAvailabilityV2(String title) {
        for(Book book : bookList) {
            if(book.title().equals(title)) {
                return book.available();
            }
        }
        return false; // u slucaju da nema te knjige, nek returna false
    }

    public Optional<Book> getDetailsByAuthor(String author) {
        return bookList.stream().filter(book -> book.author().equals(author) && book.available()).findFirst();
    }

    public void updateAvailabilityV0(String title, boolean availability) {
        bookList.forEach(book -> {
            if(book.title().equals(title)) {
                Book newBook = new Book(book.title(), book.author(), book.publicationYear(), availability);
                bookList.set(bookList.indexOf(book), newBook);
            }
        });
    }

    public void updateAvailability(String title, boolean availability) {
        Optional<Book> optinalBook = checkAvailability(title);
        if(optinalBook.isPresent()) {
            Book availableBook = optinalBook.get();
            availableBook = new Book(availableBook.title(), availableBook.author(), availableBook.publicationYear(), availability);

            int index = bookList.indexOf(optinalBook.get());
            bookList.set(index, availableBook);
        }
    }

    public void updateAvailabilityV2(String title, boolean availability) {
        bookList.stream().filter(book -> book.title().equals(title))
                .findFirst()
                .map(book -> bookList.set(bookList.indexOf(book), new Book(book.title(), book.author(), book.publicationYear(), availability)));
    }


    public class Second {
        public static void main(String[] args) {
            List<Book> books = new ArrayList<>(Arrays.asList(
                    new Book("Knjiga1", "Autor1", 2000, true),
                    new Book("Knjiga2", "Autor2", 2002, true),
                    new Book("Knjiga3", "Autor3", 2004, false)
            ));

            LibraryCatalog libraryCatalog = new LibraryCatalog(books);

            Optional<Book> myBook = libraryCatalog.getDetailsByAuthor("Autor2");
            Optional<Book> myBook2 = libraryCatalog.getDetailsByAuthor("Autor4");
            System.out.println(myBook.get().title());

            if(myBook2.isPresent()) {
                System.out.println(myBook2);
            } else {
                System.out.println("Book is not present");
            }

            Optional<Book> myBook3 = libraryCatalog.checkAvailability("Knjiga01");
            if(myBook3.isPresent()) {
                System.out.println(myBook3.get());
            } else {
                System.out.println("Not available");
            }

            libraryCatalog.updateAvailabilityV2("Knjiga3", true);
            for(Book b : libraryCatalog.getBookList()) {
                System.out.println(b);
            }
        }
    }
    }

