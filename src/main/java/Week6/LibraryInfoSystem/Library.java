package Week6.LibraryInfoSystem;

import week06.Lab.LibraryInformationSystem.Book;

import java.util.ArrayList;

public class Library {

    private ArrayList<week06.Lab.LibraryInformationSystem.Book> bookList = new ArrayList<>();
    public Library() {

    }

    public void addBook(week06.Lab.LibraryInformationSystem.Book book) {
        bookList.add(book);
    }

    public void printBooks() {
        for(week06.Lab.LibraryInformationSystem.Book book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<week06.Lab.LibraryInformationSystem.Book> searchByPublisher(String publisher) {
        ArrayList<week06.Lab.LibraryInformationSystem.Book> returnList = new ArrayList<>();
        for(week06.Lab.LibraryInformationSystem.Book book : bookList) {
            if (StringUtils.included(book.publisher(), publisher)) { // ide contains() umjesto equals()
                returnList.add(book);
            }
        }
        return returnList;
    }
    public ArrayList<week06.Lab.LibraryInformationSystem.Book> searchByTitle(String title) {
        ArrayList<week06.Lab.LibraryInformationSystem.Book> returnList = new ArrayList<>();
        for(week06.Lab.LibraryInformationSystem.Book book : bookList) {
            if (StringUtils.included(book.title(), title)) {
                returnList.add(book);
            }
        }
        return returnList;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<week06.Lab.LibraryInformationSystem.Book> returnList = new ArrayList<>();
        for(week06.Lab.LibraryInformationSystem.Book book : bookList) {
            if (book.year() == year) {
                returnList.add(book);
            }
        }
        return returnList;
    }
}